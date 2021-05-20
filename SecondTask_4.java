package FirstAssignment;

import java.util.Scanner;

public class SecondTask_4 {
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Positive number to continue or Negative number to break");
        int number = scan.nextInt();

    if (number >=0) {
        System.out.println("Good Going");
        System.out.println("You entered positive number");
    }
    else {
        System.out.println("You entered negative number");
        System.out.println("Its over");


    }
    }
}