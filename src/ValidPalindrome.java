import java.util.Scanner;

public class ValidPalindrome {
    public static boolean isPalindrome(String s, String rev) {
        s = s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        int n = s.length();
        for ( int i = n-1; i >= 0; i-- )
            rev = rev + s.charAt(i);

        if (s.equals(rev))
            return true;
        else
            return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String rev = "";
        System.out.println(isPalindrome(s,rev));
    }
}
