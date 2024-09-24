package logicaloperators.utils;

public class PrinterHelper {
    public static void showMainMenu() {
        System.out.println("*--- Check your grade ---*");
        System.out.println("Select an option:");
        System.out.println("a. Enter a grade");
        System.out.println("b. Exit program");
        System.out.println("****************");
    }
    public static void showGradeMenu(){
        System.out.print("Enter a grade: ");
    }

    public static void showGradeFeedback(String feedback) {
        System.out.println("*--- Grade Result ---*");
        System.out.println(feedback+"\n");
    }

}
