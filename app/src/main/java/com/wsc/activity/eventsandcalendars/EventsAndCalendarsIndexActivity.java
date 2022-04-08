package com.wsc.activity.eventsandcalendars;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.wsc.activity.help.HelpSheetWebViewActivity;
import com.wsc.dto.UserDTO;
import com.wsc.main.R;

public class EventsAndCalendarsIndexActivity extends AppCompatActivity {

    private Intent intent;
    private UserDTO user;

    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.events_and_calendars);

        intent = getIntent();
        user = intent.getParcelableExtra("userData");
    }

    public void eventsActivity(View view)
    {
        intent.setClass(this, EventsActivity.class);
        startActivity(intent);
    }

    public void getCalendar(View view)
    {
        String root = "file:///android_asset/calendars/";
        String filepath = null;
        switch (view.getId())
        {
            case (R.id.AcademicCalendarBtn):
                filepath = "academic_calendar.html";
                break;
            case (R.id.FinalExamBtn):
                filepath = "finals_schedule.html";
                break;
            case (R.id.RegistrationDatesBtn):
                filepath = "records_and_registrations.html";
                break;
            case (R.id.HolidayScheduleBtn):
                filepath = "holiday_schedule.html";
                break;
        }

        intent.putExtra("urlPath", root + filepath);
        intent.setClass(this, HelpSheetWebViewActivity.class);
        startActivity(intent);
    }


}
