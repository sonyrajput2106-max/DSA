public class Patterns {
    static void main(){


//        the core formula
//        for(row =1 to n)
//        for(col=1 to n or variable)
//        print


//        int n=3;
//        for (int i =1; i<=n;i++){
//            for (int  j=1; j<=5;j++){
//                System.out.print("* ");
//            }
//            System.out.println("");
//        }
//int n=5;
//         for (int i=1; i<=n;i++ ){
//             for (int j = 1; j<=i;j++){
//                 System.out.print("* ");
//             }
//             System.out.println("");
//         }


//        int n= 5;
//        for (int row=1; row<=5;row++){
//            //for eaxh row -> spaces, stars
//
//            //spaces
//            for (int col=1; col<=n-row;col++){
//                System.out.print(" ");
//            }
//            //stars
//            for (int col=1;col<=n;col++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//


//        int  n = 5;
//        for (int i = 1;i<=n;i++){
//            //stars
//            for (int j = 1; j<=n-i+1;j++){
//                System.out.print("* ");
//            }
//
//            System.out.println();
//        }


        int n=5;
        for (int  i = 1; i<=5;i++){
            //spaces
            for (int j = 1; j<=n-i;j++){
                System.out.print(" ");
            }
            for (int j= 1; j<=2*i-1;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
