package com.wsc.activity.index;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.wsc.activity.campusnews.CampusNewsActivity;
import com.wsc.activity.help.HelpActivity;
import com.wsc.activity.mcl.MCLActivity;
import com.wsc.dto.UserDTO;
import com.wsc.main.R;

public class IndexActivity extends AppCompatActivity {

    private Intent intent;
    private UserDTO user;

    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_index);

        intent = getIntent();
        user = intent.getParcelableExtra("userData");
        System.out.println(user.getfName());

    }

    public void myCampusLife(View view)
    {
        intent.setClass(this, MCLActivity.class);
        startActivity(intent);
    }

    public void campusNews(View view)
    {
        intent.setClass(this, CampusNewsActivity.class);
        startActivity(intent);
    }

    public void helpAndFaq(View view)
    {
        intent.setClass(this, HelpActivity.class);
        startActivity(intent);
    }
}
