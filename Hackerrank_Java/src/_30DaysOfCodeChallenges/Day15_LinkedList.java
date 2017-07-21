/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _30DaysOfCodeChallenges;

import static _30DaysOfCodeChallenges.Solution.display;
import static _30DaysOfCodeChallenges.Solution.insert;
import java.util.Scanner;

/**
 *
 * @author code36u4r60
 */
public class Day15_LinkedList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Node head = null;
        int N = sc.nextInt();

        while (N-- > 0) {
            int ele = sc.nextInt();
            head = insert(head, ele);
        }
        display(head);
    }

}

class Node {

    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

class Solution {

    public static Node insert(Node head, int data) {
        if (head == null) {
            return new Node(data);
        }
        head.next = insert(head.next, data);
        return head;
    }

    //Outra forma
    public static Node insert2(Node head, int data) {
        // if list has no elements, return a new node
        if (head == null) {
            return new Node(data);
        }

        // else iterate through list, add node to tail, and return head
        Node tmp = head;
        while (tmp.next != null) {
            tmp = tmp.next;
        }
        tmp.next = new Node(data);

        return head;
    }

    public static void display(Node head) {
        Node start = head;
        while (start != null) {
            System.out.print(start.data + " ");
            start = start.next;
        }
    }
}
