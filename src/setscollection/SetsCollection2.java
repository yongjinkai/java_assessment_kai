package setscollection;

import java.util.HashSet;
import java.util.Set;

public class SetsCollection2 {
    public static void main(String[] args) {

        Set<String> names = new HashSet<>();
        String[] newNames = {"Andres","Ben","Cheryl","Derrick"};

        for (int i=0;i<newNames.length;i++){
            names.add(newNames[i]);
        }

        if (names.contains("Andres")){
            names.remove("Andres");
            names.add("Andres (Confirmed)");
        }
        System.out.println(names);
    }


}
