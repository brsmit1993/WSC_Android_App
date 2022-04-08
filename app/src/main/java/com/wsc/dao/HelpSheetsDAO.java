package com.wsc.dao;

import com.wsc.dto.HelpSheetsDTO;

import java.util.ArrayList;

public class HelpSheetsDAO
{
    private FakeDBHelpSheets fakeData;
    private ArrayList<FakeDBHelpSheets> fakeDataSet;

    public HelpSheetsDAO()
    {
        fakeData = new FakeDBHelpSheets();
        fakeDataSet = fakeData.dataSet;

    }

    public ArrayList<HelpSheetsDTO> getAllHelpSheets()
    {
        ArrayList<HelpSheetsDTO> helpSheetsDTOS = new ArrayList<HelpSheetsDTO>();

        for(int i = 0; i < fakeDataSet.size(); i++)
        {
            FakeDBHelpSheets dr = fakeDataSet.get(i);
            helpSheetsDTOS.add(new HelpSheetsDTO(dr.helpsheetTitle, dr.helpsheetPath));
        }

        return helpSheetsDTOS;
    }

    class FakeDBHelpSheets
    {
        private String helpsheetTitle;
        private String helpsheetPath;


        private ArrayList<FakeDBHelpSheets> dataSet;

        public FakeDBHelpSheets()
        {
            generateFakeData();
        }

        public FakeDBHelpSheets(String helpsheetTitle, String helpsheetPath)
        {
            this.helpsheetTitle = helpsheetTitle;
            this.helpsheetPath = helpsheetPath;
        }

        public void generateFakeData()
        {
            dataSet = new ArrayList<FakeDBHelpSheets>();
            String rootpath = "file:///android_asset/helpsheets/";

            dataSet.add(new FakeDBHelpSheets("Access 1098-T Form on WildcatsOnline", rootpath + "access_1098_t_on_wildcatsonline.html"));
            dataSet.add(new FakeDBHelpSheets("Browse Course Catalog", rootpath + "browse_course_catalog.html"));
            dataSet.add(new FakeDBHelpSheets("Campus Cable Channel Lineup", rootpath + "campus_cable_channel_lineup.html"));
            dataSet.add(new FakeDBHelpSheets("Copying Using PaperCut", rootpath + "copying_using_papercut.html"));
            dataSet.add(new FakeDBHelpSheets("Degree Audit", rootpath + "degree_audit.html"));
            dataSet.add(new FakeDBHelpSheets("Device Registration", rootpath + "device_registration.html"));
            dataSet.add(new FakeDBHelpSheets("Directory Information", rootpath + "directory_information.html"));
            dataSet.add(new FakeDBHelpSheets("Drop a Class", rootpath + "drop_a_class.html"));
            dataSet.add(new FakeDBHelpSheets("File Organization Tips", rootpath + "file_organization_tips.html"));
            dataSet.add(new FakeDBHelpSheets("Financial Aid", rootpath + "financial_aid.html"));
            dataSet.add(new FakeDBHelpSheets("Get Connected - Chromebook or Android", rootpath + "get_connected_chromebook_or_android.html"));
            dataSet.add(new FakeDBHelpSheets("Get Connected - iOS Device", rootpath + "get_connected_ios_device.html"));
            dataSet.add(new FakeDBHelpSheets("Get Connected - Mac", rootpath + "get_connected_mac.html"));
            dataSet.add(new FakeDBHelpSheets("Get Connected - Windows", rootpath + "get_connected_windows.html"));
            dataSet.add(new FakeDBHelpSheets("How to Clear Internet Browser Cache, Cookies, History", rootpath + "how_to_clear_internet_browser_cache_cookies_history.html"));
            dataSet.add(new FakeDBHelpSheets("Locate your device's MAC (or physical) address", rootpath + "locate_your_devices_mac_or_physical_address.html"));
            dataSet.add(new FakeDBHelpSheets("Lost Username or Password", rootpath + "lost_username_or_password.html"));
            dataSet.add(new FakeDBHelpSheets("M365 FAQs", rootpath + "m365_faqs.html"));
            dataSet.add(new FakeDBHelpSheets("Office Install - Mobile Device", rootpath + "office_install_mobile_device.html"));
            dataSet.add(new FakeDBHelpSheets("Office Install - Personal Computer", rootpath + "office_install_personal_computer.html"));
            dataSet.add(new FakeDBHelpSheets("Outlook", rootpath + "outlook.html"));
            dataSet.add(new FakeDBHelpSheets("Outlook - Mobile Device", rootpath + "outlook_mobile_device.html"));
        }
    }
}
