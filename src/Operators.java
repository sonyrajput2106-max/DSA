public class Operators {
    static void main() {

        // Arithmetic Operators
        int solvedThisWeek = 25;
        int solvedLastWeek = 15;

        int total = solvedThisWeek + solvedLastWeek;
        int diff = solvedThisWeek - solvedLastWeek;
        int projected = solvedThisWeek * 4;
        int average = solvedThisWeek / 7;
        int remainder = solvedThisWeek % 7;


        System.out.println(total);
        System.out.println(diff);
        System.out.println(projected);
        System.out.println(average);
        System.out.println(remainder);

// Relational Operators
        int currentStreak = 45;
        int targetStreak = 50;

        System.out.println(currentStreak == targetStreak);
        System.out.println(currentStreak != targetStreak );
        System.out.println(currentStreak > targetStreak);
        System.out.println(currentStreak < targetStreak);
        System.out.println(currentStreak >= targetStreak);
        System.out.println(currentStreak <= targetStreak);

// Logical Operators
        boolean completeDSA = true;
        boolean completeCore = false;

        System.out.println(completeDSA && completeCore);
        System.out.println(completeDSA || completeCore);
        System.out.println(!completeCore);


        //Assignment Operators
        int ratingPoints = 100;

        ratingPoints += 20;  //rp = rp+20
        System.out.println(ratingPoints); // 100+20

        ratingPoints -= 10; // rp=rp-10
        System.out.println(ratingPoints); //120-10

        ratingPoints *= 2; //rp = rp *2
        System.out.println(ratingPoints); // 110 * 2

        ratingPoints /= 4; //rp = rp / 4
        System.out.println(ratingPoints); // 220/4

        ratingPoints %= 30; // rp = rp % 30
        System.out.println(ratingPoints); // 55 % 30


   //Unary  (INC/DEC) Operators
         int activeUsers = 100;

         int  prefix = ++ activeUsers;
// pehle activeUser increment hua and bngya = 101
        // fir prefix m copy hua , so prefix ki value =102
         int postfix = activeUsers;
         // activeUser =101
        // pehle use krte h , prefix me copy hoke , postfix =101
        // uske baad increment krdia , activateUsers =102


        System.out.println(prefix);
        //101
        System.out.println(postfix);
        //101
        System.out.println(activeUsers);
        //102


        //Bitwise Operators
        int a = 5;   // 0101
        int b = 3;   // 0011

        int result1 = a & b;
        int result2 = a | b;
        int result3 = a ^ b;
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);

        //Ternary operators
        int age = 18;

        String result = (age >= 18) ? "Adult" : "Minor";

        System.out.println(result);


        //Instanceof operator
       // The instanceof operator is used to check whether an object belongs to a particular class or not (or is a subclass of that class).
//
//        class Animal {
//        }
//
//        class Dog extends Animal {
//        }
//
//        public class Test {
//            public static void main(String[] args) {
//                Dog d = new Dog();
//
//                System.out.println(d instanceof Animal);
//            }
//        }
    }
}

