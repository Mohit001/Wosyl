package com.keshyam.wosyl.userfragment;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

import com.keshyam.wosyl.R;
import com.keshyam.wosyl.util.Utility;

/**
 * Created by Liger on 11/18/2015.
 */
public class AssignDriverFragmnet extends Fragment implements View.OnClickListener
{

    public static String TAG = AssignDriverFragmnet.class.getSimpleName();

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        View rootView = inflater.inflate(R.layout.assign_driver_fragment, container, false);
        ((Button) rootView.findViewById(R.id.next_btn)).setOnClickListener(this);
        ((Button) rootView.findViewById(R.id.no_btn)).setOnClickListener(this);
        ((ImageView) rootView.findViewById(R.id.back_image_btn)).setOnClickListener(this);

        return rootView;

    }

    @Override
    public void onClick(View v)
    {
        switch (v.getId())
        {
            case R.id.next_btn:
//                Utility.showAlertMessage(getActivity(), "next clicked");
                getFragmentManager()
                        .beginTransaction()
                        .replace(R.id.newride_content_frame, new OrderVericicationFragment(), OrderVericicationFragment.TAG)
                        .commit();
                break;
            case R.id.no_btn:
                Utility.showAlertMessage(getActivity(), "Reassign Driver");
                break;
            case R.id.back_image_btn:
                getFragmentManager()
                        .beginTransaction()
                        .replace(R.id.newride_content_frame, new UserCollectDeliveryAddressFragmnet(), UserCollectDeliveryAddressFragmnet.TAG)
                        .commit();
                break;
        }
    }
}
