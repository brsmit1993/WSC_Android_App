package com.wsc.dao;

import com.wsc.constants.DormType;
import com.wsc.constants.DormTypeUtils;
import com.wsc.dto.ResidentAssistantDTO;
import com.wsc.main.R;

import java.util.ArrayList;

public class ResidentAssistantDAO
{

    private FakeDBResidentAssistant fakeData;
    private ArrayList<FakeDBResidentAssistant> fakeDataSet;
    private DormTypeUtils dormUtils;

    public ResidentAssistantDAO()
    {
        fakeData = new FakeDBResidentAssistant();
        fakeDataSet = fakeData.dataSet;
        dormUtils = new DormTypeUtils();
    }

    public ArrayList<ResidentAssistantDTO> getResidentAssitantsByDorm(DormType dorm)
    {
        ArrayList<ResidentAssistantDTO> residentAssistantDTOArrayList = new ArrayList<ResidentAssistantDTO>();

        for(int i = 0; i < fakeDataSet.size(); i++)
        {
            if(fakeDataSet.get(i).dorm.equals(dormUtils.getDormStr(dorm)))
            {
                FakeDBResidentAssistant ra = fakeDataSet.get(i);
                residentAssistantDTOArrayList.add(new ResidentAssistantDTO(ra.dorm, ra.fName, ra.lName, ra.roomNum, ra.aboutRA, ra.raImg));
            }
        }

        return residentAssistantDTOArrayList;
    }
    class FakeDBResidentAssistant
    {
        private String dorm;
        private String fName;
        private String lName;
        private String roomNum;
        private String aboutRA;
        private String raImg;

        private ArrayList<FakeDBResidentAssistant> dataSet;

        public FakeDBResidentAssistant()
        {
            generateFakeData();
        }

        public FakeDBResidentAssistant(String dorm, String fName, String lName, String roomNum, String aboutRA, String raImg)
        {
            this.dorm = dorm;
            this.fName = fName;
            this.lName = lName;
            this.roomNum = roomNum;
            this.aboutRA = aboutRA;
            this.raImg = raImg;
        }

        public void generateFakeData()
        {
            dataSet = new ArrayList<FakeDBResidentAssistant>();
            for (int i = 0; i < 5; i++)
            {
                dataSet.add(new FakeDBResidentAssistant("Anderson", "Anderson","ResidentAssistant 0" + i,"200","Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. ", String.valueOf(R.drawable.ranull)));
                dataSet.add(new FakeDBResidentAssistant("Berry", "Berry","ResidentAssistant 0" + i,"200","Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. ", String.valueOf(R.drawable.ranull)));
                dataSet.add(new FakeDBResidentAssistant("Bowen", "Bowen","ResidentAssistant 0" + i,"200","Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. ", String.valueOf(R.drawable.ranull)));
                dataSet.add(new FakeDBResidentAssistant("Morey", "Morey","ResidentAssistant 0" + i,"200","Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. ",  String.valueOf(R.drawable.ranull)));
                dataSet.add(new FakeDBResidentAssistant("Neihardt", "Neihardt","ResidentAssistant 0" + i,"200","Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. ", String.valueOf(R.drawable.ranull)));
                dataSet.add(new FakeDBResidentAssistant("Pile", "Pile","Resident Assistant 0" + i,"200","Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. ", String.valueOf(R.drawable.ranull)));
                dataSet.add(new FakeDBResidentAssistant("Terrace", "Terrace","ResidentAssistant 0" + i,"200","Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. ", String.valueOf(R.drawable.ranull)));
            }
        }
    }
}
