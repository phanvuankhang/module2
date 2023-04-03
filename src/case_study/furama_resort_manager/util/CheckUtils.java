package case_study.furama_resort_manager.util;

import java.time.LocalDate;
import java.util.FormatterClosedException;

public class CheckUtils {
    public static boolean checkFacilityCode(String str) {
        String regex = "^((SVVL)|(SVHO)|(SVRO))-\\d{4}$";
        return str.matches(regex);
    }

    public static boolean checkName(String str) {
        String regex = "^([A-Z][a-z]+\\s)+([A-Z][a-z]+)$";
        return str.matches(regex);
    }

    public static boolean checkNameService(String str) {
        String regex = "^([A-Z][a-z]+)+([a-z]+\\s)+([a-z]+)$";
        return str.matches(regex);
    }

    public static boolean checkArea(float area) {
        return area > 30;
    }

    public static boolean checkPeopleMaximum(int num) {
        return num < 20 && num > 0;
    }

    public static boolean checkFloorsNumber(int num) {
        return num>=0;
    }

    public static boolean checkRentalCost(float num){
      return num>=0;
    }
    public static boolean checkDate(String str){
        String regex="^(([0-2][0-9])||3[0-1])\\/(([0][0-9])||1[0-2])\\/((19((2[4-9])||([3-9][0-9])))||200[0-5])$";
        return str.matches(regex);
    }
}