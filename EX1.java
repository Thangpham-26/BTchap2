import java.lang.Character;
public class EX1 {
    public static void main(String[] args) {
        // Is character a letter
        System.out.println(Character.isLetter('a'));  // true
        System.out.println(Character.isLetter('0')); // false
        System.out.println(" ");

        // Is character a digit
        System.out.println(Character.isDigit('b'));  // false
        System.out.println(Character.isDigit('9'));  // true
        System.out.println(" ");

        // Is character a whitespace
        System.out.println(Character.isWhitespace('A'));  // false
        System.out.println(Character.isWhitespace(' '));  // true
        System.out.println(Character.isWhitespace('\t'));  // true
        System.out.println(Character.isWhitespace('\n'));  // true
        System.out.println(Character.isWhitespace(9)); // true because in ASCII code 9 is HT
        System.out.println(" ");

        // Is character uppercase
        System.out.println(Character.isUpperCase('A'));  // true
        System.out.println(Character.isUpperCase('a'));  // false
        System.out.println(Character.isUpperCase(65)); // true because in ASCII code 65 is 'A'
        System.out.println(" ");

        // Is character lowercase
        System.out.println(Character.isLowerCase('A'));  // false
        System.out.println(Character.isLowerCase('a'));  // true
        System.out.println(Character.isLowerCase(97)); // true because in ASCII code 97 is 'a'
        System.out.println(" ");

        // UpperCase a character
        System.out.println(Character.toUpperCase('a'));  // 'A'
        System.out.println(Character.toUpperCase(97));  // '65'
        System.out.println(Character.toUpperCase(48)); // '48' in ASCII code is number 0
        System.out.println(" ");

        // LowerCase a character
        System.out.println(Character.toLowerCase('A'));  // 'a'
        System.out.println(Character.toLowerCase(65)); // '67'
        System.out.println(Character.toLowerCase(48)); // '48'
        System.out.println(" ");


        System.out.println(Character.toString('x'));
        System.out.println(Character.toString('Y'));
        System.out.println(" ");


        System.out.println(Character.isJavaIdentifierPart('.'));
        System.out.println(Character.isJavaIdentifierPart('a'));
        System.out.println(Character.isJavaIdentifierPart('0'));
        System.out.println(" ");


        System.out.println(Character.isJavaIdentifierStart('a'));
        System.out.println(Character.isJavaIdentifierStart('1'));
        System.out.println(Character.isJavaIdentifierStart('$'));
    }
}
