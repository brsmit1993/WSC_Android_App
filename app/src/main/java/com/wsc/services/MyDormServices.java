package com.wsc.services;

import com.wsc.constants.DormType;
import com.wsc.dao.DormRegulationDAO;
import com.wsc.dao.ResidentAssistantDAO;
import com.wsc.dao.EventDAO;
import com.wsc.dto.DormRegulationDTO;
import com.wsc.dto.ResidentAssistantDTO;
import com.wsc.dto.EventDTO;

import java.util.ArrayList;

public class MyDormServices
{
    private EventDAO eventDAO = new EventDAO();
    private ResidentAssistantDAO residentAssistantDAO = new ResidentAssistantDAO();
    private DormRegulationDAO dormRegulationDAO = new DormRegulationDAO();

    public ArrayList<EventDTO> getSocailEventsByDorm(DormType dorm)
    {
        return eventDAO.getSocialEventDTOsByDorm(dorm);
    }

    public ArrayList<ResidentAssistantDTO> getResidentAssitants(DormType dorm)
    {
        return residentAssistantDAO.getResidentAssitantsByDorm(dorm);
    }

    public ArrayList<DormRegulationDTO> getDormRegulations()
    {
        return dormRegulationDAO.getDormRegulations();
    }
}
