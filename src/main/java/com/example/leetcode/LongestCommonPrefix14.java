package com.example.leetcode;

public class LongestCommonPrefix14 {
    public static void main(String[] args) {


        String[] strs = {"flower", "flow", "floight", "flowleight", "flow"};

        StringBuilder output = new StringBuilder();

        int lengthShort = strs[0].length();

        for (int i = 1; i < strs.length; i++) {

            if (strs[i].length() < lengthShort) {
                lengthShort = strs[i].length();
            }
        }

        for (int i = 0; i < lengthShort; i++) {   // char in word
            char aaa = strs[0].charAt(i);

            for (int j = 1; j < strs.length; j++) {   // words number

                if ((strs[j].charAt(i)) != aaa) {   //compare all letters
                    System.out.println(output);
return;
//                    if (strs[j + 1].length() == lengthShort) {             //assume its last word
//
//                        output.append(strs[j].charAt(i));
//
//                        System.out.println("anw: " + output) ;
//                    }
                }
 //               System.out.println("anw: " + output) ;
            }
            output.append(aaa);
        }
        System.out.println(output);

    }
}
