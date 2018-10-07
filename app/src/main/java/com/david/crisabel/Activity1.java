package com.david.crisabel;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Activity1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity1);
        Intent i = new Intent(this, MyService.class);
        startService(i);
    }

    public void toAct2 (View v) {
        Intent i = new Intent(this,Activity2.class);
        startActivity(i);
    }

    public void processMap1(View v) {
        Intent i = null, chooser = null;
        if (v.getId() == R.id.btnMap1) {
            i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse("geo:14.6033696,120.971152"));
            chooser = Intent.createChooser(i,"Select map app:");
            startActivity(chooser);
        }
    }
}
