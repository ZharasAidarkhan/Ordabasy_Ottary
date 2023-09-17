package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.auth.FirebaseAuth;

public class Web extends AppCompatActivity {

    private WebView web;
    private Button logout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web);

        web = (WebView) findViewById(R.id.webView);
        WebSettings ws = web.getSettings();
        ws.setJavaScriptEnabled(true);
        web.loadUrl("https://ordabasy-ottary.kz/");
        web.setWebViewClient(new WebViewClient());
    }

    @Override
    public void onBackPressed() {
        if (web.canGoBack()) {
            web.goBack();
        } else
            super.onBackPressed();
    }

    public void news(View view) {
        Intent intent = new Intent(Web.this, Web.class);
        startActivity(intent);
    }

    public void Profile(View view) {
        Intent intent = new Intent(Web.this, Profile.class);
        startActivity(intent);
    }

    public void logout(View view) {

        logout = (Button) findViewById(R.id.button_logout);

        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FirebaseAuth.getInstance().signOut();
                startActivity(new Intent(Web.this, Login.class));
            }
        });
    }
}