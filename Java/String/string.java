import java.util.Arrays;

class StringOperations {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        // String length and emptiness
        String str = "Hello";
        System.out.println("Length of string is " + str.length());
        System.out.println("String is empty or not: " + "".isEmpty());


        // Index of a substring
        String str2 = "this is an index";
        int index1 = str2.indexOf("is");
        System.out.println("Index of 'is': " + index1);

        int index2 = str2.indexOf("is", 4);
        System.out.println("Index of 'is' from 4th position: " + index2);

        System.out.println();

        int index3 = str2.indexOf('s', 7);
        System.out.println("Index of 's' from 7th position: " + index3);

        int index6 = str2.indexOf("iss", 5);
        System.out.println("Index of 'iss' from 5th position: " + index6);

        int index7 = str2.lastIndexOf("e");
        System.out.println("Last index of 'e': " + index7);

        int index8 = str2.lastIndexOf("e", 5);
        System.out.println("Last index of 'e' from 5th position: " + index8);

        // Substring
        String str3 = "Substring example";
        String substr1 = str3.substring(0, 5);
        System.out.println("Substring from 0 to 5: " + substr1);

        String substr2 = str3.substring(5);
        System.out.println("Substring from 5 to end: " + substr2);

        String substr3 = str3.substring(5, 10);
        System.out.println("Substring from 5 to 10: " + substr3);

        // Get characters
        char[] arr = new char[10];
        Arrays.fill(arr, '.');
        str.getChars(0, 3, arr, 1);
        System.out.println("Characters: " + Arrays.toString(arr));

        // String comparison
        String str4 = "java";
        String str5 = "java";
        String str6 = "JAVA";
        String str7 = "python";
        String str8 = new String("java");

        System.out.println("str4 equals str5: " + str4.equals(str5));
        System.out.println("str4 equals str6: " + str4.equals(str6));
        System.out.println("str4 equals str7: " + str4.equals(str7));
        System.out.println("str4 equals str8: " + str4.equals(str8));

        if (str4.equalsIgnoreCase(str6)) {
            System.out.println("Both strings are equal (ignoring case)");
        } else {
            System.out.println("Both strings are not equal (ignoring case)");
        }

        // String comparison (compareTo)
        String str9 = "hello";
        String str10 = "ieklo";
        String str11 = "Heklo";
        String str12 = "Flagship";
        String str13 = "Hello";

        System.out.println("Comparison of str9 and str12 (ignoring case): " + str9.compareToIgnoreCase(str12));

        // StartsWith and EndsWith
        String str14 = "Hello world";
        System.out.println("str14 starts with 'll': " + str14.startsWith("ll"));
        System.out.println("str14 starts with 'll' from 2nd position: " + str14.startsWith("ll", 2));
        System.out.println("str14 ends with 'ld': " + str14.endsWith("ld"));

        // Contains
        String str15 = "Hello, World!";
        System.out.println("str15 contains 'Hello': " + str15.contains("Hello"));
        System.out.println("str15 contains 'ello': " + str15.contains("ello"));

        // Join
        String str16 = String.join("-", "Java", "Is", "Cool");
        System.out.println("Joined string: " + str16);

        String str17 = String.join("*", "Java", "Is", "Cool");
        System.out.println("Joined string: " + str17);

        // Count occurrences of a word
        String str18 = "This is a test string. This string is for testing.";
        String word = "string";
        int count = countOccurrences(str18, word);
        System.out.println("Number of occurrences of '" + word + "': " + count);
    }

    public static int countOccurrences(String str, String word) {
        int count = 0;
        int index = str.indexOf(word);
        while (index != -1) {
            count++;
            index = str.indexOf(word, index + 1);
        }
        return count;
    }
}
