import java.util.Scanner;

public class NQT_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char c = sc.next().charAt(0);
        int count=0;
        char s1 = s.charAt(0);
        char s2 = s.charAt(s.length()-1);
        if(s.length()<2){
            count=1;
        }
        else if(s1==s2) {
            for (int i = 0; i < s.length(); i++) {
                if(s.charAt(i) == c){
                    count += 1;
                }
            }
        }
        System.out.println(count);
    }
}
