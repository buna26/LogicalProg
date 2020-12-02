import java.util.Scanner;

public class Cards {
    public static void main(String[] args) {
        int n;
        int ver=2, hor=1;
        int ans =0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Level: ");
        n = sc.nextInt();
        for(int i=0; i<n; i++){
            ans += ver;
            ver+=2;
        }
        for(int i=0; i<n-1; i++){
            ans += hor;
            hor++;
        }
    System.out.println("total card: "+ans);
    }
}
