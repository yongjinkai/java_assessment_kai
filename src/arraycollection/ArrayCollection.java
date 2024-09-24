package arraycollection;

import java.util.Collections;

public class ArrayCollection {
    public static void main(String[] args) {

        int[] myArray = new int[]{0,1,2};
        System.out.println(myArray.length);

        int[] myArray2 = {0,1,2,3};
        System.out.println(myArray2.length);

        int myArray3[] = {0,1,2,3,4};
        System.out.println(myArray3.length);

        int[] myArray4 = new int[4];
        System.out.println(myArray4.length);

        boolean[] myBoolArr = new boolean[3];
        System.out.println(myBoolArr[2]);

        char[] myCharArray = new char[]{'a','b','c'};

        for (int i = myCharArray.length-1; i >=0 ; i--) {
            System.out.println(myCharArray.length-i +". " + myCharArray[i]);
        }

        for (char x : myCharArray){
            System.out.println(x);

        int len = 6;
        int[] myClassScore = new int[6];

        }

    }
}
