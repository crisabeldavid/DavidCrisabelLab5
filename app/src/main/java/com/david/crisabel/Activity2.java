package com.david.crisabel;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Activity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity2);
        Intent i = new Intent(this, MyService.class);
        startService(i);
    }

    public void toAct1 (View v) {
        Intent i = new Intent(this,Activity1.class);
        startActivity(i);
    }

    public void processMap2(View v) {
        Intent i = null, chooser = null;
        if (v.getId() == R.id.btnMap2) {
            i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse("geo:14.558412,120.9837223"));
            chooser = Intent.createChooser(i,"Select map app:");
            startActivity(chooser);
        }
    }
}
