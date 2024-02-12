package com.example.leetcode;

import java.util.Arrays;

public class Task66 {
    public static void main(String[] args) {

        int[] digits = {9, 8, 9};

        int i = digits.length;

        if (digits[i - 1] != 9) {
            digits[i - 1] = digits[i - 1] + 1;
            System.out.println(Arrays.toString(digits));
            return;
        }

        int check = 0;

        for (int j = i - 1; j >= 1; j--) {

            if (digits[j] > 9 && j > 0 || digits[i - 1] == 9) {

                check++;

                digits[j] = 0;

                digits[j - 1] = digits[j - 1] + 1;

            } else {
                break;
            }


        }


        if (check == i - 1 && digits[0] == 10) {

            int[] newDigit = new int[i + 1];


            for (int j = i - 1; j > 0; j--) {

                newDigit[i] = 0;

                newDigit[0] = 1;

            }
            System.out.println(Arrays.toString(newDigit));
            return;

        } else if (i == 1 && digits[i - 1] == 9) {
            int[] newDigit = new int[i + 1];
            newDigit[i] = 0;
            newDigit[0] = 1;
            System.out.println(Arrays.toString(newDigit));
            return;
        }


        System.out.println(Arrays.toString(digits));

    }
}

//LeetCode solution

//for (int i = digits.length - 1; i >= 0; i--) {
//        if (digits[i] < 9) {
//digits[i]++;
//        return digits;
//	}
//digits[i] = 0;
//        }
//
//digits = new int[digits.length + 1];
//digits[0] = 1;
//        return digits;
