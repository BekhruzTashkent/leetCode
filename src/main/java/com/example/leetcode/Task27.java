package com.example.leetcode;

import java.util.Arrays;

public class Task27 {
    public static void main(String[] args) {

        int[] nums = {3,2,2,3};
        int val =  3;

        int number = 0;
        for(int i =0; i<nums.length; i++) {

            int value = nums[i];
            if (value == val){
               continue;
            }else {
                number++;
                nums[number-1] = nums[i];
            }
        }
        System.out.println(Arrays.toString(nums));
        System.out.println(number);
    }
}
