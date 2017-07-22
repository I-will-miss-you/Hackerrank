package Java.Strings;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * In this challenge, we use regular expressions (RegEx) to remove instances of words that are
 * repeated more than once, but retain the <em>first occurrence</em> of any case-insensitive
 * repeated word. For example, the words <em>love</em> and to are repeated in the sentence <em>I
 * love Love to To tO code</em>. Can you complete the code in the editor so it will turn <em>I love
 * Love to To tO code into I love to code</em>?
 *
 * <p>
 * To solve this challenge, complete the following three lines:
 * <ol>
 * <li> Write a RegEx that will match any repeated word.
 * <li> Complete the second compile argument so that the compiled RegEx is case-insensitive.
 * <li> Write the two necessary arguments for replaceAll such that each repeated word is replaced
 * with the very first instance the word found in the sentence. It must be the exact first
 * occurrence of the word, as the expected output is case-sensitive.
 * </ol>
 *
 * <strong>Note:</strong> This challenge uses a custom checker; you will fail the challenge if you
 * modify anything other than the three locations that the comments direct you to complete. To
 * restore the editor's original stub code, create a new buffer by clicking on the branch icon in
 * the top left of the editor.
 *
 * <h3>Input Format</h3>
 * The following input is handled for you the given stub code:
 * <br>
 * <br>The first line contains an integer,<em>n</em>, denoting the number of sentences.
 * <br>Each of the <em>n</em> subsequent lines contains a single sentence consisting of English
 * alphabetic letters and whitespace characters.
 *
 * <h3>Constraints</h3>
 * <ul>
 * <li> Each sentence consists of at most 10<sup>4</sup> English alphabetic letters and whitespaces.
 * <li> 1 &le; <em>n</em> &le; 100
 * </ul>
 *
 * <h3>Output Format</h3>
 * Stub code in the editor prints the sentence modified by the <em>replaceAll</em> line to stdout.
 * The modified string must be a modified version of the initial sentence where all repeat
 * occurrences of each word are removed.
 *
 * <h3>Sample Input</h3>
 * <pre><code>
 *  5
 *  Goodbye bye bye world world world
 *  Sam went went to to to his business
 *  Reya is is the the best player in eye eye game
 *  in inthe
 *  Hello hello Ab aB
 * </code></pre>
 *
 * <h3>Sample Output</h3>
 * <pre><code>
 *  5
 *  Goodbye bye world
 *  Sam went to his business
 *  Reya is the best player in eye game
 *  in inthe
 *  Hello Ab
 * </code></pre>
 *
 * <h3>Explanation</h3>
 * <ol>
 * <li> We remove the second occurrence of <em>bye</em> and the second and third occurrences of
 * <em>world</em> from <em>Goodbye bye bye world world world</em> to get <em>Goodbye bye world</em>.
 * <li> We remove the second occurrence of <em>went</em> and the second and third occurrences of
 * <em>to</em> from <em>Sam went went to to to his business</em> to get <em>Sam went to his
 * business</em>.
 * <li> We remove the second occurrence of <em>is</em>, the second occurrence of <em>the</em>, and
 * the second occurrence of <em>eye</em> from <em>Reya is is the the best player in eye eye
 * game</em> to get <em>Reya is the best player in eye game</em>.
 * <li> The sentence <em>in inthe</em> has no repeated words, so we do not modify it.
 * <li>We remove the second occurrence of <em>ab</em> from <em>Hello hello Ab aB</em> to get
 * <em>Hello Ab</em>. It's important to note that our matching is case-insensitive, and we
 * specifically retained the first occurrence of the matched word in our final string.
 * </ol>
 *
 * @author code36u4r60
 */
public class JavaRegex2_DuplicateWords {

    /**
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String regex = "(\\b\\w+\\b)(\\s+\\1\\b)+";
        Pattern p = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);

        Scanner in = new Scanner(System.in);
        int numSentences = Integer.parseInt(in.nextLine());

        while (numSentences-- > 0) {
            String input = in.nextLine();

            Matcher m = p.matcher(input);

            // Check for subsequences of input that match the compiled pattern
            while (m.find()) {
                input = input.replace(m.group(0), m.group(1));
            }

            // Prints the modified sentence.
            System.out.println(input);
        }

    }

}
