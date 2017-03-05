package RegularExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by pei on 2017/3/3.
 */
public class StringDemo {

    public static String cutInnerString(String xmlData){
        String regex = "(?<=<resdata>\\r\\n).+(?=</resdata>)";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(xmlData);
        if(matcher.find()){
            String value = matcher.group(0);
            return value;
        }
        return null;
    }

    public static String removeAttribute(String str, String element){
        String string = str.split("><", 2)[1];
        return "<" + element + ">" + string;
    }

    public static String removeAnyAttribute(String str, String element){

        return null;
    }

    public static void main(String[] args) {
        String xmlData = "<resdata>\r\n<Domains xmlns = 'HelloWorld'><Domain></Domain></Domains></resdata>";

        String string = cutInnerString(xmlData);

        String domains = removeAttribute(string, "Domains");

        System.out.println(domains);
    }
}
