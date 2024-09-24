package switchcondition3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int purchase;
        int discount;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your purchase quantity");
        purchase = scanner.nextInt();

        System.out.println("Please enter your discount coupon ");
        discount = scanner.nextInt();
        switch (discount){
            case 20,30:
                if (purchase>5)
                    System.out.println("You are entitled to "+ (discount+5) + "% discount");
                else
                    System.out.println("You have a discount of " + discount + "%");
            break;
            default:
                System.out.println("Please enter either 20 or 30% discount");
        }
    }
}
