package Strings;
import java.util.Scanner;

public class CapitalLetter {


    static boolean validString(String str){
        int count = 0;

        for(int i =0; i < str.length(); i++){
            if(Character.isUpperCase(str.charAt(i))){
                count ++;
            }
        }
        if(count == str.length()) return true;
        if(count == 0) return true;
        if(count == 1 && Character.isUpperCase(str.charAt(0))) return true;

        return false;
    }

    static void main() {
        Scanner st = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str = st.nextLine();
        System.out.println(validString(str));
    }
}
