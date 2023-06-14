package com.sk.directudharsdk;

import android.content.Context;
import android.widget.Toast;

public class FirstActivity {
    public static void ShowToast(Context context,String massage){
        Toast.makeText(context, massage, Toast.LENGTH_SHORT).show();
    }
}
