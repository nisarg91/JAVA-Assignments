package FirstAssignment;
import java.util.Scanner;

public class SecondTask_8 {

    public static void main (String[]args){
        char alphabet;
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter alphabet:");

        alphabet=input.next().charAt(0);
        System.out.println("Alphabet is:" + alphabet);

        if (alphabet == 'r' || alphabet == 'a' || alphabet == 'n' || alphabet == 'd' || alphabet == 'o' || alphabet == 'm' || alphabet == 'R' || alphabet == 'A' || alphabet == 'N' || alphabet == 'D' || alphabet == 'O' || alphabet == 'M')
        {
            System.out.println("FOUND");
        }
        else {
            System.out.println("NOT Found");
        }
    }
}
