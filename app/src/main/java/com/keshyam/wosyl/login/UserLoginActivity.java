package com.keshyam.wosyl.login;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.keshyam.wosyl.R;
import com.keshyam.wosyl.userhome.UserMainActivity;
import com.keshyam.wosyl.usersignup.UserSignupActivity;
import com.keshyam.wosyl.util.Utility;

public class UserLoginActivity extends AppCompatActivity implements View.OnClickListener
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.user_login_activity);

        findViewById(R.id.login_btn).setOnClickListener(this);
        findViewById(R.id.create_account).setOnClickListener(this);
        findViewById(R.id.need_help).setOnClickListener(this);
    }

    @Override
    public void onClick(View v)
    {
        switch (v.getId())
        {
            case R.id.login_btn:
//                Utility.showAlertMessage(this, "Login clicked");
                startActivity(new Intent(this, UserMainActivity.class));
                break;

            case R.id.create_account:
                Utility.showAlertMessage(this, "Create Account clicked");
                startActivity(new Intent(this, UserSignupActivity.class));
                break;

            case R.id.need_help:
                Utility.showAlertMessage(this, "Help clicked");
                break;
        }
    }
}
