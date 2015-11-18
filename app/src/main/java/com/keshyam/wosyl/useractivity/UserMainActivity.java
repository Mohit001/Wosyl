package com.keshyam.wosyl.useractivity;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;

import com.keshyam.wosyl.R;
import com.keshyam.wosyl.userfragment.UserNewRideFragment;
import com.keshyam.wosyl.util.Utility;

import cn.tovi.CustomMenu;

public class UserMainActivity extends Activity implements View.OnClickListener
{
    private static final String TAG = UserMainActivity.class.getSimpleName();

    CustomMenu customMenu;

    ImageView leftMenuImageView, currantLocationImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);

        Window window = getWindow();
        window.setFlags(
                WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS, WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
        window.setFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_NAVIGATION,
                WindowManager.LayoutParams.FLAG_TRANSLUCENT_NAVIGATION);

        customMenu = new CustomMenu(this);
        customMenu.setContentView(R.layout.userhome_activity);
        setContentView(customMenu);

        customMenu.setLeftShadow(R.drawable.shadow_left);
        customMenu.setLeftMenu(R.layout.nav_header_main);


        ((ImageView) findViewById(R.id.left_menu)).setOnClickListener(this);
        ((ImageView) findViewById(R.id.currant_location)).setOnClickListener(this);
        ((TextView) findViewById(R.id.home_lbl)).setOnClickListener(this);
        ((TextView) findViewById(R.id.pending_lbl)).setOnClickListener(this);
        ((TextView) findViewById(R.id.setting_lbl)).setOnClickListener(this);
        ((TextView) findViewById(R.id.logout_lbl)).setOnClickListener(this);

        getFragmentManager()
                .beginTransaction()
                .replace(R.id.content_frame, new UserNewRideFragment(), UserNewRideFragment.TAG)
                .commit();

    }


    @Override
    public void onClick(View v)
    {
        switch (v.getId())
        {
            case R.id.left_menu:
//                Utility.showAlertMessage(this, "Left Menu click");
                leftMenu();
                break;
            case R.id.currant_location:
                Utility.showAlertMessage(this, "Location click");
                break;
            case R.id.home_lbl:
                Utility.showAlertMessage(this, "home click");
                customMenu.closeMenu();
                break;
            case R.id.pending_lbl:
                Utility.showAlertMessage(this, "pending click");
                customMenu.closeMenu();
                break;
            case R.id.setting_lbl:
                Utility.showAlertMessage(this, "setting click");
                customMenu.closeMenu();
                break;
            case R.id.logout_lbl:
                Utility.showAlertMessage(this, "logout click");
                customMenu.closeMenu();
                break;

        }
    }

    private void leftMenu()
    {
        if (customMenu.getState() == CustomMenu.State.CLOSE_MENU)
        {
            customMenu.openLeftMenuIfPossible();
        } else if (customMenu.getState() == CustomMenu.State.LEFT_MENU_OPENS)
        {
            customMenu.closeMenu();
        } else
        {
            Log.e(TAG, "CustomMenu State:" + customMenu.getState());
        }
    }
}
