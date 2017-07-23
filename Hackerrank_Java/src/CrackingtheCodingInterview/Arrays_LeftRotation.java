package CrackingtheCodingInterview;

import java.util.Scanner;

/**
 *
 * @author code36u4r60
 */
public class Arrays_LeftRotation {

    public static int[] arrayLeftRotation(int[] a, int n, int k) {
        int b[] = new int[n];
        for (int j = 0; j < n; j++) {
            //System.out.println(7 % n);
            b[(j - k + n) % n] = a[j];
        }
        return b;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int a[] = new int[n];
        for (int a_i = 0; a_i < n; a_i++) {
            a[a_i] = in.nextInt();
        }

        int[] output = new int[n];
        output = arrayLeftRotation(a, n, k);
        for (int i = 0; i < n; i++) {
            System.out.print(output[i] + " ");
        }

        System.out.println();

    }
}
