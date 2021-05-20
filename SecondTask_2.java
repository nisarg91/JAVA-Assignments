package FirstAssignment;
import java.util.Scanner;

public class SecondTask_2 {
    public static void main(String[] args) {
        Scanner Option = new Scanner(System.in);
        System.out.println("Enter number between 1 to 5");
        int i = Option.nextInt();
        if (i == 1) {
            System.out.println("Your option is Addition");
        }
        if (i == 2) {
            System.out.println("Your option is Substraction");
        }
        if (i == 3) {
            System.out.println("Your option is Division");
        }
        if (i == 4) {
            System.out.println("Your option is Multiplication");
        }
        if (i == 5) {
            System.out.println("Your option is Average");
        }
        if (i>=6) {
            System.out.println("Please enter number between 1 to 5");
        }
    }
}
