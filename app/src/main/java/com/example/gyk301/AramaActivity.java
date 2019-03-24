package com.example.gyk301;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class AramaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_arama);
    }

    public void aramaYap(View view) {
        EditText editText=(EditText)findViewById(R.id.editText3);
        String phoneNumber=editText.getText().toString();

        Intent intent=new Intent(Intent.ACTION_DIAL);
        intent.setData(Uri.parse("tel:" +phoneNumber));
        if(intent.resolveActivity(getPackageManager()) != null){
            startActivity(intent);
        }
    }
}
