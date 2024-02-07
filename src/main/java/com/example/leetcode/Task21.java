package com.example.leetcode;

import java.util.LinkedList;

public class Task21 {
    public static void main(String[] args) {

        LinkedList list = new LinkedList();
        list.add(1);

        ListNode head;

        System.out.println(list);

    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }
}