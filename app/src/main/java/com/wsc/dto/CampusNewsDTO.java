package com.wsc.dto;

import android.os.Parcel;
import android.os.Parcelable;

public class CampusNewsDTO implements Parcelable
{
    private String newsTitle;
    private String newsDate;
    private int newsImg;
    private String newsContent;

    public CampusNewsDTO(String newsTitle, String newsDate, String newsImg, String newsContent)
    {
        this.newsTitle = newsTitle;
        this.newsDate = newsDate;
        this.newsImg = Integer.valueOf(newsImg);
        this.newsContent = newsContent;
    }

    public CampusNewsDTO(Parcel in)
    {
        String[] data = new String[4];
        in.readStringArray(data);
        // the order needs to be the same as in writeToParcel() method
        this.newsTitle = data[0];
        this.newsDate = data[1];
        this.newsImg = Integer.valueOf(data[2]);
        this.newsContent = data[3];
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
                                        this.newsTitle,
                                        this.newsDate,
                                        String.valueOf(this.newsImg),
                                        this.newsContent
                                }
                );
    }
    public static final Parcelable.Creator CREATOR = new Parcelable.Creator()
    {
        public CampusNewsDTO createFromParcel(Parcel in) {
            return new CampusNewsDTO(in);
        }

        public CampusNewsDTO[] newArray(int size) {
            return new CampusNewsDTO[size];
        }
    };

    public String getNewsTitle() {
        return newsTitle;
    }

    public void setNewsTitle(String newsTitle) {
        this.newsTitle = newsTitle;
    }

    public String getNewsDate() {
        return newsDate;
    }

    public void setNewsDate(String newsDate) {
        this.newsDate = newsDate;
    }

    public int getNewsImg() {
        return newsImg;
    }

    public void setNewsImg(int newsImg) {
        this.newsImg = newsImg;
    }

    public String getNewsContent() {
        return newsContent;
    }

    public void setNewsContent(String newsContent) {
        this.newsContent = newsContent;
    }
}
