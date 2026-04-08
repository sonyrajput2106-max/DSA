public class Loops {
    static void main(){

        //for loop

        for(int i = 1 ; i  <=5; i++){
            System.out.println("value of i :" +i);
        }

        for(int i = 1; i<=4; i++){
            System.out.println("Sona");
        }

        // Nested for loops
        //example 1
        for(int i = 1; i<=3; i++){
            for(int j=1; j<=3;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        //example 2
        for (int i = 1; i<=3;i++){
            for (int j = 1; j<=3;j++){
                System.out.println("i=" +i +",j="+j);
            }
        }

        //Break (stop loop and get out of it)  keyword
        for (int i = 1; i<=10; i++){
            if(i==5){
                break;
            }
            System.out.println(i);
        }
//continue keyword(skip the iteration
        for (int i = 1; i<=10; i++){
            if(i==5|| i==4){
                continue;
            }
            System.out.println(i);
        }



        //while loop
//        initialize
//        int i =1;
//      condition
//        while(i<=5){
//            System.out.println(i);
//        updation
//            i++;
//        }

        //nested while loop
//        int i =1;
//        while(i<=2){
//            int j=1;
//            while(j<=3){
//                System.out.println("i="+i+",j="+j);
//                j++;
//            }
//            i++;
//        }

        //Do while loop
int i =1;
        do{
            System.out.println(i);
            i++;
        }while(i<=5);
    }
}
