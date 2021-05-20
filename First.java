package FirstAssignment;
import java.util.Scanner;

//Swap two numbers using third variable

class First {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter first number : ");
        int a = in.nextInt();
        System.out.print("Enter second number : ");
        int b = in.nextInt();
        int temp;
        System.out.print("Before swaping : ");
        System.out.print("a=" + a + "   b=" + b);
        System.out.println();
        temp = a;
        a = b;
        b = temp;
        System.out.print("After swaping : ");
        System.out.print("a=" + a + "   b=" + b);

    }
}

// Write a program to print the value given by the user.

class Second {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = in.nextInt();
        System.out.println("You entered: ");

    }
}

//Write the program to complete the task below:

class Third {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a,b,z;

        System.out.println("Enter First number (between 1-10):");
        a= in.nextInt();
        System.out.println("Enter Second number (between 1-10):");
        b= in.nextInt();
        z=a+b;

        z+=30;
        System.out.println("The value of z is: " + z);

    }
}
