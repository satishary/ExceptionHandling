package exceptionhandling;

public class HandlerMain {

    public static void main(String[] args) {
        try {
            int n = 70;
            n = 1 / n;
            int[] a = {78};
            a[0] = 9;
            System.out.println("No Error");
        } catch (ArithmeticException ex) {
            System.out.println("Arithmetic Error");
            System.out.println(ex);
        } catch (NullPointerException ex) {
            System.out.println("Null Pointer Error");
            System.out.println(ex);
        } catch (Exception ex) {
            System.out.println("Unknown Error");
            System.out.println(ex);

        } finally {
            System.out.println("Bye");
        }
    }
}
