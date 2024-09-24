package arrlistcollection;

import java.util.ArrayList;

public class ArratListCollection {
    public static void main(String[] args) {
        ArrayList<String> participants = new ArrayList<String>();

        ArrayList<String> participants2 = new ArrayList<>();
        participants.add(null);
        participants.add("Angela");



//        participants.remove("Ben");
        System.out.println(participants.size());
        participants.set(0,"Angelia");
// 8. Challenge: Use a for loop to change the name where the value "Angelia" occurs

// Change the name from "Angelia" to "Angel"
        for(int i=0;i<participants.size();i++){
            if (participants.get(i).equals("Angelia")) participants.set(i,"Angel");
        }
        System.out.println(participants.contains("Angel"));


    }
}
