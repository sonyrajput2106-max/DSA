package OnAnswerPattern;

public class BookAllocationProblem {


    public static boolean isValidAns(int arr[], int k , int maxPages){
       //check whether mid  or maxPages is a valid solu or not
           int studentCount =1;
           int pages =0;

           for (int i =0; i< arr.length; i++){
               if (pages+arr[i] <= maxPages ){
                   //iska mtlb curr book can be assigned
                   //as it is not out pf limit
                   pages = pages + arr[i];
               }
               else{
                   //curr student ko curr book can't be assigned
                   studentCount++;
                   if (studentCount >k || arr[i] > maxPages){
                       return false;
                   }
                   else{
                        //can assign to new student
                       pages =0;
                       pages = pages +arr[i];
                   }
               }
           }
           return true;
    }

    public static int allocateBooks(int arr[], int k ){
        int n = arr.length;
        int s =1;
        int sum =0;

        for(int i =0;i<n;i++){
            sum = sum+arr[i];
        }

        int e= sum;
        int ans =-1;

        while (s<=e){
            int mid = s +(e-s)/2;

            if (isValidAns(arr, k, mid)){
                //ture wala case
                ans = mid;
                e = mid -1;
            }
            else{
                //false
                s = mid +1;
            }
        }

return ans;
    }

    static void main() {
        int [] arr={10,20,30,40,50};
        int k =2;

        int ans = allocateBooks(arr, k);
        System.out.println("Minimum pages :"+ ans);
    }
}
