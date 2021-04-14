import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class PrimeGame {
    public static void prime(boolean[] arr, int range){
        arr[0] = false;
        arr[1] = false;
        for(int i=4; i<=range; i+=2){
            arr[i] = false;
        }
        for(int i=3; i<=range; i+=2){
            if(arr[i]){
                for( int j=i*i; j<=range; j+=i){
                    arr[j] = false;
                }
            }
        }
    }
    public static int minMax(boolean[] primes, int start , int end, boolean flag){
        if (flag){
            for(int i = start; i <= end; i++){
                if(primes[i]){
                    return i;
                }
            }
        }
        else {
            for (int i = end; i >= start; i--) {
                if (primes[i]) {
                    return i;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        List<Integer> ans = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();
        int[] limit = new int[2];
        int range = 10000;
        boolean[] primes = new boolean[range+1];
        Arrays.fill(primes,true);
        prime(primes,range);

        while(K!=0){
            for(int i =0; i<2; i++){
                limit[i] = sc.nextInt();
            }
            int min = minMax(primes, limit[0],limit[1] ,true );
            int max = minMax(primes, limit[0], limit[1], false );
            if(min==-1 && max==-1){
                ans.add(-1);
            }
            else ans.add(max-min);
            K--;
        }
        for (int value:ans) {
            System.out.println(value);
        }
    }
}
