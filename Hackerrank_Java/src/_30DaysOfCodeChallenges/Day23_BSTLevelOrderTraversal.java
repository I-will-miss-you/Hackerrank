package _30DaysOfCodeChallenges;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 *
 * @author code36u4r60
 */
public class Day23_BSTLevelOrderTraversal {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        Node3 root = null;
        while (T-- > 0) {
            int data = sc.nextInt();
            root = insert(root, data);
        }
        levelOrder(root);
    }

    static Node3 insert(Node3 root, int data) {
        if (root == null) {
            return new Node3(data);
        } else {
            Node3 cur;
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

    static void levelOrder(Node3 root) {
        Queue<Node3> queue = new LinkedList<>();
        if (root != null) {
            queue.add(root);
        }
        while (!queue.isEmpty()) {
            Node3 current = queue.remove();
            System.out.print(current.data + " ");
            if (current.left != null) {
                queue.add(current.left);
            }
            if (current.right != null) {
                queue.add(current.right);
            }
        }
    }

}

class Node3 {

    Node3 left, right;
    int data;

    Node3(int data) {
        this.data = data;
        left = right = null;
    }
}
