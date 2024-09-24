package setscollection;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;

public class SetsCollection1 {
    public static void main(String[] args) {
        Set<String> data = new HashSet<>();
        data.add("HTML");
        data.add("CSS");
        data.add("JavaScript");
        data.add("Java");
        data.add("JavaScript");
        System.out.println(data);

        ArrayList<String> dataArray = new ArrayList<>();
        dataArray.add("A");
        dataArray.add("C");
        dataArray.add("E");
        dataArray.add("D");
        dataArray.add("B");
        dataArray.sort(Comparator.reverseOrder());
        System.out.println(dataArray);




    }
}
