package com.keshyam.wosyl.usersignup;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;

import com.keshyam.wosyl.R;
import com.keshyam.wosyl.util.Utility;

/**
 * Created by Liger on 05-11-2015.
 */
public class UserSignupActivity extends Activity implements View.OnClickListener
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.user_signup_activity);

        findViewById(R.id.next_btn).setOnClickListener(this);
        findViewById(R.id.terms_and_condition).setOnClickListener(this);
        findViewById(R.id.signup_back).setOnClickListener(this);
    }

    @Override
    public void onClick(View v)
    {
        switch (v.getId())
        {
            case R.id.next_btn:

                String nameString  = ((EditText)findViewById(R.id.signup_name_txt)).getText().toString().trim();
                if(TextUtils.isEmpty(nameString))
                {
                    Utility.showAlertMessage(this, R.string.empty_name);
                    return;
                }

                String emailString = ((EditText)findViewById(R.id.signup_email_txt)).getText().toString().trim();
                if(TextUtils.isEmpty(emailString))
                {
                    Utility.showAlertMessage(this, R.string.empty_email);
                    return;
                }

                String passwordString  = ((EditText)findViewById(R.id.signup_password_txt)).getText().toString().trim();
                if(TextUtils.isEmpty(passwordString))
                {
                    Utility.showAlertMessage(this, R.string.empty_password);
                    return;
                }

                String confrimPasswordString  = ((EditText)findViewById(R.id.signup_confirm_password_txt)).getText().toString().trim();
                if(TextUtils.isEmpty(confrimPasswordString))
                {
                    Utility.showAlertMessage(this, R.string.empty_confirm_pwd);
                    return;
                }

                if(!passwordString.equalsIgnoreCase(confrimPasswordString))
                {
                    Utility.showAlertMessage(this, R.string.confirm_pwd_not_match);
                    return;
                }

                startActivity(new Intent(this, PhoneVerificationActivity.class));
                break;

            case R.id.terms_and_condition:
                Utility.showAlertMessage(this, "t&c clicked");
                break;
            case R.id.signup_back:
                this.finish();
                break;
        }

    }
}
