package com.nbgsoftware.gbrains.base

import androidx.lifecycle.ViewModel
import com.nbgsoftware.gbrains.utilities.SingleLiveEvent

abstract class MVVMViewModel : ViewModel() {
    var dataLoadingEvent: SingleLiveEvent<Int> = SingleLiveEvent()
}