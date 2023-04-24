package org.example.easy;

public class SearchInsertPosition {
    public int searchInsert(int[] nums, int target) {
        int numsLength = nums.length;
        int max = nums[numsLength - 1];
        int min = nums[0];
        if (max < target) {
            return numsLength;
        }
        if (min > target) {
            return 0;
        }
        for (int i = 0;i < numsLength - 1; i++) {
            if (nums[i] < target && nums[i+1] >= target) {
                return i+1;
            }
        }
        return 0;
    }
}
