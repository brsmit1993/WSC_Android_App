package com.wsc.activity.mcl.mydorm;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.wsc.main.R;

public class MyDormActivity extends AppCompatActivity
{
    private Intent intent;


    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.my_dorm);

        intent = getIntent();
    }

    public void socialEvents(View view)
    {
        intent.setClass(this, SocialEventsActivity.class);
        startActivity(intent);
    }

    public void myRAs(View view)
    {
        intent.setClass(this, MyRAsActivity.class);
        startActivity(intent);
    }

    public void dormRules(View view)
    {
        intent.setClass(this,DormRulesActivity.class);
        startActivity(intent);
    }
}
