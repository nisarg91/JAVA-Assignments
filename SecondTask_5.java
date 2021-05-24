package FirstAssignment;

public class SecondTask_5 {
    public static void main(String[] args) {
        int number =0;
        while (number < 6 ) {
            if (number == 3) {
                number++;
                continue;
            }
            if (number == 6 ) {
                number++;
                continue;
            }
            System.out.println(number  );
            number++;
        }
    }
}
