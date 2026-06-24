package OnAnswerPattern;

public class EKOSPOJProblem {

    public  static boolean isValidAns(int trees[] , int m , int maxHeight){
        long totalWoodCollected = 0;

        for(int i =0; i< trees.length; i++){
            if(trees[i] > maxHeight){
                //iska mtlb , sawBlade overall tree height se chota h
                //therefore, pkka kuch amount of wood dega katne par
                long currTreeWoodCollected = trees[i]- maxHeight;
                totalWoodCollected += currTreeWoodCollected;
            }
        }
        if(totalWoodCollected >= m){
            return true;
        }
        else{
            return false;
        }

    }

    public static int maxSawHeight(int[]trees , int m){
        int n = trees.length;
        int s= 0;

        int maxi =-1;
        for(int i =0; i< n ; i ++){
            if(trees[i] > maxi){
                maxi = trees[i];
            }
        }

        int ans = -1;
        int e = maxi;

        while(s<= e){
            int mid = s +(e-s)/2;

            if(isValidAns(trees, m , mid)){
                ans = mid;
                s = mid +1;

            }
            else{
                e = mid -1;
            }
        }
        return ans;
    }

    static void main() {
int trees[] ={20,15,10,17};
int m = 7;
        System.out.println(maxSawHeight(trees, m));
    }
}
