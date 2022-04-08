package com.wsc.dto;

import android.os.Parcel;
import android.os.Parcelable;

import com.wsc.constants.DormType;
import com.wsc.constants.DormTypeUtils;


public class ResidentAssistantDTO implements Parcelable
{
    private DormTypeUtils dormUtils = new DormTypeUtils();


    private DormType dorm;
    private String fName;
    private String lName;
    private String roomNum;
    private String aboutRA;
    private int raImg;

    public ResidentAssistantDTO(String dorm, String fName, String lName, String roomNum, String aboutRA, String raImg)
    {
        this.dorm = dormUtils.getDormTypeEnum(dorm);;
        this.fName = fName;
        this.lName = lName;
        this.roomNum = roomNum;
        this.aboutRA = aboutRA;
        this.raImg = Integer.valueOf(raImg);
    }

    public ResidentAssistantDTO(Parcel in)
    {
        String[] data = new String[5];
        in.readStringArray(data);
        // the order needs to be the same as in writeToParcel() method
        this.dorm = dormUtils.getDormTypeEnum(data[0]);
        this.fName = data[1];
        this.lName = data[2];
        this.roomNum = data[3];
        this.aboutRA = data[4];
        this.raImg = Integer.valueOf(data[5]);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags)
    {
        dest.writeStringArray
                (
                        new String[]
                                {
                                        dormUtils.getDormStr(this.dorm),
                                        this.fName,
                                        this.lName,
                                        this.roomNum,
                                        this.aboutRA,
                                        String.valueOf(raImg)
                                }
                );
    }
    public static final Parcelable.Creator CREATOR = new Parcelable.Creator()
    {
        public ResidentAssistantDTO createFromParcel(Parcel in) {
            return new ResidentAssistantDTO(in);
        }

        public ResidentAssistantDTO[] newArray(int size) {
            return new ResidentAssistantDTO[size];
        }
    };

    public DormType getDorm() {
        return dorm;
    }

    public void setDorm(DormType dorm) {
        this.dorm = dorm;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public String getRoomNum() {
        return roomNum;
    }

    public void setRoomNum(String roomNum) {
        this.roomNum = roomNum;
    }

    public String getAboutRA() {
        return aboutRA;
    }

    public void setAboutRA(String aboutRA) {
        this.aboutRA = aboutRA;
    }

    public int getRaImg() {
        return raImg;
    }

    public void setRaImg(int raImg) {
        this.raImg = raImg;
    }
}
