package com.nbgsoftware.gbrains.ui.splash

import androidx.lifecycle.MutableLiveData
import com.nbgsoftware.gbrains.base.MVVMViewModel
import com.nbgsoftware.gbrains.data.models.Splash

class SplashViewModel : MVVMViewModel() {

    private val splash: Splash =
        Splash("Gbrains Organization", "Cùng nhau học tập và chia sẻ kiến thức")

    val title = MutableLiveData<String>()
    val description = MutableLiveData<String>()

    init {
        title.postValue(splash.title)
        description.postValue(splash.description)
    }
}