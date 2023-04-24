package org.example.easy;

public class TwoSum {
    public int[] twoSumSecond(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int [] {i, j};
                }
            }
        }
        return new int[]{0, 0};
    }

    public int[] twoSumVirst(int[] nums, int target) {
        int firstNum;
        int secondNum;
        int firstPos;
        int secondPos;

        for (int i = 0; i < nums.length; i++) {
            firstNum = nums[i];
            firstPos = i;
            secondNum = target - firstNum;
            secondPos = serchNumber(nums, secondNum, firstPos);

            if(secondPos != 0) {
                return new int[] {firstPos, secondPos};
            }
        }
        return new int[] {0,0};
    }

    public int serchNumber(int[] nums, int number, int firstPos) {
        for (int i = firstPos + 1; i < nums.length; i++) {
            if (nums[i] == number) {
                return i;
            }
        }
        return 0;
    }
}