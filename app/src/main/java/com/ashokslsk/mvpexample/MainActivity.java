package com.ashokslsk.mvpexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.ashokslsk.mvpexample.model.SignInModel;
import com.ashokslsk.mvpexample.presenter.SignInPresenter;
import com.ashokslsk.mvpexample.view.SigninView;

public class MainActivity extends AppCompatActivity implements SigninView{

    SignInModel signInModel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(getApplicationContext(),"Oncreate Called",Toast.LENGTH_LONG).show();
        signInModel=new SignInModel(MainActivity.this);
        signInModel.signIn("ashok","12345");
    }

    @Override
    public void showValidationError() {
        Toast.makeText(getApplicationContext(),"Validation Error",Toast.LENGTH_LONG).show();
    }

    @Override
    public void signInSuccess() {
        Toast.makeText(getApplicationContext()," Success",Toast.LENGTH_LONG).show();
    }

    @Override
    public void signInError() {
        Toast.makeText(getApplicationContext()," Error",Toast.LENGTH_LONG).show();
    }
}
