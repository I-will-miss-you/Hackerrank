package Java.IntroductionChallenges;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

/**
 * <p>
 * The Calendar class is an abstract class that provides methods for converting between a specific
 * instant in time and a set of calendar fields such as YEAR, MONTH, DAY_OF_MONTH, HOUR, and so on,
 * and for manipulating the calendar fields, such as getting the date of the next week.</p>
 *
 * <p>
 * You are given a date. Your task is to find what the day is on that date. </p>
 *
 * <p>
 * <strong>Input Format</strong>
 * <br>A single line of input containing the space separated month, day and year, respectively, in
 * MM/DD/YYY format.</p>
 *
 * <p>
 * <strong>Constrints</strong>
 * <ul><li> 2000 &le; year &le; 3000</li></ul>
 *
 * <p>
 * <strong>Output Format</strong>
 * <br>Output the correct day in capital letters. </p>
 *
 * <p>
 * <strong>Sample Input</strong>
 * <pre><code> 08 05 2015 </code></pre>
 *
 * <p>
 * <strong>Sample Output</strong>
 * <pre><code> WEDNESDAY </code></pre>
 *
 * <p>
 * <strong>Explanation</strong>
 * <br>The day on August <em>5</em><sup>th</sup> <em>2015</em> was WEDNESDAY. </p>
 *
 * @author code36u4r60
 */
public class JavaDateAndTime {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String month = in.next();
        String day = in.next();
        String year = in.next();

        Calendar c = new GregorianCalendar(
                Integer.parseInt(year),
                Integer.parseInt(month),
                Integer.parseInt(day));

        SimpleDateFormat f = new SimpleDateFormat("EEEE");
        System.out.println(f.format(c.getTime()).toUpperCase());
    }

}
