package Java.Strings;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * In a tag-based language like XML or HTML, contents are enclosed between a start tag and an end
 * tag like &lt;tag>contents&lt;/tag>. Note that the corresponding end tag starts with a /.
 * <p>
 * Given a string of text in a tag-based language, parse this text and retrieve the contents
 * enclosed within sequences of well-organized tags meeting the following criterion:
 * <ol>
 * <li> The name of the <em>start</em> and <em>end</em> tags must be same. The HTML code
 * &lt;h1>Hello World&lt;/h2> <em>is not valid</em>, because the text starts with an h1 tag and ends
 * with a non-matching h2 tag.
 * <li> Tags can be nested, but content between nested tags is considered not valid. For example, in
 * &lt;h1>&lt;a>contents&lt;/a>invalid&lt;/h1>, contents is valid but invalid is not valid.
 * <li> Tags can consist of any printable characters.
 * </ol>
 *
 * <h3>Input Format</h3>
 * The first line of input contains a single integer, <em>N</em> (the number of lines).
 * <br> The <em>N</em> subsequent lines each contain a line of text.
 *
 * <h3>Constraints</h3>
 * <ul>
 * <li> 1 &le; <em>N</em> &le; 100
 * <li> Each line contains a maximum of 10<sup>4</sup> printable characters.
 * <li> The total number of characters in all test cases will not exceed 10<sup>6</sup>.
 * </ul>
 *
 * <h3>Output Format</h3>
 * For each line, print the content enclosed within valid tags.
 * <br>If a line contains multiple instances of valid content, print out each instance of valid
 * content on a new line; if no valid content is found, print None.
 *
 * <h3>Sample Input</h3>
 * <pre><code>
 *   4
 *  &lt;h1>Nayeem loves counseling&lt;/h1>
 *  &lt;h1>&lt;h1>Sanjay has no watch&lt;/h1>&lt;/h1>&lt;par>So wait for a while&lt;/par>
 *  &lt;Amee>safat codes like a ninja&lt;/amee>
 *  &lt;SA premium>Imtiaz has a secret crush&lt;/SA premium>
 * </code></pre>
 *
 * <h3>Sample Output</h3>
 * <pre><code>
 *  Nayeem loves counseling
 *  Sanjay has no watch
 *  So wait for a while
 *  None
 *  Imtiaz has a secret crush
 * </code></pre>
 *
 * @author code36u4r60
 */
public class TagContentExtractor {

    /**
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String pattern = "<([^>]+)>([^<>]+)</\\1>";
        Pattern r = Pattern.compile(pattern);
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        while (testCases-- > 0) {
            String line = in.nextLine();

            Matcher m = r.matcher(line);
            boolean findMatch = true;
            while (m.find()) {
                System.out.println(m.group(2));
                findMatch = false;
            }
            if (findMatch) {
                System.out.println("None");
            }
        }
    }

}
