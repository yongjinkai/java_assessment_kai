package loops;

public class Breakcont {
    public static void main(String[] args) {
//        for (int i=0; i<10; i++){
//            if (i==3) break;
//            System.out.println(i);
//        }
//
//        int count = 0;
//        while (count<10){
//            if (count==5) break;
//            System.out.println(count);
//            count++;
//
//        }
        int index =0;
        while (index <10){
            if (index == 3) {
                index++;
                continue;
            }
            System.out.println(index);
            index++;
        }
    }}
