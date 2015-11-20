package com.keshyam.wosyl.useractivity;

import android.app.Activity;
import android.os.Bundle;

import com.keshyam.wosyl.R;
import com.keshyam.wosyl.userfragment.UserHistoryDetailsFragment;

/**
 * Created by Liger on 11/19/2015.
 */
public class ActivityUserHistory extends Activity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_ride);

        getFragmentManager()
                .beginTransaction()
                .replace(R.id.newride_content_frame, new UserHistoryDetailsFragment(), UserHistoryDetailsFragment.TAG)
                .commit();
    }
}
