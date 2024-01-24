package HandleCollection;

import java.util.HashSet;
import java.util.Set;

public class DemoSet {
    public static void main(String[] args) {

        Set<String> hashSet = new HashSet<String>();
        hashSet.add("PHP");
        hashSet.add("Python");
        hashSet.add("Java");
        hashSet.add("Java");
        hashSet.add("C++");
        System.out.println("Các phần tử của Set (Không sắp xếp theo thứ tự, không giá trị )");
        System.out.print("\t" + hashSet + "\n");

        System.out.println(hashSet.size());

        //Delete value
        hashSet.remove("Java");
        System.out.println(hashSet);

        //Check contains
        System.out.println(hashSet.contains("Java"));

        hashSet.removeAll(hashSet);
        System.out.println(hashSet);
    }
}
