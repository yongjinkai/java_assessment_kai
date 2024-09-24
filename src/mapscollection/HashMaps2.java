package mapscollection;

import java.util.HashMap;
import java.util.Map;

public class HashMaps2 {
    public static void main(String[] args) {

        Map<String,String> custAddress = new HashMap<>(){
            {
            put("Jason Ong", "Address 1 ");
            put("Alex Lim", "Address 2 ");
            put("Samantha Lee", "Address 3 ");
            put("Carlos Yip", "Address 4 ");
            }
        };
        System.out.println(custAddress.size());

        boolean customerExists = custAddress.containsKey("Jason");
        System.out.println(custAddress);

        custAddress.remove("Carlos Yip");
        System.out.println(custAddress.toString().toLowerCase());

        boolean custAddExists = custAddress.toString().toLowerCase().contains("address 1");
        System.out.println(custAddExists);
    }
}
