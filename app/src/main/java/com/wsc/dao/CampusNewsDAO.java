package com.wsc.dao;




import com.wsc.dto.CampusNewsDTO;
import com.wsc.main.R;

import java.util.ArrayList;

public class CampusNewsDAO
{
    private FakeDBCampusNews fakeData;
    private ArrayList<FakeDBCampusNews> fakeDataSet;

    public CampusNewsDAO()
    {
        fakeData = new FakeDBCampusNews();
        fakeDataSet = fakeData.dataSet;

    }

    public ArrayList<CampusNewsDTO> getAllCampusNews()
    {
        ArrayList<CampusNewsDTO> campusNewsDTOS = new ArrayList<CampusNewsDTO>();

        for(int i = 0; i < fakeDataSet.size(); i++)
        {
            FakeDBCampusNews news = fakeDataSet.get(i);
            campusNewsDTOS.add(new CampusNewsDTO(news.newsTitle, news.newsDate, news.newsImg, news.newsContent));
        }

        return campusNewsDTOS;
    }

    class FakeDBCampusNews
    {
        private String newsTitle;
        private String newsDate;
        private String newsImg;
        private String newsContent;


        private ArrayList<FakeDBCampusNews> dataSet;

        public FakeDBCampusNews()
        {
            generateFakeData();
        }

        public FakeDBCampusNews(String newsTitle, String newsDate, String newsImg, String newsContent)
        {
            this.newsTitle = newsTitle;
            this.newsDate = newsDate;
            this.newsImg = newsImg;
            this.newsContent = newsContent;
        }

        public void generateFakeData()
        {
            dataSet = new ArrayList<FakeDBCampusNews>();
            dataSet.add(new FakeDBCampusNews("Fake Title 01", "Jan 01, 2090", String.valueOf(R.drawable.ranull),"Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. "));
            dataSet.add(new FakeDBCampusNews("Fake Title 02", "Jan 01, 2090", String.valueOf(R.drawable.ranull),"Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. "));
            dataSet.add(new FakeDBCampusNews("Fake Title 03", "Jan 01, 2090", String.valueOf(R.drawable.ranull),"Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. "));
            dataSet.add(new FakeDBCampusNews("Fake Title 04", "Jan 01, 2090", String.valueOf(R.drawable.ranull),"Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. "));
            dataSet.add(new FakeDBCampusNews("Fake Title 05", "Jan 01, 2090", String.valueOf(R.drawable.ranull),"Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. "));
            dataSet.add(new FakeDBCampusNews("Fake Title 06", "Jan 01, 2090", String.valueOf(R.drawable.ranull),"Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. "));

        }
    }
}
