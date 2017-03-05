package RegularExpression;

import javax.xml.crypto.Data;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by pei on 2017/3/3.
 */
public class Validation {

    public static String matchResult(String regex, String CharSequence){
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(CharSequence);
        if(matcher.find()){
            return matcher.group(0);
        }
        return null;
    }

    // test the first character of a string is uppercase or not.
    public static Boolean validateFirstChar(String str){
        String regex = "^[a-z]";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(str);
        if(matcher.find()){
            return true;
        }
        return false;
    }

    //check the credit card
    public static String checkCreditCard(String cardNum) {
        String regex = "^(\\d{4}-){3}\\d{4}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(cardNum);
        if(matcher.find()){
            return matcher.group(0);
        }
        return null;
    }

    //matches e-mail addresses.
    public static String matachEmailAd(String emailAd) {
        //ypei01@godaddy.com
        String regex = "^\\w{1,10}@\\w{1,5}\\.[a-zA-Z]{1,3}$";
       return  matchResult(regex, emailAd);
    }

    // search a date within a string
    public static String searchDate(String dateString){
        // 14/03/1879."
        String regex = "(3[01]|[12][0-9]|0?[1-9])/(0?[1-9]|1[0-2])/1[0-9]{3}$";
        String regax = "(1[0-2]|0?[1-9])/(3[01]|[12][0-9]|0?[1-9])/(?:[0-9]{2})?[0-9]{2}$";
        return matchResult(regax, dateString);
    }

    //work as a trim function
    public static String trimer(String str){
        String regex = "";
        return matchResult(regex, str);
    }
    public static void main(String[] args) {
        List<String> datas = new ArrayList<>();
        //test the first character of a string is uppercase or not.
//        String lowerStr = "abcd";
//        String upperStr = "Abcd";
//        System.out.println(validateFirstChar(lowerStr));
//        System.out.println(validateFirstChar(upperStr));

        //check the credit card
//        String card1 = "9999-9999-9999-9999";
//        String card2 = "a999-9999-9999-9999";
//        String card3 = "1999-9399-9999-9990";
//        System.out.println(checkCreditCard(card1));
//        System.out.println(checkCreditCard(card2));
//        System.out.println(checkCreditCard(card3));

        //matches e-mail addresses.
//        List<String> emails = new ArrayList<>();
//        emails.add("ypei01@go.com");
//        emails.add("12345678901@go.com");
//        emails.add("ypei@godaddy.com");
//        emails.add("ypei@go.comm");
//
//        for(String email : emails){
//            System.out.println(matachEmailAd(email));
//        }

        //search date from string
        datas.add("Albert Einstein was born in Ulm, on 13/03/1879");
        datas.add(" in Ulm, on 1/03/1879");

        for (String data :datas){
            System.out.println(searchDate(data));
        }
    }

}
