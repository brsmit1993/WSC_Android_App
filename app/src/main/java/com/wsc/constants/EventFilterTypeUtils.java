package com.wsc.constants;

import java.util.Arrays;

public class EventFilterTypeUtils
{
    public EventFilterType getEventFilterTypeUtils(String dormStr)
    {
        switch (dormStr)
        {

            case "ACADEMIC":
                return EventFilterType.ACADEMIC;
            case "ALUMNI_FOUNDATION":
                return EventFilterType.ALUMNI_FOUNDATION;
            case "ART_EXHIBITS":
                return EventFilterType.ART_EXHIBITS;
            case "CAREER_JOBS":
                return EventFilterType.CAREER_JOBS;
            case "CONFERENCE_WORKSHOPS":
                return EventFilterType.CONFERENCE_WORKSHOPS;
            case "FITNESS_RECREATION":
                return EventFilterType.FITNESS_RECREATION;
            case "HEALTH_WELLNESS":
                return EventFilterType.HEALTH_WELLNESS;
            case "HOLIDAY_SEASONAL":
                return EventFilterType.HOLIDAY_SEASONAL;
            case "LITERATURE_FILM":
                return EventFilterType.LITERATURE_FILM;
            case "MUSIC_PERFORMANCES":
                return EventFilterType.MUSIC_PERFORMANCES;
            case "PLANETARIUM_SHOWS":
                return EventFilterType.PLANETARIUM_SHOWS;
            case "SERVICE_VOLUNTEER":
                return EventFilterType.SERVICE_VOLUNTEER;
            case "SOCIAL_EVENTS":
                return EventFilterType.SOCIAL_EVENTS;
            case "SPEAKERS_PANELS":
                return EventFilterType.SPEAKERS_PANELS;
            case "SPECIAL_INTEREST":
                return EventFilterType.SPECIAL_INTEREST;
            case "THEATRE_PERFORMANCES":
                return EventFilterType.THEATRE_PERFORMANCES;
            case "TOURS_VISITS":
                return EventFilterType.TOURS_VISITS;
            default:
                return EventFilterType.NO_FILTER;
        }
    }

    public String getEventFilterTypeUtils(EventFilterType eventFilter)
    {
        switch (eventFilter.ordinal())
        {
            case 0:
                return "ACADEMIC";
            case 1:
                return "ALUMNI_FOUNDATION";
            case 2:
                return "ART_EXHIBITS";
            case 3:
                return "CAREER_JOBS";
            case 4:
                return "CONFERENCE_WORKSHOPS";
            case 5:
                return "FITNESS_RECREATION";
            case 6:
                return "HEALTH_WELLNESS";
            case 7:
                return "HOLIDAY_SEASONAL";
            case 8:
                return "LITERATURE_FILM";
            case 9:
                return "MUSIC_PERFORMANCES";
            case 10:
                return "PLANETARIUM_SHOWS";
            case 11:
                return "SERVICE_VOLUNTEER";
            case 12:
                return "SOCIAL_EVENTS";
            case 13:
                return "SPEAKERS_PANELS";
            case 14:
                return "SPECIAL_INTEREST";
            case 15:
                return "THEATRE_PERFORMANCES";
            case 16:
                return "TOURS_VISITS";
            default:
                return "N0_FILTER";
        }
    }

    public static String[] getNames(Class<? extends Enum<?>> e) {
        return Arrays.toString(e.getEnumConstants()).replaceAll("^.|.$", "").split(", ");
    }
}
