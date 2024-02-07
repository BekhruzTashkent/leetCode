package com.example.leetcode;

public class Task28 {
    public static void main(String[] args) {

        String haystack = "Hellohvbodydf";
        String needle = "boy";

        int trueLength = needle.length();

        for (int i = trueLength; i < haystack.length()+1; i++) {

                if (needle.equals(haystack.substring(i-trueLength, i)) &&
                haystack.length() >= trueLength) {

                    System.out.println(i - trueLength);
                    return;

                }
        }
        System.out.println(-1);

    }
}
