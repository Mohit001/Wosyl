package com.keshyam.wosyl.useractivity;

import android.app.Activity;
import android.os.Bundle;

import com.keshyam.wosyl.R;
import com.keshyam.wosyl.userfragment.UserCollectDeliveryAddressFragmnet;

/**
 * Created by Mohit on 18-Nov-15.
 */
public class ActivityNewRide extends Activity
{
    public static String TAG = ActivityNewRide.class.getSimpleName();
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_new_ride);

        getFragmentManager()
                .beginTransaction()
                .replace(R.id.newride_content_frame, new UserCollectDeliveryAddressFragmnet(), UserCollectDeliveryAddressFragmnet.TAG)
                .commit();

    }
}
