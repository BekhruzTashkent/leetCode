package com.example.leetcode;

public class Task35 {
    public static void main(String[] args) {


//        int anw = 0;
//        int length = nums.length;
//
//        for (int i = 0; i < length; i++) {
//
//            anw++;
//            if (nums[i] == target) {
//
//                System.out.println(anw - 1);
//                return;
//
//            }
//            else if (
//                    i < length-1 &&
//                            (nums[i] > target &&
//                                    target < nums[i + 2]) ||
//                            (nums[i] > target)
//            ) {
//
//                System.out.println(i);
//                return;
//
//            } else if (length-1 == i) {
//                System.out.println(length);
//                return;
//            }
//
//        }

        int[] nums = {1, 3, 4, 5, 7, 9};
        int target = 8;

        System.out.println("searchInsert(nums, target) = " + searchInsert(nums, target));

    }


    public static int searchInsert(int[] nums, int target) {
        int anw = 0;
        int length = nums.length;


        for (int i = 0; i < length; i++) {

            anw++;
            if (nums[i] == target) {

                return anw - 1;

            } else if (
                    i + 2 < length &&
                            (nums[i] > target &&
                                    target < nums[i + 2]) ||
                            (nums[i] > target)
            ) {

                return i;
            } else if (length - 1 == i) {

                return length;
            }

        }
        return 0;
    }
}
