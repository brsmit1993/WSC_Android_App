package com.wsc.activity.eventsandcalendars;

import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.wsc.adapter.SocialEventCardAdapter;
import com.wsc.dto.EventDTO;
import com.wsc.dto.UserDTO;
import com.wsc.main.R;
import com.wsc.services.EventsAndCalendarsServices;
import com.wsc.services.MyDormServices;

import java.util.ArrayList;

public class EventsActivity extends AppCompatActivity {
    private RecyclerView eventsRV;

    // Arraylist for storing data
    private ArrayList<EventDTO> eventsArrayList;
    private EventsAndCalendarsServices events = new EventsAndCalendarsServices();

    private Intent intent;
    private UserDTO user;
    private SocialEventCardAdapter socialEventAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.campus_events_recycleview);
        eventsRV = findViewById(R.id.idRVcampusEvents);

        intent = getIntent();
        user = intent.getParcelableExtra("userData");

        // here we have created new array list and added data to it.
        eventsArrayList = events.getEventsByFilter(this);

        // we are initializing our adapter class and passing our arraylist to it.
        socialEventAdapter = new SocialEventCardAdapter(this, eventsArrayList);

        // below line is for setting a layout manager for our recycler view.
        // here we are creating vertical list so we will provide orientation as vertical
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);

        // in below two lines we are setting layoutmanager and adapter to our recycler view.
        eventsRV.setLayoutManager(linearLayoutManager);
        eventsRV.setAdapter(socialEventAdapter);
    }

    public void eventFiltersActivity(View view)
    {
        intent.setClass(this, EventFiltersActivity.class);
        startActivity(intent);
    }

    @Override
    public void onResume()
    {  // After a pause OR at startup
        super.onResume();
        eventsArrayList = events.getEventsByFilter(this);
        socialEventAdapter = new SocialEventCardAdapter(this, eventsArrayList);
        eventsRV.setAdapter(socialEventAdapter);


    }

}
