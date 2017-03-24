package com.example.donavan.visaulfusion;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;

public class LoginActivty extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_layout);
        this.getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
    }

    public void Login(View view) {
        Intent intent = new Intent(LoginActivty.this, RepHomeActivity.class );

        startActivity(intent);
    }

    public void TssLogin(View view) {

        Intent intent = new Intent(LoginActivty.this, TssHome.class );
        startActivity(intent);
    }

    public void WareHouseLogin(View view) {

        Intent intent = new Intent(LoginActivty.this, WareHouseHomeActivity.class );
        startActivity(intent);
    }

    public void InstLogin(View view) {

        Intent intent = new Intent(LoginActivty.this, InstilationHome.class );
        startActivity(intent);
    }

    public void ManagmentLogin(View view) {

        Intent intent = new Intent(LoginActivty.this, ManagementHome.class );
        startActivity(intent);

    }



    public void EableLogin(View view) {
        Intent intent = new Intent(LoginActivty.this, EablManagementHome.class );
        startActivity(intent);
    }
}
