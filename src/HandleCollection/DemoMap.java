package HandleCollection;

import java.util.HashMap;
import java.util.Map;

public class DemoMap {
    public static void main(String[] args) {

        Map<String, String> hashMap = new HashMap<String, String>();
        hashMap.put("Windows", "2000");
        hashMap.put("Windows", "XP");
        hashMap.put("Language2", "Java");
        hashMap.put("Language1", ".Net");
        System.out.println("Các phần tử của Map");
        System.out.print("\t" + hashMap + "\n");

        System.out.println(hashMap.containsKey("Windows"));
        System.out.println(hashMap.containsValue("Java"));

        hashMap.remove("Windows");
        System.out.println(hashMap);

        //Retrieve value by key
        System.out.println(hashMap.get("Language2"));

        //Get all value of key and values
        for (Map.Entry<String, String> entry: hashMap.entrySet()){
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

    }
}
