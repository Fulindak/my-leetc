package org.example.easy;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {
    public  int removeDuplicatesTest(int[] nums) {
        Set<Integer> uniqElements = new HashSet<>();
        for (int i: nums) {
            uniqElements.add(i);
        }
        return  uniqElements.size();
    }

    public  int removeDuplicates(int[] nums) {
        int result = 0;
        int number = -101;

        for (int i: nums) {
            if (number != i) {
                nums[result] = i;
                number = i;
                result++;
            }
        }
        return result;
    }
}
