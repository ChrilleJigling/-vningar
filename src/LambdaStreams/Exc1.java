
package LambdaStreams;

import java.util.ArrayList;
import java.util.List;


public class Exc1 {
    public static void main(String[] args) {
        List<String> myList = new ArrayList<>();
        myList.add("Chrille");
        myList.add("Nicke");
        myList.add("Aspen");
        myList.add("Kimpen");
        myList.add("Matte");
        myList.sort((t1,t2)-> t1.charAt(1) - t2.charAt(1) );
        myList.forEach(System.out::println);
    }
}
