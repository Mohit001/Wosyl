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
 * Created by Mohit on 18-Nov-15.
 */
public class OrderVericicationFragment extends Fragment implements View.OnClickListener
{

    public static String TAG = OrderVericicationFragment.class.getSimpleName();

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        View rootView = inflater.inflate(R.layout.user_order_confirmation_fragment, container, false);
        ((Button) rootView.findViewById(R.id.next_btn)).setOnClickListener(this);
        ((ImageView) rootView.findViewById(R.id.back_image_btn)).setOnClickListener(this);
        return rootView;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState)
    {
        super.onActivityCreated(savedInstanceState);
    }

    @Override
    public void onClick(View view)
    {
        switch (view.getId())
        {
            case R.id.next_btn:
                Utility.showAlertMessage(getActivity(), "Order Place successfully");
                break;
            case R.id.back_image_btn:
                getFragmentManager()
                        .beginTransaction()
                        .replace(R.id.newride_content_frame, new AssignDriverFragmnet(), AssignDriverFragmnet.TAG)
                        .commit();
                break;
        }
    }
}
