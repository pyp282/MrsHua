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
        String regex = "^\\s+|\\s+$";
        return str.replaceAll(regex, "");
    }

    // count number of words in string
    public static int countWords(String str){
        int count = 0;
        str = trimer(str);
        String regex = "\\b[a-zA-Z]+\\b";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(str);
        while(matcher.find()){
            count++;
        }

        return count;
    }

    //check IP value
    public static String checkIP(String str){
        //192.255.255.255
        String regex = "(([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.){3}(2[0-4]\\d|25[0-5]|[01]?\\d\\d?)$";

        return matchResult(regex, str);
    }

    //check whether a given value is an valid url or not
    public static String checkURL(String url){
        String regex = "^(?:(?:https?|ftp):\\/\\/)?(?:(?!(?:10|127)(?:\\.\\d{1,3}){3})(?!(?:169\\.254|192\\.168)(?:\\.\\d{1,3}){2})(?!172\\.(?:1[6-9]|2\\d|3[0-1])(?:\\.\\d{1,3}){2})(?:[1-9]\\d?|1\\d\\d|2[01]\\d|22[0-3])(?:\\.(?:1?\\d{1,2}|2[0-4]\\d|25[0-5])){2}(?:\\.(?:[1-9]\\d?|1\\d\\d|2[0-4]\\d|25[0-4]))|(?:(?:[a-z\\u00a1-\\uffff0-9]-*)*[a-z\\u00a1-\\uffff0-9]+)(?:\\.(?:[a-z\\u00a1-\\uffff0-9]-*)*[a-z\\u00a1-\\uffff0-9]+)*(?:\\.(?:[a-z\\u00a1-\\uffff]{2,})))(?::\\d{2,5})?(?:\\/\\S*)?$";

        return matchResult(regex, url);
    }

    // check whether a given value is alpha numeric or not
    public static String alphaNuCheck(String value){
        String regex = "^[a-zA-Z0-9]+$";

        return matchResult(regex, value);
    }

    //  whether a given value is hexadecimal value or not.
    public static String hexadecimalCheck(String value){
        String regex = "^[0-9a-fA-f]$";

        return matchResult(regex, value);
    }

    //check whether a given value represents a domain or not
    public static String domainCheck(String str){
        String regex = "^[a-z0-9]+([\\-\\.]{1}[a-z0-9]+)*\\.[a-z]{2,6}$";
        return matchResult(regex, str);
        //Exception in thread "main" java.util.regex.PatternSyntaxException: Unclosed counted closure near index 42
        // format error.
    }

    //check whether a given value is html or not
    public static String HtmlCheck(String str){
        String regex = "<([a-z]+) *[^/]*?>";

        return matchResult(regex, str);
    }

    // check a given value contains alpha, dash and underscore.
    public static String charCheck(String str){
        String regex = "^[a-z0-9\\-_]+$";

        return matchResult(regex, str);
    }

    // print an integer with commas as thousands separators
    public static void thousand_separator(String numeric){
        String regex = "\\B(?=(\\d{3})+(?!\\d))";
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
//        datas.add("Albert Einstein was born in Ulm, on 13/03/1879");
//        datas.add(" in Ulm, on 1/03/1879");
//
//        for (String data :datas){
//            System.out.println(searchDate(data));
//        }
//        String str = " hello world  ";
//        StringBuffer sb = new StringBuffer("hello world ");
//
//        System.out.println(trimer(str));
//
//        sbTrimer(sb);
//        System.out.println(sb);

        // count number of words in string
//        String str = " count number of words in string ";
//        System.out.println(countWords(str));

//        String IPstr = "this is a ip 12.23.23.255";
//        System.out.println(checkIP(IPstr));

//        String url = "www.baidu.com";
//        System.out.println(checkURL(url));

//        String domain = "bai.du.baidu.com";
//        System.out.println(domainCheck(domain));

        System.out.println(charCheck("12-133"));
        System.out.println( charCheck("100_23"));
    }

}
