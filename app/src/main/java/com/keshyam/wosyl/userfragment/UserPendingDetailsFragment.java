package com.keshyam.wosyl.userfragment;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.keshyam.wosyl.R;
import com.keshyam.wosyl.util.Utility;

/**
 * Created by Liger on 11/19/2015.
 */
public class UserPendingDetailsFragment extends Fragment implements View.OnClickListener
{
    public static String TAG = UserPendingDetailsFragment.class.getSimpleName();
    ImageView callImageView, messageImageView, trackImageView, cancelImageView;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        View rootView = inflater.inflate(R.layout.user_pending_details_fragment, container, false);
        callImageView = (ImageView) rootView.findViewById(R.id.call_image);
        messageImageView = (ImageView) rootView.findViewById(R.id.message_image);
        trackImageView = (ImageView) rootView.findViewById(R.id.currant_location_image);
        cancelImageView = (ImageView) rootView.findViewById(R.id.cancel_request_image);

        return rootView;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState)
    {
        super.onActivityCreated(savedInstanceState);

        callImageView.setOnClickListener(this);
        messageImageView.setOnClickListener(this);
        trackImageView.setOnClickListener(this);
        cancelImageView.setOnClickListener(this);
    }

    @Override
    public void onClick(View v)
    {

        switch (v.getId())
        {
            case R.id.call_image:
                Utility.showAlertMessage(getActivity(), "Call driver");
                break;
            case R.id.message_image:
                Utility.showAlertMessage(getActivity(), "message driver");
                break;
            case R.id.currant_location_image:
                Utility.showAlertMessage(getActivity(), "track currant location");
                break;
            case R.id.cancel_request_image:
                Utility.showAlertMessage(getActivity(), "Cancel request");
                break;

        }
    }
}
