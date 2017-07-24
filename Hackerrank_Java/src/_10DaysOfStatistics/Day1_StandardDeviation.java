/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _10DaysOfStatistics;

import java.util.Scanner;

/**
 *
 * @author code36u4r60
 */
public class Day1_StandardDeviation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int size = input.nextInt();
        int[] domain = new int[size];

        double sum = 0;
        for (int i = 0; i < size; i++) {
            domain[i] = input.nextInt();
            sum += domain[i];
        }

        double mean = sum / size;

        sum = 0;
        for (int i = 0; i < size; i++) {
            sum += Math.pow((domain[i] - mean), 2);
        }

        System.out.printf("%.1f%n", Math.sqrt(sum / size));

    }
}
