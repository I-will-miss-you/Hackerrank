/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java.Strings;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author code36u4r60
 */
public class TagContentExtractor {

    /**
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
