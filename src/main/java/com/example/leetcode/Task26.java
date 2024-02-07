package com.example.leetcode;

import java.util.Arrays;

public class Task26 {
    public static void main(String[] args) {


        int[] nums = {7,6,8,6,4,4,44,};

        int number = 0;


        if(nums.length == 1){
            System.out.println( 1);
            return;
        }

        for (int i = 0; i < nums.length - 1; i++) {



            if (nums[i] == nums[i + 1]&& (nums[0] == nums[nums.length - 1])) {

                System.out.println("1");
                return;

            }

            if (nums[i] == nums[i + 1]) {

            } else {

                number++;
                int newNumb = nums[i];
                nums[number - 1] = newNumb;

                if (nums[i + 1] == nums[nums.length - 1]) {

                    number++;
                    newNumb = nums[i + 1];
                    nums[number - 1] = newNumb;

                }
            }
        }

        System.out.println(number);

    }
}
