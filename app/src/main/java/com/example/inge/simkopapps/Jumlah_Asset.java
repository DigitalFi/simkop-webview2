package com.example.inge.simkopapps;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Jumlah_Asset extends AppCompatActivity {


    /** Called when the activity is first created. */
    private WebView view; //ini variabel supaya bisa diakses method

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jumlah_asset);


        view = (WebView) this.findViewById(R.id.webView);
        view.getSettings().setJavaScriptEnabled(true);
        view.setWebViewClient(new MyBrowser());
        //ini manggil url web dari webview-nya
        view.loadUrl("https://simkop.digitalfatih.com/mdashboard/chart_asset");
    }

    //ini supaya gak nge-redirect ke browser
    private class MyBrowser extends WebViewClient {
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            view.loadUrl(url);
            return true;
        }

    }
}
