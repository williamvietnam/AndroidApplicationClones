package com.nbgsoftware.gbrains.ui.main;

import com.nbgsoftware.gbrains.baseMVP.MVPContract;

public interface MainContract {
    interface View extends MVPContract.View {

    }

    interface Presenter<V extends View> extends MVPContract.Presenter<V>{

    }
}
