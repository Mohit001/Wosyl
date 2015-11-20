package com.keshyam.wosyl.userfragment;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

import com.keshyam.wosyl.R;
import com.keshyam.wosyl.useractivity.ActivityUserHistoryReview;

/**
 * Created by Liger on 11/19/2015.
 */
public class UserHistoryDetailsFragment extends Fragment implements View.OnClickListener
{
    public static String TAG = UserHistoryDetailsFragment.class.getSimpleName();

    Button reviewButton;
    ImageView backImageView;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        View rootView = inflater.inflate(R.layout.user_history_details_fragment, container, false);
        reviewButton = (Button) rootView.findViewById(R.id.review_btn);
        backImageView = (ImageView) rootView.findViewById(R.id.back_image_btn);
        return rootView;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState)
    {
        super.onActivityCreated(savedInstanceState);

        reviewButton.setOnClickListener(this);
        backImageView.setOnClickListener(this);
    }

    @Override
    public void onClick(View v)
    {

        switch (v.getId())
        {
            case R.id.back_image_btn:
                getActivity().finish();
                break;
            case R.id.review_btn:
//                Utility.showAlertMessage(getActivity(), "Review clicked");
                startActivity(new Intent(getActivity(), ActivityUserHistoryReview.class));
                break;

        }
    }
}
