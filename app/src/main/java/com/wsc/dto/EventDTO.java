package com.wsc.dto;

import android.os.Parcel;
import android.os.Parcelable;

import com.wsc.constants.DormType;
import com.wsc.constants.DormTypeUtils;

public class EventDTO implements Parcelable
{
    private DormTypeUtils dormUtils = new DormTypeUtils();

    private DormType dorm;
    private String eventName;
    private String eventTime;
    private String eventDate;
    private String eventLocation;
    private String eventDescription;
    private int eventImage;

    public EventDTO(String dorm, String eventName, String eventTime, String eventDate, String eventLocation, String eventDescription, String eventImage)
    {
        this.dorm = dormUtils.getDormTypeEnum(dorm);
        this.eventName = eventName;
        this.eventTime = eventTime;
        this.eventDate = eventDate;
        this.eventLocation = eventLocation;
        this.eventDescription = eventDescription;
        this.eventImage = Integer.valueOf(eventImage);
    }

    public EventDTO(Parcel in){
        String[] data = new String[6];
        in.readStringArray(data);
        // the order needs to be the same as in writeToParcel() method
        this.dorm = dormUtils.getDormTypeEnum(data[0]);
        this.eventTime = data[1];
        this.eventDate = data[2];
        this.eventLocation = data[3];
        this.eventDescription = data[4];
        this.eventImage = Integer.valueOf(data[5]);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeStringArray
                (
                        new String[]
                                {
                                        dormUtils.getDormStr(this.dorm),
                                        this.eventTime,
                                        this.eventDate,
                                        this.eventLocation,
                                        this.eventDescription,
                                        String.valueOf(eventImage)
                                }
                );
    }
    public static final Parcelable.Creator CREATOR = new Parcelable.Creator() {
        public EventDTO createFromParcel(Parcel in) {
            return new EventDTO(in);
        }

        public EventDTO[] newArray(int size) {
            return new EventDTO[size];
        }
    };

    public DormType getDorm() {
        return dorm;
    }

    public void setDorm(DormType dorm) {
        this.dorm = dorm;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public String getEventTime() {
        return eventTime;
    }

    public void setEventTime(String eventTime) {
        this.eventTime = eventTime;
    }

    public String getEventDate() {
        return eventDate;
    }

    public void setEventDate(String eventDate) {
        this.eventDate = eventDate;
    }

    public String getEventLocation() {
        return eventLocation;
    }

    public void setEventLocation(String eventLocation) {
        this.eventLocation = eventLocation;
    }

    public String getEventDescription() {
        return eventDescription;
    }

    public void setEventDescription(String eventDescription) {
        this.eventDescription = eventDescription;
    }

    public int getEventImage()
    {
        return eventImage;
    }

    public void setEventImage(int eventImage) {
        this.eventImage = eventImage;
    }
}
