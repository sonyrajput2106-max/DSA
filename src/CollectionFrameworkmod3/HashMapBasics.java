package CollectionFrameworkmod3;

import java.util.*;

public class HashMapBasics {
    static void main() {
        Map<String,String> mapping = new HashMap<>();
//        Map<String,String> mapping = new LinkedHashMap<>();
//        Map<String,String> mapping = new TreeMap<>();

        //methods

        //Insertion
        mapping.put("in" ,"India");
        mapping.put("in" ,"India2"); // will modify the existing value
        mapping.put("en" , "England");
        mapping.put("us", "United States");

//printing mapping
        System.out.println(mapping);

        Map<String , String> table = new HashMap<>();
        table.put("br" ,"Brazil");

        System.out.println("Before:" + table);

        table.putAll(mapping);
        System.out.println("After:" + table);

        //deletion
        table.remove("en");
        System.out.println(table);

        System.out.println(table.get("br"));

        System.out.println(table.getOrDefault("usa" ,"null"));


        System.out.println(table.containsKey("in"));
        System.out.println(table.containsValue("India"));

        System.out.println(table);
        table.replace("in" , "Indonesia");
        System.out.println(table);


        Set<String> keyset = table.keySet();
        System.out.println(keyset);

        Collection<String> valueset = table.values();
        System.out.println(valueset);

        //get all the entries from map
        Set<Map.Entry<String, String>> entryset = table.entrySet();
        System.out.println("Printing entries:" + entryset);








//        table.putIfAbsent("is" ,"India3");
//        System.out.println(table);

//        System.out.println(table.size());
//        System.out.println(table.clear());


    }
}
