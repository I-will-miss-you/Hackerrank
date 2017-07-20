package Algorithms.Warmup;

import java.util.Scanner;

/**
 * <p>
 * Welcome to HackerRank! The purpose of this challenge is to familiarize you with reading input
 * from stdin (the standard input stream) and writing output to stdout (the standard output stream)
 * using our environment.</p>
 * <p>
 * Review the code provided in the editor below, then complete the solveMeFirst function so that it
 * returns the sum of two integers read from stdin. Take some time to understand this code so you're
 * prepared to write it yourself in future challenges.</p>
 *
 * <p>
 * Select a language below, and start coding!
 * </p>
 *
 * <p>
 * <strong>Input Format</strong>
 * <br>Code that reads input from stdin is provided for you in the editor. There are <i>2</i> lines
 * of input, and each line contains a single integer.</p>
 *
 * <p>
 * <strong>Output Format</strong>
 * <br>Code that prints the sum calculated and returned by solveMeFirst is provided for you in the
 * editor.</p>
 *
 * @author code36u4r60
 */
public class SolveMeFirst {

    static int solveMeFirst(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a;
        a = in.nextInt();
        int b;
        b = in.nextInt();
        int sum;
        sum = solveMeFirst(a, b);
        System.out.println(sum);
    }

}
