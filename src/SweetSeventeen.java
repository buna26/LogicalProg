import java.util.HashMap;
import java.util.Scanner;

public class SweetSeventeen {
    static void convert(String s, int base){
        long ans = 0;
        int power = 0;
        for (int i = s.length()-1; i >=0 ; i--) {
            char currentChar = s.charAt(i);
            if(Character.toUpperCase(currentChar)>='A' && Character.toUpperCase(currentChar)<='Z'){
                int value = Character.toUpperCase(currentChar) -'A' +10; // ASCII VALUE
                ans += value*Math.pow(base,power++);
            }
            else{
                ans += (currentChar-'0')*Math.pow(base,power++); // (currentChar-'0') ==> Character to Integer
            }
        }
        System.out.println(ans);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        int base = sc.nextInt();
        convert(input,base);
//        int ans = Integer.parseInt(input,17);      -> using inbuilt method
//        System.out.println(ans);
    }
}
