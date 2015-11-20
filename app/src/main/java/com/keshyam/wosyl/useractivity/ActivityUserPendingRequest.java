package com.keshyam.wosyl.useractivity;

import android.os.Bundle;

import com.keshyam.wosyl.R;
import com.keshyam.wosyl.userfragment.UserPendingDetailsFragment;

/**
 * Created by Liger on 11/19/2015.
 */
public class ActivityUserPendingRequest extends ActivityNewRide
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_ride);

        getFragmentManager()
                .beginTransaction()
                .replace(R.id.newride_content_frame, new UserPendingDetailsFragment(), UserPendingDetailsFragment.TAG)
                .commit();
    }
}
