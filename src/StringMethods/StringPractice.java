package StringMethods;

import java.nio.charset.StandardCharsets;

public class StringPractice {
    public static void main(String[] args) {
        String str1="Hello";
        String str2="hello";

        String name = "jenish";
        char[] chars = name.toCharArray();

        System.out.println(chars);

        for(char c : chars){
            System.out.println(c);
        }
        System.out.println(str2.contentEquals(str1));
        System.out.println(str1.hashCode());
        System.out.println(str1.matches(str2));

        String result = String.format("Hello %s welcome to %s", "Jenish","Konoha");
        System.out.println(result);

        byte[] byteArray = name.getBytes(StandardCharsets.UTF_8);
        System.out.println("Byte array of name");
        for (byte b : byteArray){
            System.out.println(b + " ");
        }
    }
}
