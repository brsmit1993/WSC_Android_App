package com.wsc.services;

import com.wsc.dao.HelpSheetsDAO;
import com.wsc.dto.HelpSheetsDTO;

import java.util.ArrayList;

public class HelpServices
{
    private HelpSheetsDAO helpSheetsDAO = new HelpSheetsDAO();

    public ArrayList<HelpSheetsDTO> getAllHelpsheets()
    {
        return helpSheetsDAO.getAllHelpSheets();
    }
}
