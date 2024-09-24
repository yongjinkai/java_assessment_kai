package switchcondition;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int input;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        input = scanner.nextInt();

        switch (input){
            case 0:
                break;
            case 1:
                System.out.println("the number is 1");
                break;
            case 2:
            case 3:
                System.out.println("the number is 2 or 3");
                break;
            default:
                System.out.println("invalid");
        }
    }
}
