import java.lang.StringBuffer;
public class EX2 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer(" Hello ");

        // Apend
        sb.append("World");
        System.out.println(sb); // " Hello World "
        System.out.println(" ");

        // Insert
        sb.insert(6, ",");
        System.out.println(sb); // " Hello, World "
        System.out.println(" ");

        // Delete
        sb.delete(6, 7);
        System.out.println(sb); // " Hello World "
        System.out.println(" ");

        // Replace
        sb.replace(7, 12, "You");
        System.out.println(sb); // " Hello You "
        System.out.println(" ");

        // Reverse
        sb.reverse();
        System.out.println(sb); // " uoY olleH "
        System.out.println(" ");

        // Capacity
        System.out.println(sb.capacity()); // " 23 "
        System.out.println(" ");

        // Length
        System.out.println(sb.length()); // " 10 (length of " ouY olleH ") "
        System.out.println(" ");

        // CharAt
        System.out.println(sb.charAt(0)); // " u "
        System.out.println(" ");

        // Substring
        System.out.println(sb.substring(4)); // " olleH "
        System.out.println(" ");

        // ToString
        String str = sb.toString(); // " uoY elloH "
        System.out.println(str);
    }
}
