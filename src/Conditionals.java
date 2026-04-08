import java.util.Scanner;

public class Conditionals {
    static void main(){
//int dailyPractice = 12;
//
//if(dailyPractice >= 10){
//    System.out.println("Good Consistency");
//}

        //If-else statements
        int score =42;
        if( score >= 50){
            System.out.println("Pass");
        }else{
            System.out.println("Fail");
        }

        //if-else -if Ladder
        int accuracy  =78;

        if(accuracy>=90){
            System.out.println("Excellent");
        } else if (accuracy>=75) {
            System.out.println("Good");

        } else if (accuracy>=68) {
            System.out.println("Average");
        }
        else{
            System.out.println("Needs Improvement");
        }

        //Nested if-else
        boolean hasSubscription = true;
        int solveProblem =220;

        if (hasSubscription){

            if(solveProblem >=200){
                System.out.println("Unlock Advanced Sheet");
            } else{
                System.out.println("Practice more problems");
            }
        }else{
            System.out.println("Upgrade to Premium");
        }


        //Switch statement
        System.out.println("Enter the value for day");
        Scanner sc = new Scanner(System.in);
int day = sc.nextInt();

switch(day){
    case 1:
        System.out.println("Monday");
        break;
    case 2:
        System.out.println("Tuesday");
        break;
    case 3:
        System.out.println("Wednesday");
        break;
    case 4:
        System.out.println("Thursday");
        break;
    case 5:
        System.out.println("Friday");
        break;
    case 6:
        System.out.println("Saturday");
        break;
    case 7:
        System.out.println("Sunday");
        break;
    default:
        System.out.println("Invalid day");

}



    }
}
