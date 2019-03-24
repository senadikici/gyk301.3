package com.example.gyk301;

import android.app.ProgressDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;

public class WebSiteActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_site);

        WebView vw=(WebView)findViewById(R.id.webview);
        vw.getSettings().getJavaScriptEnabled();
        vw.loadUrl("https://gelecegiyazanlar.turkcell.com.tr");

        final ProgressDialog progress=ProgressDialog.show(this,"geleceği yazanlar","yükleniyor",true);
        progress.show();
        vw.setWebViewClient(new WebViewClient() {
            @Override
            public void onPageFinished(WebView view, String url) {
                super.onPageFinished(view, url);
                Toast.makeText(getApplicationContext(),"sayfa yuklendi",Toast.LENGTH_SHORT).show();
                progress.dismiss();
            }
            public void onReceivedError(WebView view,int errorCode,String description,String failinUrl) {
                Toast.makeText(getApplicationContext(),"Bir hata olustu",Toast.LENGTH_SHORT).show();
                progress.dismiss();
            }
        });
        }
    }

