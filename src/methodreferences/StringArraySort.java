package methodreferences;

import java.util.Arrays;
import java.util.List;


public class StringArraySort {
    // Method reference to an instance method of an arbitrary object of a particular type
    public static void main(String args[]) {
      String arrayList[] = {"bala","jana", "kalai", "malai"};
       Arrays.sort(arrayList, String::compareToIgnoreCase);
       List<String> list = Arrays.asList(arrayList);
        list.forEach(str -> System.out.println(str));
    }
}
