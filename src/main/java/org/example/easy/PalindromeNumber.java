package org.example.easy;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class PalindromeNumber {
    public static boolean isPalindrome(int x) {
        List<Integer> number = new ArrayList<>();
        int size;
        if(x < 0) {
            return false;
        }
        while(x / 10 != 0)
        {
            number.add(x % 10);
            x = x / 10;
        }
        number.add(x);
        size = number.size();
        if (size % 2 != 0 ) {
            for (int i = 0; i < (size - 1) / 2 ; i++) {
                if(!number.get(i).equals(number.get(size - 1 - i))) {
                    return false;
                }
            }
            return true;
        }
        else {
            for (int i = 0; i < size / 2 ; i++) {
                if(!number.get(i).equals(number.get(size - 1 - i))) {
                    return false;
                }
            }
            return true;

        }
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(100));
    }
}
