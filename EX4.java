import java.util.ArrayList;
import java.lang.String;

public class EX4 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        String str = "Hello, World!";

        /* java.utill.ArrayList */
        // add(E e)
        list.add("Apple");
        list.add("Banana");
        list.add("Grape");

        // get(index)
        System.out.println(list.get(0));
        System.out.println(" ");

        // remove(index)
        list.remove(1);
        System.out.println(list);
        System.out.println(" ");

        // size()
        System.out.println(list.size());
        System.out.println(" ");

        //contains(o)
        System.out.println(list.contains("Banana"));
        System.out.println(" ");

        /* java.lang.String */
        //length()
        System.out.println(str.length());
        System.out.println(" ");

        //charAt(index)
        System.out.println(str.charAt(0));
        System.out.println(" ");

        //substring(beginIndex, endIndex)
        System.out.println(str.substring(0,5));
        System.out.println(" ");

        //toUpperCase()
        System.out.println(str.toUpperCase());
        System.out.println(" ");

        //contains(sequence)
        System.out.println(str.contains("World"));
    }
}
