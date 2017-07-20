package Java.IntroductionChallenges;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

/**
 * <p>
 * Given a double-precision number,<em>payment</em> , denoting an amount of money, use the
 * NumberFormat class' getCurrencyInstance method to convert <em>payment</em> into the US, Indian,
 * Chinese, and French currency formats. Then print the formatted values as follows:
 * <pre><code>
 *      US: formattedPayment
 *      India: formattedPayment
 *      China: formattedPayment
 *      France: formattedPayment
 * </code></pre>
 *
 * <p>
 * where <em>formattedPayment</em> is <em>payment</em> formatted according to the appropriate
 * Locale's currency.</p>
 *
 * <p>
 * Note: India does not have a built-in Locale, so you must construct one where the language is en
 * (i.e., English).</p>
 *
 * <p>
 * <strong>Input Format</strong>
 * <br>A single double-precision number denoting <em>payment</em>.</p>
 *
 * <p>
 * <strong>Constraints</strong>
 * <ul><li> 0 &le; <em>payment</em> &le; 10<sup>9</sup></li></ul>
 *
 * <p>
 * <strong>Output Format</strong>
 * <br>On the first line, print US: u where <em>u</em> is <em>payment</em> formatted for US
 * currency.
 * <br>On the second line, print India: i where <em>i</em> is <em>payment</em> formatted for Indian
 * currency.
 * <br>On the third line, print China: c where <em>c</em> is <em>payment</em> formatted for Chinese
 * currency.
 * <br>On the fourth line, print France: f, where <em>f</em> is <em>payment</em> formatted for
 * French currency.</p>
 *
 * <p>
 * <strong>Sample Input</strong>
 * <pre><code>
 *  12324.134
 * </code></pre>
 *
 * <p>
 * <strong>Sample Output</strong>
 * <pre><code>
 *  US: $12,324.13
 *  India: Rs.12,324.13
 *  China: ￥12,324.13
 *  France: 12 324,13 €
 * </code></pre>
 *
 * <p>
 * <strong>Explanation</strong>
 * <br>Each line contains the value of <em>payment</em> formatted according to the four countries'
 * respective currencies.
 *
 * @author code36u4r60
 */
public class JavaCurrencyFormatter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        String us = NumberFormat.getCurrencyInstance(Locale.US).format(payment);
        //String india = NumberFormat.getCurrencyInstance(new Locale("hi", "IN")).format(payment);
        String india = NumberFormat.getCurrencyInstance(new Locale("en", "IN")).format(payment);
        String china = NumberFormat.getCurrencyInstance(Locale.SIMPLIFIED_CHINESE).format(payment);
        String france = NumberFormat.getCurrencyInstance(Locale.FRANCE).format(payment);

        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }

}
