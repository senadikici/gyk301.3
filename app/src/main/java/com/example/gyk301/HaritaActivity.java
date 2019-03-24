package com.example.gyk301;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class HaritaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_harita);
    }

    public void haritaAc(View view) {
        //41.008298, 28.978358
        Uri istanbulunKoordinatları=Uri.parse("geo:41.008298, 28.978358");

        Intent i=new Intent(Intent.ACTION_VIEW);
        i.setData(istanbulunKoordinatları);

        if (i.resolveActivity(getPackageManager()) != null) {
            startActivity(i);
        }

    }
}
