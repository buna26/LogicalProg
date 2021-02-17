import java.util.Scanner;

public class ThirdLargest {
    public static void thirdLargest(int[] arr,int n){
        int FM = Integer.MIN_VALUE;
        int SM = Integer.MIN_VALUE;
        int TM = Integer.MIN_VALUE;
        int ans = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] > FM){
                FM = arr[i];
                ans = FM;
            }
        }
        for (int i = 0; i < n; i++) {
            if (arr[i] < FM && arr[i] > SM) {
                SM = arr[i];
                ans = SM;
            }
        }
        for (int i = 0; i < n; i++) {
            if (arr[i] < FM && arr[i] < SM && arr[i] > TM){
                TM = arr[i];
                ans = TM;
            }
        }
        if(n<3 || TM == Integer.MIN_VALUE){
            ans = -1;
        }
        System.out.println(ans);
    }
    public static void main(String[] args) {
        int arr[] = {2,4,1,3,5};
        int N = arr.length;
        thirdLargest(arr, N);
    }
}
// Time Complexity : O(n)
// Space Complexity : O(1)