package HandleCollection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DemoArrayList {
    public static void main(String[] args) {

//        ArrayList<String> arrayList = new ArrayList<String>();
        List<String> arrayList = new ArrayList<String>();
        arrayList.add("PHP");
        arrayList.add("Python");
        arrayList.add("Java");
        arrayList.add("PHP");
        arrayList.add("C++");
        System.out.println("Các phần tử của ArrayList");
        System.out.print("\t" + arrayList + "\n");

        System.out.println(arrayList.size());

        //Delete index
        arrayList.remove(3);
        System.out.println(arrayList);

        //Check contains
        System.out.println(arrayList.contains("Java"));

//        arrayList.removeAll(arrayList);
//        System.out.println(arrayList);

        // Show list through Iterator
        Iterator<String> itr = arrayList.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next() + ", ");
        }

        //Duyệt theo for cải tiến
        // Show list through for-each
        System.out.println();
        for (String obj : arrayList) {
            System.out.println(obj + ", ");
        }

        //Duyệt theo for cơ bản
        // Show list through index
        System.out.println();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            System.out.println(arrayList.get(i) + ", ");
        }

    }
}
