package com.keshyam.wosyl.usersignup;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;

import com.keshyam.wosyl.R;
import com.keshyam.wosyl.util.Utility;

public class SMSVerificationActivity extends AppCompatActivity implements View.OnClickListener
{


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sms_verification);
        findViewById(R.id.next_btn).setOnClickListener(this);
        findViewById(R.id.back_image_btn).setOnClickListener(this);
    }

    @Override
    public void onClick(View v)
    {
        switch (v.getId())
        {
            case R.id.back_image_btn:
                this.finish();
                break;
            case R.id.next_btn:
                String phoneNumberString = ((EditText) findViewById(R.id.signup_confirm_sms_txt)).getText().toString().trim();

                if(TextUtils.isEmpty(phoneNumberString))
                {
                    Utility.showAlertMessage(this, R.string.empty_sms_code);
                }
                Utility.showAlertMessage(this, "register successfully");
                this.finish();
                break;
        }

    }
}
