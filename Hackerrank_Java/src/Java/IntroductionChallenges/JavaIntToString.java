package Java.IntroductionChallenges;

import java.security.Permission;
import java.util.Scanner;

/**
 * <p>
 * You are given an integer <em>n</em>, you have to convert it into a string.</p>
 *
 * <p>
 * Please complete the partially completed code in the editor. If your code successfully converts
 * <em>n</em> into a string <em>s</em> the code will print "Good job". Otherwise it will print
 * "Wrong answer".</p>
 *
 * <p>
 * <em>n</em> can range between <em>-100</em> to <em>100</em> inclusive.
 *
 * <p>
 * <strong>Sample Input 0</strong>
 * <pre><code>  100</code></pre>
 *
 *  * <p>
 * <strong>Sample Output 0</strong>
 * <pre><code> God job</code></pre>
 *
 * @author code36u4r60
 */
public class JavaIntToString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DoNotTerminate.forbidExit();
        try {
            Scanner in = new Scanner(System.in);
            int n = in.nextInt();
            in.close();

            //String s=???; Complete this line below
            String s = Integer.toString(n);

            if (n == Integer.parseInt(s)) {
                System.out.println("Good job");
            } else {
                System.out.println("Wrong answer.");
            }
        } catch (DoNotTerminate.ExitTrappedException e) {
            System.out.println("Unsuccessful Termination!!");
        }
    }

}

//The following class will prevent you from terminating the code using exit(0)!
class DoNotTerminate {

    public static class ExitTrappedException extends SecurityException {

        private static final long serialVersionUID = 1;
    }

    public static void forbidExit() {
        final SecurityManager securityManager = new SecurityManager() {
            @Override
            public void checkPermission(Permission permission) {
                if (permission.getName().contains("exitVM")) {
                    throw new ExitTrappedException();
                }
            }
        };
        System.setSecurityManager(securityManager);
    }
}
