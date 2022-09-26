/*
Satish Aryan Zindabad
 */
package exceptionhandling;

/**
 *
 * try, catch, exception, throw, throws and finally
 */
public class HandlerMain {

    public static void main(String[] args) {
        try {
            int n = 0;
            int m = 1 / n;
            System.out.println(m);

        } catch (Exception ex) {
            System.out.println(ex);

        } finally {
            System.out.println("Bye");
        }
    }
}
