package data.structure;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by pei on 2017/3/1.
 */
public class SqList {
    public void listDemo01() {
        List list = new ArrayList<>();
        list.remove(1);
        list.add("");
        list.get(1);
        list.set(1, "");
    }
}
static String[] weishu = {"", "十", "百", "千", "万", "十万", "百万", "千万", "亿"};
    static final Map<Integer, String> cnNums = new HashMap<Integer, String>();

    static {
        cnNums.put(0,"零"); cnNums.put(1,"一"); cnNums.put(2,"二"); cnNums.put(3,"三"); cnNums.put(4,"四");
        cnNums.put(5,"五"); cnNums.put(6,"六"); cnNums.put(7,"七"); cnNums.put(8,"八"); cnNums.put(9,"九");
    }

    static String cnStr = "";

    public static String getFormatString(int number){
        if(number == 0){
            return cnNums.get(number);
        }
        String numStr = String.valueOf(number);
        if(numStr.startsWith("0")){
            number = Integer.parseInt(numStr.substring(1));
        }

        int length = 0;
        String cnNum = null;
        String unit;
        while (number%10 > 0 || number > 0){
            int residue = number%10;

            if(length == 0 && residue == 0){
                cnNum = "";
                unit = "";
            }else if(residue == 0 && (cnNum.equals(cnNums.get(0)) || cnNum.equals(""))){
                cnNum = "";
                unit = "";
            }else {
                cnNum = cnNums.get(residue);
                if(residue != 0){
                    unit = weishu[length];
                }else {
                    unit = "";
                }
            }

            cnStr = cnNum + unit + cnStr;

            length++;
            number = number/10;
        }

        if(cnStr.length() > 0){
            return cnStr;
        }else {
            return "invalid number";
        }
    }
