package com.wsc.activity.eventsandcalendars;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Environment;
import android.util.Log;
import android.view.View;
import android.widget.Toast;
import android.widget.ToggleButton;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.common.util.IOUtils;
import com.wsc.activity.help.HelpSheetWebViewActivity;
import com.wsc.dto.UserDTO;
import com.wsc.main.R;
import com.wsc.services.EventsAndCalendarsServices;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.nio.charset.StandardCharsets;

public class EventFiltersActivity extends AppCompatActivity {

    private Intent intent;
    private UserDTO user;

    private EventsAndCalendarsServices eventsServices = new EventsAndCalendarsServices();

    private ToggleButton[] toggleButtons;

    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.event_filters);

         toggleButtons = new ToggleButton[]{this.findViewById(R.id.AcademicToggle), this.findViewById(R.id.AlumniToggle), findViewById(R.id.ArtToggle), findViewById(R.id.CareerToggle), findViewById(R.id.ConferenceToggle),
                findViewById(R.id.FitnessToggle), findViewById(R.id.healthToggle), findViewById(R.id.HolidayToggle), findViewById(R.id.LiteratureFilmToggle), findViewById(R.id.MusicToggle), findViewById(R.id.PlanetariumToggle), findViewById(R.id.ServiceToggle),
                findViewById(R.id.SocialToggle), findViewById(R.id.SpeakersToggle), findViewById(R.id.SpecialInterestToggle), findViewById(R.id.TheatreToggle), findViewById(R.id.ToursToggle)};


        boolean[] filters = eventsServices.getFilterFile(this);

        intent = getIntent();
        user = intent.getParcelableExtra("userData");

        for(int i = 0; i < toggleButtons.length; i++)
            toggleButtons[i].setChecked(filters[i]);
    }


    public void saveChanges(View view)
    {
        eventsServices.updateFilterFile(this, toggleButtons);
        intent.setClass(this, EventsActivity.class);
        startActivity(intent);
    }

    @Override
    public void onBackPressed() {
        eventsServices.updateFilterFile(this, toggleButtons);
        super.onBackPressed();
    }

}
