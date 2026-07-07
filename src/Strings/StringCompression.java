package Strings;

public class StringCompression {


    static int compressString(char[] s){
        int readIndex =0;
        int writeIndex = 0;

        while(readIndex < s.length){
            char currentChar = s[readIndex];
            int count =0;

          //count duplicate character
            while(readIndex < s.length && currentChar == s[readIndex]){
                readIndex++;
                count++;
            }

            //ab mere pas curr charcater and uska count h
            s[writeIndex] = currentChar;
            writeIndex++;
            //now insert the count
            if(count > 1){
                String countStr = String.valueOf(count);
                 for(char digit: countStr.toCharArray()){
                     s[writeIndex] = digit;
                     writeIndex++;
                 }
            }
        }
//return the length of compressed string
return writeIndex;
     }

    static void main() {
        char[] s = {'a','a','b','b','c','c','c'};
        System.out.println(compressString(s));
    }
}
