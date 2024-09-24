package loops;

public class While {
    public static void main(String[] args) {
        int init = 6;

        while (init<5){
            System.out.println("While loop Output is " + init);
            init++;
        }

        do{
            System.out.println("Do-While loop Output is " + init);
            init++;
        }while (init<5);
    }
}
