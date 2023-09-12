package com.example.thematicworks.controller

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.Toast
import androidx.fragment.app.viewModels
import androidx.lifecycle.ViewModel
import androidx.navigation.Navigation
import com.example.thematicworks.viewmodel.AppealcontentViewModel
import com.example.thematicworks.R
import com.example.thematicworks.Service.Server.Companion.urlFineAppeal
import com.example.thematicworks.databinding.FragmentAppealcontentBinding
import com.google.gson.Gson
import com.google.gson.JsonObject
import org.json.JSONArray
import org.json.JSONObject
import tw.idv.william.androidwebserver.core.service.requestTask

class AppealcontentFragment : Fragment() {



    private lateinit var binding: FragmentAppealcontentBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val viewModel :AppealcontentViewModel by viewModels()
        binding = FragmentAppealcontentBinding.inflate(inflater,container,false)
        binding.viewModel=viewModel
        binding.lifecycleOwner=this
        return binding.root
           }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
with(binding) {
    val onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
        override fun onItemSelected(
            parent: AdapterView<*>?,
            view: View?,
            position: Int,
            id: Long
        ) {

            val selectedValue = parent?.getItemAtPosition(position).toString()
            viewModel?.appeal?.value?.regulations = selectedValue

        }

        override fun onNothingSelected(parent: AdapterView<*>?) {
        }
    }

formmenu.setSelection(0,true)
            formmenu.onItemSelectedListener=onItemSelectedListener


goout.setOnClickListener {

//    val APPeal = viewModel.appeal.value
//    val gson = Gson()
//    var jsonObject = JsonObject()
//    jsonObject.addProperty("appeal", gson.toJson(APPeal))
//    val respBody = requestTask<JsonObject>(urlFineAppeal, "POST", jsonObject.toString())
//    respBody?.run {
//        if (get("successful").asBoolean) {
            Navigation.findNavController(it).navigate(R.id.appealFragment)
            Toast.makeText(requireContext(), "申訴成功", Toast.LENGTH_SHORT).show()
      //  }
//    }我把上傳到Server端的部分註解掉,以方便直接執行

}
}
    }
}