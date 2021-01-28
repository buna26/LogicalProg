import java.util.Scanner;

public class RoadDistance {
    public static void main(String[] args) {
        int ans = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("The number of person");
        int N = sc.nextInt();
        System.out.println("Height of each person: ");
        int[] height = new int[N];
        for(int i = 0; i<N; i++){
            height[i]=sc.nextInt();
        }
        System.out.println("The height of boundary wall");
        int H = sc.nextInt();
        for(int i : height){
            if (i<=H){
                ans += 1;
            }
            else{
                ans += 2;
            }
        }
        System.out.println(ans);

    }
}
