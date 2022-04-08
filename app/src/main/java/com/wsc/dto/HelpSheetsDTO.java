package com.wsc.dto;
import android.os.Parcel;
import android.os.Parcelable;

public class HelpSheetsDTO implements Parcelable
{
    private String helpsheetTitle;
    private String helpsheetPath;

    public HelpSheetsDTO(String helpsheetTitle, String helpsheetPath) {
        this.helpsheetTitle = helpsheetTitle;
        this.helpsheetPath = helpsheetPath;
    }

    public HelpSheetsDTO(Parcel in)
    {
        String[] data = new String[2];
        in.readStringArray(data);
        // the order needs to be the same as in writeToParcel() method
        this.helpsheetTitle = data[0];
        this.helpsheetPath = data[1];
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
                                        this.helpsheetTitle,
                                        this.helpsheetPath
                                }
                );
    }
    public static final Parcelable.Creator CREATOR = new Parcelable.Creator()
    {
        public HelpSheetsDTO createFromParcel(Parcel in) {
            return new HelpSheetsDTO(in);
        }

        public HelpSheetsDTO[] newArray(int size) {
            return new HelpSheetsDTO[size];
        }
    };

    public String getHelpsheetTitle() {
        return helpsheetTitle;
    }

    public void setHelpsheetTitle(String helpsheetTitle) {
        this.helpsheetTitle = helpsheetTitle;
    }

    public String getHelpsheetPath() {
        return helpsheetPath;
    }

    public void setHelpsheetPath(String helpsheetPath) {
        this.helpsheetPath = helpsheetPath;
    }
}
