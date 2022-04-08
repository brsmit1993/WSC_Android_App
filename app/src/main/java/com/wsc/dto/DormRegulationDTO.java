package com.wsc.dto;

import android.os.Parcel;
import android.os.Parcelable;

public class DormRegulationDTO implements Parcelable
{
    private String regTitle;
    private String regDesc;

    public DormRegulationDTO(String regTitle, String regDesc) {
        this.regTitle = regTitle;
        this.regDesc = regDesc;
    }

    public DormRegulationDTO(Parcel in)
    {
        String[] data = new String[2];
        in.readStringArray(data);
        // the order needs to be the same as in writeToParcel() method
        this.regTitle = data[0];
        this.regDesc = data[1];
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
                                        this.regTitle,
                                        this.regDesc
                                }
                );
    }
    public static final Parcelable.Creator CREATOR = new Parcelable.Creator()
    {
        public DormRegulationDTO createFromParcel(Parcel in) {
            return new DormRegulationDTO(in);
        }

        public DormRegulationDTO[] newArray(int size) {
            return new DormRegulationDTO[size];
        }
    };

    public String getRegTitle() {
        return regTitle;
    }

    public void setRegTitle(String regTitle) {
        this.regTitle = regTitle;
    }

    public String getRegDesc() {
        return regDesc;
    }

    public void setRegDesc(String regDesc) {
        this.regDesc = regDesc;
    }
}
