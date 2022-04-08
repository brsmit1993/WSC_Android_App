package com.wsc.activity.mcl;

import android.app.SearchManager;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.res.ResourcesCompat;

import com.wsc.activity.eventsandcalendars.EventsAndCalendarsIndexActivity;
import com.wsc.activity.main.MainActivity;
import com.wsc.activity.mcl.mydorm.MyDormActivity;
import com.wsc.constants.DormType;
import com.wsc.dto.UserDTO;
import com.wsc.main.R;

import java.util.List;

public class MCLActivity extends AppCompatActivity
{
    private Intent intent;
    private UserDTO user;

    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.my_campus_life);
        ImageButton dormBtn = findViewById(R.id.myDormBtn);

        intent = getIntent();
        user = intent.getParcelableExtra("userData");

        setDormBtnBackground(user.getDorm(), dormBtn);
    }

   public void myDorm(View view)
   {
       intent.setClass(this, MyDormActivity.class);
       startActivity(intent);
   }

   //TODO: fix error when app doesn't exist
    public void myClasses(View view)
    {
        startNewActivity(getApplicationContext(), "com.instructure.candroid", "com.instructure.student.activity.LoginActivity");
    }

    public void startNewActivity(Context context, String packageName, String cls)
    {

        Intent intent = new Intent();
        intent.setComponent(new ComponentName(packageName, cls));
        startActivity(intent);
        if (intent == null)
        {
            // Bring user to the market or let them choose an app?
            intent = new Intent(Intent.ACTION_VIEW);
            intent.setData(Uri.parse("market://details?id=" + packageName));
        }
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        context.startActivity(intent);
    }

    public void eventsAndCalendars(View view)
    {
        intent.setClass(this, EventsAndCalendarsIndexActivity.class);
        startActivity(intent);
    }

    public void setDormBtnBackground(DormType dorm, ImageButton dormBtn)
    {
        if(dorm.equals(DormType.ANDERSON))
            dormBtn.setBackground(ResourcesCompat.getDrawable(getResources(), R.drawable.anderson_hall, null));
        else if(dorm.equals(DormType.BERRY))
            dormBtn.setBackground(ResourcesCompat.getDrawable(getResources(), R.drawable.berry_hall, null));
        else if(dorm.equals(DormType.BOWEN))
            dormBtn.setBackground(ResourcesCompat.getDrawable(getResources(), R.drawable.bowen_hall, null));
        else if(dorm.equals(DormType.MOREY))
            dormBtn.setBackground(ResourcesCompat.getDrawable(getResources(), R.drawable.morey_hall, null));
        else if(dorm.equals(DormType.NEIHARDT))
            dormBtn.setBackground(ResourcesCompat.getDrawable(getResources(), R.drawable.neihardt_hall, null));
        else if(dorm.equals(DormType.PILE))
            dormBtn.setBackground(ResourcesCompat.getDrawable(getResources(), R.drawable.pile_hall, null));
        else if(dorm.equals(DormType.TERRACE))
            dormBtn.setBackground(ResourcesCompat.getDrawable(getResources(), R.drawable.terrace_hall, null));
    }
}
