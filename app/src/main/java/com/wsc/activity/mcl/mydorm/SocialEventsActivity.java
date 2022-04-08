package com.wsc.activity.mcl.mydorm;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.wsc.adapter.SocialEventCardAdapter;
import com.wsc.dto.EventDTO;
import com.wsc.dto.UserDTO;
import com.wsc.main.R;
import com.wsc.services.MyDormServices;

import java.util.ArrayList;

public class SocialEventsActivity extends AppCompatActivity {
    private RecyclerView eventsRV;

    // Arraylist for storing data
    private ArrayList<EventDTO> eventsArrayList;
    private MyDormServices events = new MyDormServices();

    private UserDTO user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dormevent_recycleview);
        eventsRV = findViewById(R.id.idRVEvents);

        user = getIntent().getParcelableExtra("userData");

        // here we have created new array list and added data to it.
        eventsArrayList = events.getSocailEventsByDorm(user.getDorm());

        // we are initializing our adapter class and passing our arraylist to it.
        SocialEventCardAdapter socialEventAdapter = new SocialEventCardAdapter(this, eventsArrayList);

        // below line is for setting a layout manager for our recycler view.
        // here we are creating vertical list so we will provide orientation as vertical
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);

        // in below two lines we are setting layoutmanager and adapter to our recycler view.
        eventsRV.setLayoutManager(linearLayoutManager);
        eventsRV.setAdapter(socialEventAdapter);
    }
}
