public class Strings {


    // //practice questions
//    static void printString(String str2) {
//        int n = str2.length();
//        for (int i = 0; i <= n; i++) {
//            char ch = str2.charAt(i);
//            System.out.println(ch);
//        }
//    }

    //2 question
    static int getLengthOfString(String str) {
        char[] arr = str.toCharArray();
        int len = arr.length;
        return len;
    }

    //3 question
    static int getVowelCount(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }
        return count;
    }

    //4 question
    static String reverseString(String str) {
        String reverse = "";
        int n = str.length();
        for (int i = n - 1; i >= 0; i++) {
            char ch = str.charAt(i);
            reverse = reverse + ch;
        }
        return reverse;
    }

    //5 question
    static boolean isPalindrome(String str) {
        String original = str;
        String reverse = reverseString(original);

        for (int i = 0; i < original.length(); i++) {
            char ch1 = original.charAt(i);
            char ch2 = reverse.charAt(i);
            if (ch1 != ch2) {
                return false;
            }
        }
        return true;
    }

    static void main() {
        String str2 = "Sona";
//        printString(str2);
        System.out.println(getVowelCount(str2));
        System.out.println(reverseString(str2));

        //creation of string
//        String firstName = "sona";  //-> stored in string pool of heap memory
//
//        //or
//        String lastName = new String("Rajput");// directly into heap memory
//        System.out.println(firstName + " " + lastName);
//
//        //access of characters
//        System.out.println(firstName.length());
//        System.out.println(firstName.charAt(2));
//
////Comparing strings
//        String name1 = "sona";
//        String name2 = "sona";
//
//        // == -> it checks if both r refering to the same address or not
//        if (name1 == name2) {
//            System.out.println("both strings are equal");
//        } else {
//            System.out.println("both strings are not equal");
//        }
//
//        // equals() -> checks the actual content of the string (case sensitive)
//        if (name1.equals(name2)) {
//            System.out.println("equal strings");
//        } else {
//            System.out.println("not equal");
//        }
//
//        //.equals ignore case -> checks if the letters are same
//        if (name1.equalsIgnoreCase(name2)) {
//            System.out.println("strings are equal");
//        } else {
//            System.out.println("strings are not equal");
//        }
//
//
//        //Taking input
////        Scanner sc = new Scanner(System.in);
////        System.out.println("Provide the string content:");
////        String str = sc.nextLine(); // for a whole line
//////        String str = sc.next();  // for a word
////        System.out.println("value:" + str);
//
//
//        //string methods
//        String str = "Sona";
//        System.out.println(str.length());
//        System.out.println(str.charAt(2));
//        String name = "SONA";
//        System.out.println(str.equals(name));
//        System.out.println(str.equalsIgnoreCase(name));
//
//
//        String check = "";
//        System.out.println(check.length());
//        System.out.println(check.isEmpty()); // if length is 0 -> true
//        System.out.println(check.isBlank()); // if there are spaces in an empty string
//
//
//        String fullName = "   Manik    ";
//        System.out.println(fullName.length());
//        fullName = fullName.trim();
//        System.out.println(fullName.length());
//
//        System.out.println(fullName.toUpperCase());
////        System.out.println(fullName.toLowerCase());
//
//
//        String line = "My name is Sona";
//        // beginIndex -> 3 = inclusive  but endIndex ->6 = exclusive
//        System.out.println(line.substring(3, 6));
//        System.out.println(line.contains("Sona"));
//
//
//        int num = 5123;
//        String mn = String.valueOf(num);
//        System.out.println(num + 1);
//        System.out.println(mn + 1);
//
//        String naam = "Sony Rajput";
//        System.out.println(naam.startsWith("Sony"));
//
//        char[] arr = naam.toCharArray();
//
//        for (char ch : arr) {
//            System.out.println("value of char :" + ch);
//        }
//
//        // split method -> output-> string array
//        String input = "My, name , is, sona, rajput";
//        String[] words = input.split(",");
//        for (String str1 : words) {
//            System.out.println(str1);
//        }
//
//
//        //replace method
//        String surName = "Rajput";
//        surName = surName.replace('a', 'b');
//        System.out.println(surName);


    }

}
