package exceptionhandling;

import java.util.Scanner;

public class ExceptionMarks {

    public static int getMarks(String message) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            try {
                System.out.println(message);
                int marks = Integer.parseInt(sc.nextLine());
                if (marks > 100 || marks < 0) {
                    throw new MarksException();
                }

                return marks;
            } catch (Exception ex) {

                System.out.println(ex);
            }

        }
    }

    public static int getmarks() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks in physics");
        int marks = sc.nextInt();
        return marks;
    }

    public static void main(String args[]) throws MarksException {
        try {
            System.out.println("Enter subjectmarks");
            int physics = getMarks("Enter marks in physics");
            System.out.println(physics);
            int chem = getMarks("Enter marks in chem");
            System.out.println(chem);
            int total = physics + chem;
            System.out.println(total);

        } catch (Exception ex) {
            System.out.print(ex);
        }

    }
}
