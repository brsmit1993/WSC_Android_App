package com.wsc.services;

import android.content.Context;
import android.util.Log;
import android.widget.ToggleButton;

import com.wsc.dao.EventDAO;
import com.wsc.dto.EventDTO;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

public class EventsAndCalendarsServices
{
    EventDAO eventDAO = new EventDAO();

    public ArrayList<EventDTO> getEventsByFilter(Context context)
    {
        return eventDAO.getEventsByFilter(getFilterFile(context));
    }

    public void updateFilterFile(Context context, ToggleButton[] toggleButtons) {
        try
        {
            OutputStream fOut = new FileOutputStream(context.getExternalCacheDir() + "/eventfilters.txt");
            OutputStreamWriter osw = new OutputStreamWriter(fOut);
            for(int i = 0; i < 17; i++)
            {
                if(toggleButtons[i].isChecked())
                    osw.write("true\n");
                else
                    osw.write("false\n");
            }
            osw.close();
            fOut.close();

            Log.i("File writing stuff", "success = ");
        }
        catch (IOException ioe)
        {
            ioe.printStackTrace();
        }
    }

    public void createNewFilterFile(Context context) {
        try
        {
            OutputStream fOut = new FileOutputStream(context.getExternalCacheDir() + "/eventfilters.txt");
            OutputStreamWriter osw = new OutputStreamWriter(fOut);
            for(int i = 0; i < 17; i++)
                osw.write("true\n");

            osw.close();
            fOut.close();

            Log.i("File writing stuff", "success = ");
        }
        catch (IOException ioe)
        {
            ioe.printStackTrace();
        }
    }

    public boolean[] getFilterFile(Context context)
    {
        boolean[] filters = new boolean[17];

        try
        {
            File file = new File(context.getExternalCacheDir()+ "/eventfilters.txt");
            FileInputStream fIn = new FileInputStream(file);
            InputStreamReader isr = new InputStreamReader(fIn);
            BufferedReader br = new BufferedReader(isr);

            String line;
            int x = 0;
            while ((line = br.readLine()) != null)
            {
                filters[x] = Boolean.valueOf(line);
                x++;
            }

            br.close();
            isr.close();
            fIn.close();
        }
        catch (IOException ioe)
        {
            createNewFilterFile(context);
            getFilterFile(context);
        }

        return filters;
    }

}
