public class basicMaths {
    static void main() {
        int a = 10;
        int b = 3;

        System.out.println(a + b); // 13
        System.out.println(a - b); // 7
        System.out.println(a * b); // 30
        System.out.println(a / b); // 3
        System.out.println(a % b); // 1


        //TO extract last digit

        int n = 2345;
        int extractLastDigit = n % 10;

        // to remove last digit

        int removeLastDigit = n / 10;


        //count  number of digits in a number
        int m = 12345;
        int count = 0;

        while (n > 0) {
            count++;
            n = n / 10;
        }

        System.out.println("Number of digits = " + count);

        //sum of all digits
        int num = 1234;
        int sum = 0;

        while (n > 0) {
            int digit = n % 10;
            sum = sum + digit;
            n = n / 10;
        }
        System.out.println("Sum of digits:" + sum);

        //reverse a number
        int num1 = 2345;
        int rev = 0;

        while (n > 0) {
            int digit = n % 10;
            rev = rev * 10 + digit;
            n = n / 10;
        }
        System.out.println("Reverse of the number is:" + rev);


        // even and odd numbers
        int num2 = 7;

        if (num2 % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }


        // check if number is palindrome or not
        int number = 1331;
        int original = number;
        int reverse = 0;

        while (n > 0) {
            int digit = number % 10;
            rev = rev * 10 + digit;
            n = n / 10;
        }

        if (original == reverse) {
            System.out.println("number is palindrome");
        } else {
            System.out.println("number is not palindrome");
        }

    }

}
