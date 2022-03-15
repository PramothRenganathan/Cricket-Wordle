package com.example.samplemodule;

import android.content.Context;
import android.widget.Toast;

public class SampleModuleActivity {
    public static void init(Context c, String message){

        Toast.makeText(c,message,Toast.LENGTH_SHORT).show();

    }
}
