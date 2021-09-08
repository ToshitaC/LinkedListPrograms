package com.blz;

import java.util.Scanner;

public class LinkedList {

    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);
        System.out.println("Enter 1 to add element at the start");

        Node firstNode = new Node(56);
        Node secondNode = new Node(30);
        Node thirdNode = new Node(70);

       Node head = firstNode;
       firstNode.next = secondNode;
        secondNode.next = thirdNode;
        Node tail = thirdNode;

        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}