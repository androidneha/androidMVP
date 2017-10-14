package com.ashokslsk.mvpexample.model;

import android.text.TextUtils;
import android.widget.Toast;

import com.ashokslsk.mvpexample.presenter.SignInPresenter;
import com.ashokslsk.mvpexample.view.SigninView;

/**
 * Created by Developer-1 on 10/14/2017.
 */

public class SignInModel implements SignInPresenter {

    private SigninView view;
    public SignInModel(SigninView signinView)
    {
        this.view=signinView;
    }
    @Override
    public void signIn(String Username, String password) {
        if(TextUtils.isEmpty(Username) || TextUtils.isEmpty(password))
        {
            view.showValidationError();
        }
        else
        {
            if(Username.equals("aashok") && password.equals("12345"))
            {
                view.signInSuccess();
            }
            else {
                view.signInError();
            }
        }
    }
}
