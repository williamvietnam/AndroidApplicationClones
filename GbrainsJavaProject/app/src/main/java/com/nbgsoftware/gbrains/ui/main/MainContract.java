package com.nbgsoftware.gbrains.ui.main;

import com.nbgsoftware.gbrains.base.BaseContract;

public interface MainContract {
    interface View extends BaseContract.View {

    }

    interface Presenter<V extends View> extends BaseContract.Presenter<V>{

    }
}
