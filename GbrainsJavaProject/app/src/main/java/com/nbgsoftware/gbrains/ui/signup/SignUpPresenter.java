package com.nbgsoftware.gbrains.ui.signup;

import com.nbgsoftware.gbrains.baseMVP.MVPPresenter;

import javax.inject.Inject;

public class SignUpPresenter<V extends SignUpContract.View>
        extends MVPPresenter<V> implements SignUpContract.Presenter<V> {

    @Inject
    public SignUpPresenter(){
        super();
    }
}
