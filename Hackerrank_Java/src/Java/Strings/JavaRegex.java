package Java.Strings;

import java.util.Scanner;

/**
 * Write a class called MyRegex which will contain a string pattern. You need to write a regular
 * expression and assign it to the pattern such that it can be used to validate an IP address. Use
 * the following definition of an IP address:
 *
 * <p>
 * <code> IP address is a string in the form "A.B.C.D", where the value of A, B, C, and D may range
 * from 0 to 255. Leading zeros are allowed. The length of A, B, C, or D can't be greater than 3.
 * </code>
 *
 * <p>
 * Some valid IP address:
 * <pre><code>
 *  000.12.12.034
 *  121.234.12.12
 *  23.45.12.56
 * </code></pre>
 *
 * <p>
 * Some invalid IP address:
 * <pre><code>
 *  000.12.234.23.23
 *  666.666.23.23
 *  .213.123.23.32
 *  23.45.22.32.
 *  I.Am.not.an.ip
 * </code></pre>
 *
 * <p>
 * In this problem you will be provided strings containing any combination of ASCII characters. You
 * have to write a regular expression to find the valid IPs.
 *
 * <p>
 * Just write the MyRegex class which contains a String <em>pattern</em>. The string should contain
 * the correct regular expression.
 *
 * <p>
 * (MyRegex class <em>MUST NOT</em> be public)
 *
 * <h3>Sample Input</h3>
 * <pre><code>
 *  000.12.12.034
 *  121.234.12.12
 *  23.45.12.56
 *  00.12.123.123123.123
 *  122.23
 *  Hello.IP
 * </code></pre>
 *
 * <h3>Sample Input</h3>
 * <pre><code>
 *  true
 *  true
 *  true
 *  false
 *  false
 *  false
 * </code></pre>
 *
 * @author code36u4r60
 */
public class JavaRegex {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            String IP = in.next();
            System.out.println(IP.matches(MyRegex.pattern));
        }
    }
}

class MyRegex {

    /*
    «« Description »»

    ^		#start of the line
    (		#  start of group #1
   [01]?\\d\\d? #    Can be one or two digits. If three digits appear, it must start either 0 or 1
		#    e.g ([0-9], [0-9][0-9],[0-1][0-9][0-9])
    |		#    ...or
   2[0-4]\\d	#    start with 2, follow by 0-4 and end with any digit (2[0-4][0-9])
    |           #    ...or
   25[0-5]      #    start with 2, follow by 5 and ends with 0-5 (25[0-5])
    )		#  end of group #2
     \.         #  follow by a dot "."
    ....        # repeat with 3 times (3x)
    $		#end of the line
     */
    public static String pattern
            = "^([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\."
            + "([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\."
            + "([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\."
            + "([01]?\\d\\d?|2[0-4]\\d|25[0-5])$";
}
