public class Methods {
    static void printTable() {
        for (int i = 1; i <= 10; i++) {
            int ans = 2 * i;
            System.out.println("->" + ans);
        }
    }


    //with parameters
    static void printSum(int x, int y) {
        System.out.println(x + y);
    }

    //nom-void return type methos
    static int add(int m, int n) {
        int sum = m + n;
        return sum;
    }


    //Method overloading-> same method names with different parameters
    static int add(int p, int q, int r) {
        int ans = p + q + r;
        return ans;
    }

    //call by value -> copy pas kr rhe ho
    static void solve(int num) {
        System.out.println(num);
        num = num * 10;
        System.out.println(num);
    }

    static void printMultiple() {
        int value = 20;
        for (int i = 1; i <= 5; i++) {
            System.out.println(20 * i);
        }
        System.out.println(value); //locally scoped variable
    }


    static void main() {

//        printTable();
//        printSum(12, 13);
//        int result = add(14, 15);
//        System.out.println("Result is" + result);
//
//        int ans1 = add(1, 3);
//        int ans2 = add(3, 4, 5);
//        System.out.println(ans1);
//        System.out.println(ans2);

        int num = 5;
        System.out.println(num);
        solve(num);
        System.out.println(num);
    }

}
