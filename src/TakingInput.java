import java.math.BigInteger;
import java.util.Scanner;

public class TakingInput {
    static void main (){
        int a = 5;
        int b= 1;
        System.out.println(a+b);


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of firstNum:");
        int firstNum =sc.nextInt();
        System.out.println("Enter the value for secondNum:");
        int secNum = sc.nextInt();
        int ans = firstNum + secNum;
        System.out.println("the sum of both numbers are" +ans);

         BigInteger bg = sc.nextBigInteger();
        System.out.println("BigInteger :" + bg);

        System.out.println("enter the value for flag");
        boolean flag = sc.hasNextBoolean();
        System.out.println("enter the value for shortVal");
        short shortVal = sc.nextShort();
        System.out.println("enter the value for floatValue");
        float floatValue = sc.nextFloat();


        System.out.println("flag is:"+ flag);
        System.out.println("shortVal is: "+ shortVal);
        System.out.println("floatValue is:" +floatValue);

        sc.close();
    }
}
