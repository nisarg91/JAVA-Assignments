package FirstAssignment;
import java.util.Scanner;

public class SecondTask_7 {
    public static void main(String[]args){
        Scanner in = new Scanner (System.in);
        System.out.println("Please enter any number between 0 to 10000000: ");
        double input = in.nextDouble();

        if (input > 0)
        {
            if (input < 1)
            {
                System.out.println("Small number");
            }
            else if (input > 1000000){
                System.out.println("Large number");
            }
            else {
                System.out.println("Positive number");
            }
        }
        else if (input < 0 ){
            if (Math.abs(input) <1 ){
                System.out.println("Negative number");
            }
            else if (Math.abs(input) > 1000000){
                System.out.println("Negative number");
            }
            else {
                System.out.println("Negative Number");
            }
        }
        else {
            System.out.println("Zero");
        }
    }
}
