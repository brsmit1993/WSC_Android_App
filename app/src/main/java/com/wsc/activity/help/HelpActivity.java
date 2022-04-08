package com.wsc.activity.help;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.wsc.activity.index.CampusMapActivity;
import com.wsc.dto.UserDTO;
import com.wsc.main.R;

public class HelpActivity extends AppCompatActivity {

    private Intent intent;
    private UserDTO user;

    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.help_index);

        intent = getIntent();
        user = intent.getParcelableExtra("userData");
    }

    public void helpsheets(View view)
    {
        intent.setClass(this, HelpSheetsActivity.class);
        startActivity(intent);
    }

    public void importantNumbers(View view)
    {
        intent.setClass(this, ImportantNumbersActivity.class);
        startActivity(intent);
    }

    public void campusDining(View view)
    {

    }

    public void campusMap(View view)
    {
        intent.setClass(this, CampusMapActivity.class);
        startActivity(intent);
    }
}
