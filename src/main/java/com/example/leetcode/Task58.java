package com.example.leetcode;

public class Task58 {
    public static void main(String[] args) {
        String s = "woyghbhg";

        int anw = 0;

        if (s.length() == 0) { //""
            System.out.println(0);
            return;
        }

        for (int i = s.length(); i > 0; i--) {  //"hello"

            if (s.charAt(i - 1) != ' ' && i == 1) {
                System.out.println(s.length());
                return;
            }
        }


        for (int i = s.length(); i > 0; i--) {


            if (s.charAt(i - 1) != ' ' && s.charAt(s.length() - 1) != ' ') { //" hello "

                anw++;

                if (s.charAt(i - 2) == ' ') {
                    break;
                }

            }

            if (s.charAt(i - 1) != ' ' && i == 1) {
                System.out.println(s.length());
                return;
            }

            else if (s.charAt(i - 1) != ' ') { //"hello "

                anw++;

            } else if (s.charAt(0) == ' ' && s.charAt(i - 1) != ' ') {  //" hi"
                anw++;
            }

        }
        System.out.println(anw);

    }
}
