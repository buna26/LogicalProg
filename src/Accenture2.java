import java.util.Scanner;
public class Accenture2 {
    public static void main(String[] args) {
        int num;
        System.out.println("enter the number: ");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        int n = num;
        int sum = 0;
        while (num != 0) {
            int digit = num % 10;
            sum += digit;
            num /= 10;
        }
        if (n%sum==0){
            int ans = n/sum;
            System.out.println(ans);
        }
        else System.out.println("0");
    }
}
