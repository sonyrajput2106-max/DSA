package Strings;

public class RemoveAllOccurance {


    static String removeOccurance(String s , String part){
        while(s.contains(part)){
            //search part inside s
            int index = s.indexOf(part);

            //create a new string by merging the left and right part of
            //dound substring inside s string
            s= s.substring(0,index) + s.substring(index + part.length());
        }
    return s;
    }


    static void main() {
    String s = "ababcab";
    String part = "ab";

        System.out.println(removeOccurance(s, part));
    }
}
