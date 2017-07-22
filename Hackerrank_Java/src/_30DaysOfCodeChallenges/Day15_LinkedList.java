package _30DaysOfCodeChallenges;

import static _30DaysOfCodeChallenges.Solution.display;
import static _30DaysOfCodeChallenges.Solution.insert;
import java.util.Scanner;

/**
 * <strong>Objective</strong>
 * <br>Today we're working with Linked Lists. Check out the
 * <a href="https://www.hackerrank.com/challenges/30-linked-list/tutorial"> Tutorial</a> tab for
 * learning materials and an instructional video!
 *
 * <p>
 * A Node class is provided for you in the editor. A Node object has an integer data field,
 * <em>data</em>, and a Node instance pointer, <em>next</em>, pointing to another node (i.e.: the
 * next node in a list).
 *
 * <p>
 * A Node insert function is also declared in your editor. It has two parameters: a pointer,
 * <em>head</em>, pointing to the first node of a linked list, and an integer <em>data</em> value
 * that must be added to the end of the list as a new Node object.
 *
 * <h3>Task</h3>
 * Complete the insert function in your editor so that it creates a new Node (pass <em>data</em> as
 * the Node constructor argument) and inserts it at the tail of the linked list referenced by the
 * <em>head</em> parameter. Once the new node is added, return the reference to the <em>head</em>
 * node.
 *
 * <strong>Note:</strong> if the <em>head</em> argument passed to the <em>insert</em> function is
 * <em>null</em>, then the initial list is empty.
 *
 * <h3>Input Format</h3>
 * The <em>insert</em> function has <em>2</em> parameters: a pointer to a <em>Node</em> named
 * <em>head</em>, and a integer value, <em>data</em>.
 * <br>The <em>do not</em> need anything from stdin.
 *
 * <h3>Output Format</h3>
 * Your <em>insert</em> function return a reference to the <em>head</em> node of the linked list.
 *
 * <h3>Sample Input</h3>
 * The following input is handled for you by the locked code in the esitor:
 * <br>The first line contains <em>T</em>, the number of test cases.
 * <br>The <em>T</em> subsequent lines of test cases each contain an integer to be inserted at the
 * list's tail.
 * <pre><code>
 *  4
 *  2
 *  3
 *  4
 *  1
 * </code></pre>
 *
 * <h3>Sample Output</h3>
 * The locked code in your editor prints the ordered data values for each element in your list as a
 * single line of space-separated integers:
 * <pre><code>
 *  2 3 4 1
 * </code></pre>
 *
 * <h3>Explanation</h3>
 * <em>T = 4</em>, so the locked code in the editor will be inserting <em>4</em> nodes.
 * <br>The list is initially empty, so <em>head</em> is null; accounting for this, our code returns
 * a new node containing the data value <em>2</em> as the <em>head</em> for our list. We then create
 * and insert nodes <em>3</em>, <em>4</em> and <em>1</em> at the tail of our list. The resulting
 * list returned by the last call to <em>insert</em> is [<em>2,3,4,1</em>], so the output is 2 3 4
 * 1.
 * <a href="https://s3.amazonaws.com/hr-challenge-images/17168/1456961238-28488bfa0d-LinkedListExplanation.png">
 * Ver imagem</a>
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
