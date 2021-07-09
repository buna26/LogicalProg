import java.util.Arrays;

public class MaximizeToys {
    static int toyCount(int N, int K, int arr[]) {
        Arrays.sort(arr);
        int ans = 0;
        int cost = 0;
        for (int i = 0; i<N; i++){
            if (cost+arr[i] <= K){
                cost+=arr[i];
                ans++;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {1, 12, 5, 111, 200, 1000, 10};
        int N = arr.length;
        int K = 50;
        System.out.println(toyCount(N, K, arr));

    }
}
