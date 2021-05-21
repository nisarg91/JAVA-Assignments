package FirstAssignment;

import java.util.Scanner;


public class SecondTask_6 {
    public static void main(String[] args){
        Scanner i = new Scanner(System.in);
        System.out.println("Please enter any integer:");
        int integer = i.nextInt();

        if (integer%2 !=0) {
            System.out.println("New");
            }
        else if (integer%2 ==0 && integer>=2 && integer<=5){
            System.out.println("Old");
            }
        else if (integer%2==0 && integer>=6 && integer<=30){
            System.out.println("New");
            }
        else if (integer%2==0 && integer<=30){
            System.out.println("Old");

        }

    }
}
