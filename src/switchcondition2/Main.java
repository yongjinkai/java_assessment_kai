package switchcondition2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String day = "";
        Scanner scanner = new Scanner(System.in);

        while(day!= "q") {
            System.out.print("Please enter the day of the week or to (Q)uit: ");
            day = scanner.nextLine();
            switch (day.toLowerCase().substring(0, 3)) {
                case "mon":
                    System.out.println("Monday blues..");
                    break;
                case "tue", "wed", "thu", "fri", "sat":
                    System.out.println("Almost there!!");
                    break;

                default:
                    System.out.println("Everyday is sunday!");
            }
        }
    }}
