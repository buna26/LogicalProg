import java.util.Arrays;

public class PrimeSieve {
    public static void primeSieve(boolean[] arr, int range){
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
    public static void main(String[] args) {
        int range = 30;
        boolean[] primes = new boolean[range+1];
        Arrays.fill(primes,true);
        primeSieve(primes,range);
        for(int i=1; i<=range; i++){
            if(primes[i]){
                System.out.println(i);
            }
        }
    }
}
