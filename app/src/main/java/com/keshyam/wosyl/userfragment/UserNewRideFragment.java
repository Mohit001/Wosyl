package com.keshyam.wosyl.userfragment;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.keshyam.wosyl.R;
import com.keshyam.wosyl.useractivity.ActivityNewRide;

/**
 * Created by Liger on 11/17/2015.
 */
public class UserNewRideFragment extends Fragment implements OnMapReadyCallback, View.OnClickListener
{
    public static String TAG = UserNewRideFragment.class.getSimpleName();

    MapFragment mapFragment;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        View rootView = inflater.inflate(R.layout.fragment_find_nearby_taxi, container, false);
        mapFragment = (MapFragment) getFragmentManager().findFragmentById(R.id.map);
        ((Button) rootView.findViewById(R.id.next_btn)).setOnClickListener(this);
        return rootView;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState)
    {
        super.onActivityCreated(savedInstanceState);
        mapFragment.getMapAsync(this);
    }

    @Override
    public void onMapReady(GoogleMap googleMap)
    {
        // Add a marker in Sydney, Australia, and move the camera.
        LatLng sydney = new LatLng(-34, 151);
        googleMap.addMarker(new MarkerOptions().position(sydney).title("Markerdemo"));
        googleMap.moveCamera(CameraUpdateFactory.newLatLng(sydney));
    }

    @Override
    public void onClick(View v)
    {
        switch (v.getId())
        {
            case R.id.next_btn:
                startActivity(new Intent(getActivity(), ActivityNewRide.class));
                break;
        }
    }
}
