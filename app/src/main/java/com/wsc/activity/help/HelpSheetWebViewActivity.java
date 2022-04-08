package com.wsc.activity.help;

import android.content.Intent;
import android.os.Bundle;

import android.webkit.WebView;

import androidx.appcompat.app.AppCompatActivity;

import com.wsc.dto.UserDTO;
import com.wsc.main.R;

public class HelpSheetWebViewActivity extends AppCompatActivity {

    private Intent intent;
    private UserDTO user;

    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.helpsheet_webview);

        intent = getIntent();
        user = intent.getParcelableExtra("userData");

        WebView webView = findViewById(R.id.helpsheetsWebView);
        webView.getSettings().setAllowFileAccess(true);
        webView.loadUrl(intent.getStringExtra("urlPath"));
    }



}
