package com.wsc.services;

import com.wsc.dao.CampusNewsDAO;
import com.wsc.dto.CampusNewsDTO;


import java.util.ArrayList;

public class CampusNewsServices
{
    private CampusNewsDAO campusNewsDAO = new CampusNewsDAO();

    public ArrayList<CampusNewsDTO> getAllCampusNews()
    {
        return campusNewsDAO.getAllCampusNews();
    }
}
