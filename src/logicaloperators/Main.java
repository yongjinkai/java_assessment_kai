package logicaloperators;

import logicaloperators.grader.Grader;
import logicaloperators.utils.PrinterHelper;

import java.util.Scanner;

import static java.lang.System.exit;


public class Main {
    public static void main(String[] args) {
        char option;
        int grade;
        Scanner scanner = new Scanner(System.in);
        //        Show main menu when program runs

        do {
            PrinterHelper.showMainMenu();
            option = scanner.next().charAt(0);
            if (Character.toLowerCase(option) != 'a') continue;
            PrinterHelper.showGradeMenu();
                grade = scanner.nextInt();
               Grader finalGrade = new Grader(grade);
               PrinterHelper.showGradeFeedback(finalGrade.showGrade());
               exit(0);
        }while(option !='b');
//        Wait for user input to continue
    }
}
