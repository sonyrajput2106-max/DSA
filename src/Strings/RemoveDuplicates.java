package Strings;

public class RemoveDuplicates {


    static String removeDuplicates(String str){

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (sb.length() > 0 && sb.charAt(sb.length() - 1) == ch) {
                sb.deleteCharAt(sb.length() - 1);
            } else {
                sb.append(ch);
            }
        }

        return sb.toString();
    }


    static void main() {
        String str = "abbaca";
        System.out.println(removeDuplicates(str));
    }
}
