import java.util.Scanner;


public class Mindtree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int ans = 0;
        int[] arr = new int[m+1];
        for(int i = 1; i <= m; i++) {
            arr[i] = i*n;
        }
        for(int j : arr) {
            ans = ans + j;
        }
        System.out.println(ans/m);
    }
}
/* n=3,m=5
   arr[i]=[3*1,3*2,.....,3*5]
   ans = (3+6+9+12+15)/5 = 9
*/