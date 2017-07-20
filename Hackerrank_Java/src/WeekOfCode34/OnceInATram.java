/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WeekOfCode34;

import java.util.Arrays;
import java.util.Scanner;

/**
 * <p>
 * <strong>Your submission will run against only preliminary test cases. Full test cases will run at
 * the end of the day.</strong></p>
 *
 * <p>
 * One day, Jack was going home by tram. When he got his ticket, he noticed that number on the
 * ticket was not lucky. A lucky ticket is a six-digit number on the ticket in which sum of the
 * first three digits is equal to the sum of the last three digits.</p>
 *
 * <p>
 * For example, number 165912 is lucky because sum of <em>1 + 6 + 5 = 12</em>, and <em>9 + 1 + 2 =
 * 12</em>.</p>
 *
 * <p>
 * Since the number on the ticket wasn't lucky, Jack needs your help to find the next lucky ticket
 * number.</p>
 *
 * <p>
 * For example, if Jack's ticket number is 165901, then the next lucky ticket number is 165903.</p>
 *
 * <p>
 * Given Jack's current ticket number, find and print the next lucky ticket number.</p>
 *
 * <p>
 * <strong>Input Format</strong>
 * <br>The first line contains an integer, <em>x</em> , denoting the <em>6 - digit</em> number on
 * the ticket.</p>
 *
 * <p>
 * <strong>Constraints</strong>
 * <ul><li>10<sup>5</sup> &le; x &le; 10<sup>5</sup> - 2</li></ul>
 *
 * <p>
 * <strong>Output Format</strong>
 * <br>For the given input find and print the next lucky ticket number.</p>
 *
 * <p>
 * <strong>Sample Input 0</strong>
 * <pre><code>  555555</code></pre>
 *
 * <p>
 * <strong>Sample Output 0</strong>
 * <pre><code>  555564</code></pre>
 *
 * <p>
 * <strong>Explanation 0</strong>
 * <br>After <em>555555</em> the first lucky number is <em>555564</em>, where the sum of first three
 * digits <em>5 + 5 + 5</em> is equal to the sum of last three digits <em>5 + 6 + 4</em>.
 *
 * @author code36u4r60
 */
public class OnceInATram {

    static String onceInATram(int x) {

        StringBuilder num = new StringBuilder(Integer.toString(x));
        while (true) {
            x++;
            num = new StringBuilder(Integer.toString(x));
            int a1 = num.charAt(0) - '0';
            int b1 = num.charAt(1) - '0';
            int c1 = num.charAt(2) - '0';
            int a2 = num.charAt(3) - '0';
            int b2 = num.charAt(4) - '0';
            int c2 = num.charAt(5) - '0';

            if (a1 + b1 + c1 == a2 + b2 + c2) {
                break;
            }
        }

        return num.toString();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        String result = onceInATram(x);
        System.out.println(result);
    }

}
