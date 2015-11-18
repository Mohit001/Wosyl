package com.keshyam.wosyl.userfragment;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.keshyam.wosyl.R;
import com.keshyam.wosyl.util.Utility;

/**
 * Created by Liger on 11/18/2015.
 */
public class UserCollectDeliveryAddressFragmnet extends Fragment implements View.OnClickListener
{

    public static String TAG = UserCollectDeliveryAddressFragmnet.class.getSimpleName();

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        View rootView = inflater.inflate(R.layout.user_collect_delivery_address_fragment, container, false);
        ((Button) rootView.findViewById(R.id.next_btn)).setOnClickListener(this);
        return rootView;

    }

    @Override
    public void onClick(View v)
    {
        switch (v.getId())
        {
            case R.id.next_btn:
                Utility.showAlertMessage(getActivity(), "next clicked");
                break;
        }
    }
}
