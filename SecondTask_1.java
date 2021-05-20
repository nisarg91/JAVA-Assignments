package FirstAssignment;
import java.util.Scanner;

public class SecondTask_1 {
    public static void main(String[] args) {
        Scanner integer = new Scanner(System.in);
        System.out.println("Enter a number");
        int i = integer.nextInt();

//If the number is divisible by 3 then it should print "Consultadd" as a string
        if (i % 3 == 0 && i % 5 == 0) {
            System.out.println("Consultadd Java Training");
        }

//If the number is divisible by 5 then it should print "Java Training" as a string
        else if (i % 5 == 0) {
            System.out.println("Java Training");
        }

//If a number is divisible by 3 and 5 then it should print "Consultadd Java Training" as a string
        else if ( i % 3 == 0) {
            System.out.println("Consultadd");
        }
        else {
            System.out.println("The number is not divisible by 3 or 5");
        }

    }
}