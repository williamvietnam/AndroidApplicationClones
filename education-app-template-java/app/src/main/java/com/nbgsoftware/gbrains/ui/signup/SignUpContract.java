package com.nbgsoftware.gbrains.ui.signup;

import com.nbgsoftware.gbrains.baseMVP.MVPContract;

public interface SignUpContract {
    interface View extends MVPContract.View {

    }

    interface Presenter<V extends View> extends MVPContract.Presenter<V>{

    }
}
