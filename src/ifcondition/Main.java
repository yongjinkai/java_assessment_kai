package ifcondition;

import variables.GENDER_TYPE;
import variables.UserProfile;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        UserProfile user = new UserProfile();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter your name: ");
        String name = scanner.nextLine();
        user.setName(name);

        System.out.print("Please enter your age: ");
        int age = scanner.nextInt();
        user.setAge(age);

        System.out.print("Please enter your gender: ");
        char gender = scanner.next().charAt(0);
        if(gender == 'm') user.setGender(GENDER_TYPE.MALE);
        else user.setGender(GENDER_TYPE.FEMALE);

        if(age>20){
            if (user.getGender() == GENDER_TYPE.MALE)
                System.out.println("Welcome Mr. " + user.getName());
            else
                System.out.println("Welcome Ms. " + user.getName());
        }
        else{
            System.out.println("You are not eligible for the event");
        }
    }
}
