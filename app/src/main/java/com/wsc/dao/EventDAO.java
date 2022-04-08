package com.wsc.dao;

import com.wsc.constants.DormType;
import com.wsc.constants.DormTypeUtils;
import com.wsc.constants.EventFilterType;
import com.wsc.constants.EventFilterTypeUtils;
import com.wsc.dto.EventDTO;
import com.wsc.main.R;

import java.util.ArrayList;

public class EventDAO
{
    private FakeDBEvents fakeData;
    private ArrayList<FakeDBEvents> fakeDataSet;
    private DormTypeUtils dormUtils;
    private EventFilterTypeUtils filterUtils;

    public EventDAO()
    {
        fakeData = new FakeDBEvents();
        fakeDataSet = fakeData.dataSet;
        dormUtils = new DormTypeUtils();
        filterUtils = new EventFilterTypeUtils();
    }

    /**
     *
     *
     * @param dorm determines which events returned in list
     * @return list of events based on dorm
     */
    public ArrayList<EventDTO> getSocialEventsByDorm(DormType dorm)
    {
        ArrayList<EventDTO> eventsArrayList = new ArrayList<EventDTO>();

        for(int i = 0; i < fakeDataSet.size(); i++)
        {
            if(fakeDataSet.get(i).dorm.equals(dormUtils.getDormStr(dorm)))
            {
                FakeDBEvents event = fakeDataSet.get(i);
                eventsArrayList.add(new EventDTO(event.dorm, event.eventName, event.eventTime, event.eventDate, event.eventLocation, event.eventDescription, event.eventImage));
            }
        }

        return eventsArrayList;
    }

    public ArrayList<EventDTO> getSocialEventDTOsByDorm(DormType dorm)
    {
        ArrayList<EventDTO> eventsArrayList = new ArrayList<EventDTO>();

        for(int i = 0; i < fakeDataSet.size(); i++)
        {
            if(fakeDataSet.get(i).dorm.equals(dormUtils.getDormStr(dorm)))
            {
                FakeDBEvents event = fakeDataSet.get(i);
                eventsArrayList.add(new EventDTO(event.dorm, event.eventName, event.eventTime, event.eventDate, event.eventLocation, event.eventDescription, event.eventImage));
            }
        }

        return eventsArrayList;
    }

    public ArrayList<EventDTO> getEventsByFilter(boolean[] filters)
    {
        ArrayList<EventDTO> eventsArrayList = new ArrayList<EventDTO>();
        String[] filterTypes = filterUtils.getNames(EventFilterType.class);

        for(int i = 0; i < fakeDataSet.size(); i++)
        {
            for(int x = 0; x < filters.length; x++)
            {
                if(fakeDataSet.get(i).eventFilter.equals(filterTypes[x]))
                {
                    if(filters[x])
                    {
                        FakeDBEvents event = fakeDataSet.get(i);
                        eventsArrayList.add(new EventDTO(event.dorm, event.eventName, event.eventTime, event.eventDate, event.eventLocation, event.eventDescription, event.eventImage));
                    }
                }

            }
        }
        return eventsArrayList;
    }


    //TODO: make this match userDAO
    class FakeDBEvents
    {
        private String eventFilter;
        private String eventName;
        private String eventTime;
        private String eventDate;
        private String eventLocation;
        private String eventDescription;
        private String eventImage;
        private String dorm;

        private ArrayList<FakeDBEvents> dataSet;

        public FakeDBEvents()
        {
            generateFakeData();
        }

        public FakeDBEvents(String eventFilter, String eventName, String eventTime, String eventDate, String eventLocation, String eventDescription, String eventImage,String dorm )
        {
            this.eventFilter = eventFilter;
            this.eventName = eventName;
            this.eventTime = eventTime;
            this.eventDate = eventDate;
            this.eventLocation = eventLocation;
            this.eventDescription = eventDescription;
            this.eventImage = eventImage;
            this.dorm = dorm;
        }

        public void generateFakeData()
        {
            dataSet = new ArrayList<FakeDBEvents>();
            for (int i = 1; i < 11; i++)
            {
                dataSet.add(new FakeDBEvents("null", "Morey Event 0" + i, "11:00am - 2:00pm", "Janurary 20th, 2022", "Morey Hall Lobby", "This is a super awesome event yeah!", String.valueOf(R.drawable.sports_btn), "Morey"));
                dataSet.add(new FakeDBEvents("null", "Anderson Event 0" + i, "11:00am - 2:00pm", "Janurary 20th, 2022", "Anderson Hall Lobby", "This is a super awesome event yeah!", String.valueOf(R.drawable.sports_btn), "Anderson"));
                dataSet.add(new FakeDBEvents("null", "Berry Event 0" + i, "11:00am - 2:00pm", "Janurary 20th, 2022", "Berry Hall Lobby", "This is a super awesome event yeah!", String.valueOf(R.drawable.sports_btn), "Berry"));
                dataSet.add(new FakeDBEvents("null", "Bowen Event 0" + i, "11:00am - 2:00pm", "Janurary 20th, 2022", "Bowen Hall Lobby", "This is a super awesome event yeah!", String.valueOf(R.drawable.sports_btn), "Bowen"));
                dataSet.add(new FakeDBEvents("null", "Neihardt Event 0" + i, "11:00am - 2:00pm", "Janurary 20th, 2022", "Neihardt Hall Lobby", "This is a super awesome event yeah!", String.valueOf(R.drawable.sports_btn), "Neihardt"));
                dataSet.add(new FakeDBEvents("null", "Pile Event 0" + i, "11:00am - 2:00pm", "Pile 20th, 2022", "Pile Hall Lobby", "This is a super awesome event yeah!", String.valueOf(R.drawable.sports_btn), "Pile"));
                dataSet.add(new FakeDBEvents("null", "Terrace Event 0" + i, "11:00am - 2:00pm", "Janurary 20th, 2022", "Terrace Hall Lobby", "This is a super awesome event yeah!", String.valueOf(R.drawable.sports_btn), "Terrace"));
                dataSet.add(new FakeDBEvents("ACADEMIC", "ACADEMIC Event 0" + i, "11:00am - 2:00pm", "Janurary 20th, 2022", "Student Center, Frey Conference Room", "This is a super awesome event yeah!", String.valueOf(R.drawable.sports_btn), "null"));
                dataSet.add(new FakeDBEvents("ALUMNI_FOUNDATION", "ALUMNI_FOUNDATION Event 0" + i, "11:00am - 2:00pm", "Janurary 20th, 2022", "Student Center, Frey Conference Room", "This is a super awesome event yeah!", String.valueOf(R.drawable.sports_btn), "null"));
                dataSet.add(new FakeDBEvents("ART_EXHIBITS", "ART_EXHIBITS Event 0" + i, "11:00am - 2:00pm", "Janurary 20th, 2022", "Student Center, Frey Conference Room", "This is a super awesome event yeah!", String.valueOf(R.drawable.sports_btn), "null"));
                dataSet.add(new FakeDBEvents("CAREER_JOBS", "CAREER_JOBS Event 0" + i, "11:00am - 2:00pm", "Janurary 20th, 2022", "Student Center, Frey Conference Room", "This is a super awesome event yeah!", String.valueOf(R.drawable.sports_btn), "null"));
                dataSet.add(new FakeDBEvents("CONFERENCE_WORKSHOPS", "CONFERENCE_WORKSHOPS Event 0" + i, "11:00am - 2:00pm", "Janurary 20th, 2022", "Student Center, Frey Conference Room", "This is a super awesome event yeah!", String.valueOf(R.drawable.sports_btn), "null"));
                dataSet.add(new FakeDBEvents("FITNESS_RECREATION", "FITNESS_RECREATION Event 0" + i, "11:00am - 2:00pm", "Janurary 20th, 2022", "Student Center, Frey Conference Room", "This is a super awesome event yeah!", String.valueOf(R.drawable.sports_btn), "null"));
                dataSet.add(new FakeDBEvents("HEALTH_WELLNESS", "HEALTH_WELLNESS Event 0" + i, "11:00am - 2:00pm", "Janurary 20th, 2022", "Student Center, Frey Conference Room", "This is a super awesome event yeah!", String.valueOf(R.drawable.sports_btn), "null"));
                dataSet.add(new FakeDBEvents("HOLIDAY_SEASONAL", "HOLIDAY_SEASONAL Event 0" + i, "11:00am - 2:00pm", "Janurary 20th, 2022", "Student Center, Frey Conference Room", "This is a super awesome event yeah!", String.valueOf(R.drawable.sports_btn), "null"));
                dataSet.add(new FakeDBEvents("LITERATURE_FILM", "LITERATURE_FILM Event 0" + i, "11:00am - 2:00pm", "Janurary 20th, 2022", "Student Center, Frey Conference Room", "This is a super awesome event yeah!", String.valueOf(R.drawable.sports_btn), "null"));

            }
        }
    }
}
