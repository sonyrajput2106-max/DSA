public class Datatypes {
    static void main(){

        //explicit conversion
        long value1 = 123656656;
        int value2 = (int)value1;

        byte num1 =127;

//        short num2 =500;
        //implicit conversion
        long newNum = num1;
        System.out.println("new Num:" + newNum);
        System.out.println(num1);
//        System.out.println(num2);
        int num3 = 5000;
        long num4 = 34663365;
        System.out.println(num3);
        System.out.println(num4);

        //floating DTs
        float num5 = 3.45f;
        System.out.println(num5);

        double num6 =3.14444446767676D;
        System.out.println(num6);

        //other -char,Boolean
        boolean eligibleToVote = true;
        System.out.println(eligibleToVote);

        char firstCharacter = 'a';
        System.out.println("My first character is :"+ (firstCharacter+2) );



    }
}
