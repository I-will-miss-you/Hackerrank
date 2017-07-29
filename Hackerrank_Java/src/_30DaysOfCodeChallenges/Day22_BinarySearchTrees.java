/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _30DaysOfCodeChallenges;

import java.util.Scanner;

/**
 *
 * @author code36u4r60
 */
public class Day22_BinarySearchTrees {

    static Node2 insert(Node2 root, int data) {
        if (root == null) {
            return new Node2(data);
        } else {
            Node2 cur;
            if (data <= root.data) {
                cur = insert(root.left, data);
                root.left = cur;
            } else {
                cur = insert(root.right, data);
                root.right = cur;
            }
            return root;
        }
    }

    static int getHeight(Node2 root) {
        if (root.left == null && root.right == null) {
            return 0;
        }
        return Math.max(
                root.left != null ? 1 + getHeight(root.left) : 0,
                root.right != null ? 1 + getHeight(root.right) : 0);
    }

    // ou
    static int getHeight2(Node2 root) {
        if (root == null) {
            return -1;
        } else {
            return 1 + Math.max(getHeight(root.left), getHeight(root.right));
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        Node2 root = null;
        while (T-- > 0) {
            int data = sc.nextInt();
            root = insert(root, data);
        }
        int height = getHeight(root);
        System.out.println(height);
    }

}

class Node2 {

    Node2 left, right;
    int data;

    Node2(int data) {
        this.data = data;
        left = right = null;
    }
}
