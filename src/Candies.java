import java.util.Scanner;

public class Candies {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number");
        int num = sc.nextInt();
        int N = 10;
        int K = 5;
        if(num>=1 && num<=K){
            System.out.println("NUMBER OF CANDIES SOLD : "+num);
            System.out.println("NUMBER OF CANDIES AVAILABLE : "+(N-num));
        }
        else{
            System.out.println("INVALID INPUT");
            System.out.println("NUMBER OF CANDIES LEFT : "+N);
        }
    }
}
