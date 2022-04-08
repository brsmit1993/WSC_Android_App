package com.wsc.constants;

import java.util.Arrays;

public class DormTypeUtils
{
    public DormType getDormTypeEnum(String dormStr)
    {
        switch (dormStr)
        {
            case "Anderson":
                return DormType.ANDERSON;
            case "Bowen":
                return DormType.BOWEN;
            case "Berry":
                return DormType.BERRY;
            case "Morey":
                return DormType.MOREY;
            case "Neihardt":
                return DormType.NEIHARDT;
            case "Pile":
                return DormType.PILE;
            case "Terrace":
                return DormType.TERRACE;
            default:
                return DormType.NOT_APPLICABLE;
        }
    }

    public String getDormStr(DormType dorm)
    {
        switch (dorm.ordinal())
        {
            case 0:
                return "Anderson";
            case 1:
                return "Berry";
            case 2:
                return "Bowen";
            case 3:
                return "Morey";
            case 4:
                return "Neihardt";
            case 5:
                return "Pile";
            case 6:
                return "Terrace";
            default:
                return "NOT_APPLICABLE";
        }
    }

    public static String[] getNames(Class<? extends Enum<?>> e) {
        return Arrays.toString(e.getEnumConstants()).replaceAll("^.|.$", "").split(", ");
    }
}
