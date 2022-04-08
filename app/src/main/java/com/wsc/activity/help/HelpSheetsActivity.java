package com.wsc.activity.help;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.wsc.adapter.HelpsheetsCardAdapter;
import com.wsc.dto.HelpSheetsDTO;
import com.wsc.dto.UserDTO;
import com.wsc.main.R;

import com.wsc.services.HelpServices;

import java.util.ArrayList;

public class HelpSheetsActivity extends AppCompatActivity
{
    private RecyclerView helpsheetsRV;

    // Arraylist for storing data
    private ArrayList<HelpSheetsDTO> helpsheetsList;
    private HelpServices helpServices = new HelpServices();

    private Intent intent;
    private UserDTO user;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.helpsheets_recycleview);
        helpsheetsRV = findViewById(R.id.idRVHelpSheets);

        user = getIntent().getParcelableExtra("userData");

        // here we have created new array list and added data to it.
        helpsheetsList = helpServices.getAllHelpsheets();

        // we are initializing our adapter class and passing our arraylist to it.
        HelpsheetsCardAdapter helpsheetsCardAdapter = new HelpsheetsCardAdapter(this, helpsheetsList);

        // below line is for setting a layout manager for our recycler view.
        // here we are creating vertical list so we will provide orientation as vertical
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);

        // in below two lines we are setting layoutmanager and adapter to our recycler view.
        helpsheetsRV.setLayoutManager(linearLayoutManager);
        helpsheetsRV.setAdapter(helpsheetsCardAdapter);

        intent = getIntent();
        user = intent.getParcelableExtra("userData");
        System.out.println(user.getfName());
    }

    public void getWebView(String path)
    {
        intent.putExtra("urlPath", path);
        intent.setClass(this, HelpSheetWebViewActivity.class);
        startActivity(intent);
    }

}
