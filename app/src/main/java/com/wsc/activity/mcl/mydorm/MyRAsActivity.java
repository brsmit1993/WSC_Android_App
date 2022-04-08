package com.wsc.activity.mcl.mydorm;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.wsc.adapter.MyResidentAssitantCardAdapter;
import com.wsc.dto.ResidentAssistantDTO;
import com.wsc.dto.UserDTO;
import com.wsc.main.R;
import com.wsc.services.MyDormServices;

import java.util.ArrayList;

public class MyRAsActivity extends AppCompatActivity {
    private RecyclerView MyRAsRV;

    // Arraylist for storing data
    private ArrayList<ResidentAssistantDTO> myRAsArrayList;
    private MyDormServices raService = new MyDormServices();

    private UserDTO user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.my_ra_recycleview);
        MyRAsRV = findViewById(R.id.idRVEvents);

        user = getIntent().getParcelableExtra("userData");

        // here we have created new array list and added data to it.
        myRAsArrayList = raService.getResidentAssitants(user.getDorm());

        // we are initializing our adapter class and passing our arraylist to it.
        MyResidentAssitantCardAdapter residentAssitantAdapter = new MyResidentAssitantCardAdapter(this, myRAsArrayList);

        // below line is for setting a layout manager for our recycler view.
        // here we are creating vertical list so we will provide orientation as vertical
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);

        // in below two lines we are setting layoutmanager and adapter to our recycler view.
        MyRAsRV.setLayoutManager(linearLayoutManager);
        MyRAsRV.setAdapter(residentAssitantAdapter);
    }
}
