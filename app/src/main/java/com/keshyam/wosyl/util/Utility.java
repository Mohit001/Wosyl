package com.keshyam.wosyl.util;

import android.content.Context;
import android.widget.Toast;

import com.keshyam.wosyl.R;

/**
 * Created by Liger on 05-11-2015.
 */
public class Utility
{

    public static void showAlertMessage(Context mContext, int id)
    {
        Toast.makeText(mContext, mContext.getResources().getString(id), Toast.LENGTH_SHORT).show();
    }

    public static void showAlertMessage(Context mContext, String message)
    {
        Toast.makeText(mContext, message, Toast.LENGTH_SHORT).show();
    }
}
