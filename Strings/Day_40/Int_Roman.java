package Strings.Day_40;

import java.util.HashMap;
import java.util.Map;

public class Int_Roman {
    public static void main(String[] args) {
        System.out.println(Roman(20));
    }

    static String Roman(int num){
        String M[] = {"", "M", "MM", "MMM"};
    String C[] = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
    String X[] = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
    String I[] = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
    return M[num/1000] + C[(num%1000)/100] + X[(num%100)/10] + I[num%10];
    }
}
