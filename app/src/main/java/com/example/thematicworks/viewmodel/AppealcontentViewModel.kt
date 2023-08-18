package com.example.thematicworks.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.thematicworks.model.Appeal

class AppealcontentViewModel : ViewModel() {
    val appeal: MutableLiveData<Appeal> by lazy { MutableLiveData<Appeal>() }
    val menu: MutableLiveData<List<String>>
            by lazy {
                MutableLiveData<List<String>>(
                    listOf(
                        "第五十五條-1,在交岔路口十公尺內臨時停車", "第四十八條,轉彎或變換車道不依標誌、標線、號誌指示" +
                                "第四十二條,汽車駕駛人未依規定使用方向燈", "第五十五條-4,併排臨時停車", "第四十條,汽車駕駛人行車速度，超過規定之最高時速或低於規定之最低時速"
                    )
                )
            }
}