package org.example.easy;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
    public int romanToInt(String s) {
        Map<Character,Integer> string=new HashMap<>();
        string.put('I',1);
        string.put('V',5);
        string.put('X',10);
        string.put('L',50);
        string.put('C',100);
        string.put('D',500);
        string.put('M',1000);

        int summ = 0;

        for(int i=0;i<s.length();i++){
            if(i < s.length() -1 && string.get(s.charAt(i)).intValue() < string.get(s.charAt(i + 1)).intValue()) {
             summ -= string.get(s.charAt(i));
            }
            else {
                summ += string.get(s.charAt(i));
            }
        }
        return  summ;
    }
}
