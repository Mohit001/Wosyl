package com.keshyam.wosyl.usersignup;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;

import com.keshyam.wosyl.R;
import com.keshyam.wosyl.util.Utility;

public class PhoneVerificationActivity extends AppCompatActivity implements View.OnClickListener
{


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phone_verification);
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
                String phoneNumberString = ((EditText) findViewById(R.id.signup_confirm_phone_number_txt)).getText().toString().trim();

                if(TextUtils.isEmpty(phoneNumberString))
                {
                    Utility.showAlertMessage(this, R.string.empty_phone_number);
                }
                startActivity(new Intent(this, SMSVerificationActivity.class));
                break;
        }



    }
}
