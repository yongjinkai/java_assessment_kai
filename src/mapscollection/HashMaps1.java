package mapscollection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMaps1 {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();
        map.put(1,"Albert");
        map.put(2,"Ben");
        map.put(3,"Charlie");
        map.put(4,"Dave");
        System.out.println(map);

        Set set = map.entrySet();
        System.out.println(set);
        Iterator iterations = set.iterator();
//        while (iterations.hasNext()){
//            Map.Entry entry = (Map.Entry)iterations.next();
//            System.out.println(entry.getKey() + " : " + entry.getValue());
//        }

        for (Map.Entry<Integer,String> entry : map.entrySet()){
            System.out.println(entry.getKey()+ " : "+entry.getValue());
        }

        map.forEach((key,value)-> System.out.print(key + " : " + value));
    }

}
