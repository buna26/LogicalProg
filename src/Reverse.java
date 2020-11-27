import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Reverse {
    public static void main(String[] args) {
        int num = 2489;
        int count = 0;
        int ans1 =0,ans2 =0;
        int[] arr = new int[10];
        List<Integer> arr2 = new LinkedList<>();
        while (num != 0) {
            int digit = num % 10;
            arr[count++] = digit;
            num /= 10;
            ans1 = ans1 * 10 + digit;
        }
        for(int k=count-1;k>=0;k--){
            ans2=ans2*10+arr[k];
            arr2.add(arr[k]);

        }
        System.out.println("input: "+ans2);
        Collections.reverse(arr2); //Array list reverse
        System.out.println("output: "+arr2);
    }
}
