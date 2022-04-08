package com.wsc.dto;

import android.os.Parcel;
import android.os.Parcelable;

import com.wsc.constants.DormType;
import com.wsc.constants.DormTypeUtils;

public class UserDTO implements Parcelable
{
    private String userName;
    private String password;
    private String fName;
    private String lName;
    private String eMail;
    private DormType dorm;

    private DormTypeUtils dormUtils = new DormTypeUtils();

    public UserDTO(String userName, String password, String fName, String lName, String eMail, String dorm)
    {
        this.userName = userName;
        this.password = password;
        this.fName = fName;
        this.lName = lName;
        this.eMail = eMail;
        this.dorm = dormUtils.getDormTypeEnum(dorm);
    }

    public UserDTO(Parcel in){
        String[] data = new String[5];
        in.readStringArray(data);
        // the order needs to be the same as in writeToParcel() method
        this.userName = data[0];
        this.fName = data[1];
        this.lName = data[2];
        this.eMail = data[3];
        this.dorm = dormUtils.getDormTypeEnum(data[4]);
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
                                        this.userName,
                                        this.fName,
                                        this.lName,
                                        this.eMail,
                                        dormUtils.getDormStr(this.dorm)
                                }
                );
    }
    public static final Parcelable.Creator CREATOR = new Parcelable.Creator() {
        public UserDTO createFromParcel(Parcel in) {
            return new UserDTO(in);
        }

        public UserDTO[] newArray(int size) {
            return new UserDTO[size];
        }
    };

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
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

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public String getPassword()
    {
        return password;
    }

    public void setPassword(String password)
    {
        this.password = password;
    }

    public DormType getDorm()
    {
        return this.dorm;
    }
    public void setDorm(DormType dorm)
    {
        this.dorm = dorm;
    }
}
