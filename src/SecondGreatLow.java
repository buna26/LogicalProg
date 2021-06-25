public class SecondGreatLow {
    public static int secondMax(int[] arr, int n){
        int FM = Integer.MIN_VALUE;
        int SM = Integer.MIN_VALUE;
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
        return ans;
    }

    public static int secondMin(int[] arr,int n){
        int FM = Integer.MAX_VALUE;
        int SM = Integer.MAX_VALUE;
        int ans = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] < FM){
                SM = FM;
                FM = arr[i];
                ans = FM;
            }
        }
        for (int i = 0; i < n; i++) {
            if (arr[i] != FM && arr[i] < SM) {
                SM = arr[i];
                ans = SM;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {4, 90};
        int n = arr.length;
        System.out.println(secondMin(arr,n)+" "+secondMax(arr, n));
    }
}
