import java.util.Scanner;

public class Collatz_Conjecture {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("> ");
        int value = sc.nextInt();
        int count = 0;
        while (value != 1) {
            count++;
            if (value%2 == 1) {
                value = value*3 + 1;
            }
            else {
                value = value/2;
            }
            System.out.println(value);
        }
        System.out.println("Reached 1 after " + count + " iterations.");
    }
}
