package com.example.gyk301;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class SmsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sms);
    }

    public void smsGonder(View view) {
        EditText phoneNumber=(EditText)findViewById(R.id.editText2);
        String telefonNumarasi=phoneNumber.getText().toString();

        EditText mesajEditText=(EditText)findViewById(R.id.editText);
        String mesaj=mesajEditText.getText().toString();

        Uri uri= Uri.parse("smsto:" + telefonNumarasi);
        Intent i=new Intent(Intent.ACTION_SENDTO,uri);

        i.putExtra("sms_body",mesaj);
        startActivity(i);

    }
}
