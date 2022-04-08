package com.wsc.dao;

import com.wsc.dto.UserDTO;

import java.util.ArrayList;

public class UserDAO
{
    public UserDTO findUserByUsername(String username)
    {
        FakeDBUser fakeData = new FakeDBUser();
        ArrayList<FakeDBUser> data = fakeData.getData();


        for(int i = 0; i < data.size(); i++)
        {
            if(data.get(i).getUserName().equalsIgnoreCase(username))
            {
                FakeDBUser user = data.get(i);
                return new UserDTO(user.userName, user.password, user.fName, user.lName, user.eMail, user.dorm);
            }
        }

        return null;
    }

    class FakeDBUser
    {
        private String userName;
        private String password;
        private String fName;
        private String lName;
        private String eMail;
        private String dorm;

        private ArrayList<FakeDBUser> data;

        public FakeDBUser()
        {
            generateFakeData();
        }
        public FakeDBUser(String userName, String password, String fName, String lName, String eMail, String dorm)
        {
            this.userName = userName;
            this.password = password;
            this.fName = fName;
            this.lName = lName;
            this.eMail = eMail;
            this.dorm = dorm;
        }

        public void generateFakeData()
        {
            data = new ArrayList<FakeDBUser>();
            data.add(new FakeDBUser("admin", "admin", "Brandon","Smith","brsmit09@wsc.edu","Morey"));
            data.add(new FakeDBUser("anHall01", "admin", "AnHall","User","anHall01@wsc.edu","Anderson"));
            data.add(new FakeDBUser("beHall01", "admin", "BeHall","User","beHall01@wsc.edu","Berry"));
            data.add(new FakeDBUser("boHall01", "admin", "BoHall","User","boHall01@wsc.edu","Bowen"));
            data.add(new FakeDBUser("moHall01", "admin", "MoHall","User","moHall01@wsc.edu","Morey"));
            data.add(new FakeDBUser("neHall01", "admin", "NeHall","User","neHall01@wsc.edu","Neihardt"));
            data.add(new FakeDBUser("piHall01", "admin", "PiHall","User","piHall01@wsc.edu","Pile"));
            data.add(new FakeDBUser("teHall01", "admin", "TeHall","User","TeHall01@wsc.edu","Terrace"));
            data.add(new FakeDBUser("ofHall01", "admin", "OfHall","User","OfHall01@wsc.edu","OffCampus"));
        }

        public String getUserName() {
            return userName;
        }

        public String getPassword() {
            return password;
        }

        public String getfName() {
            return fName;
        }

        public String getlName() {
            return lName;
        }

        public String geteMail() {
            return eMail;
        }

        public String getDorm() {
            return dorm;
        }

        public ArrayList<FakeDBUser> getData()
        {
            return data;
        }
    }
}
