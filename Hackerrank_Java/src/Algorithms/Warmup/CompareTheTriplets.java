/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Algorithms.Warmup;

import java.util.Scanner;

/**
 *
 * @author code36u4r60
 */
public class CompareTheTriplets {

    static int[] solve(int a0, int a1, int a2, int b0, int b1, int b2) {
        int[] result = new int[2];

        if (a0 > b0) {
            result[0]++;
        } else if (a0 < b0) {
            result[1]++;
        }

        if (a1 > b1) {
            result[0]++;
        } else if (a1 < b1) {
            result[1]++;
        }

        if (a2 > b2) {
            result[0]++;
        } else if (a2 < b2) {
            result[1]++;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a0 = in.nextInt();
        int a1 = in.nextInt();
        int a2 = in.nextInt();
        int b0 = in.nextInt();
        int b1 = in.nextInt();
        int b2 = in.nextInt();
        int[] result = solve(a0, a1, a2, b0, b1, b2);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? " " : ""));
        }
        System.out.println("");

    }

}
