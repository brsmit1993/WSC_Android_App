package com.wsc.activity.campusnews;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.wsc.adapter.CampusNewsCardAdapter;

import com.wsc.dto.CampusNewsDTO;

import com.wsc.dto.UserDTO;
import com.wsc.main.R;
import com.wsc.services.CampusNewsServices;

import java.util.ArrayList;

public class CampusNewsActivity extends AppCompatActivity {
    private RecyclerView campusNewsRV;

    // Arraylist for storing data
    private ArrayList<CampusNewsDTO> newsArrayList;
    private CampusNewsServices newsServices = new CampusNewsServices();

    private UserDTO user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.campusnews_recycleview);
        campusNewsRV = findViewById(R.id.idRVCampusNews);

        user = getIntent().getParcelableExtra("userData");

        // here we have created new array list and added data to it.
        newsArrayList = newsServices.getAllCampusNews();

        // we are initializing our adapter class and passing our arraylist to it.
        CampusNewsCardAdapter campusNewsCardAdapter = new CampusNewsCardAdapter(this, newsArrayList);

        // below line is for setting a layout manager for our recycler view.
        // here we are creating vertical list so we will provide orientation as vertical
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);

        // in below two lines we are setting layoutmanager and adapter to our recycler view.
        campusNewsRV.setLayoutManager(linearLayoutManager);
        campusNewsRV.setAdapter(campusNewsCardAdapter);
    }
}
