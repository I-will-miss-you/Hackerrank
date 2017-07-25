package CrackingtheCodingInterview;

import java.util.Scanner;

/**
 *
 * @author code36u4r60
 */
public class StringsMakingAnagrams {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.next();
        String b = in.next();
        System.out.println(numberNeeded(a, b));
    }

    public static int numberNeeded(String first, String second) {
        int[] str = new int[26];
        for (char c : first.toCharArray()) {
            str[c - 'a']++;
        }
        for (char c : second.toCharArray()) {
            str[c - 'a']--;
        }
        int result = 0;
        for (int i : str) {
            result += Math.abs(i);
        }
        return result;
    }

}
