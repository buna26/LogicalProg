import java.util.Scanner;

public class Keyword {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String[] str = {"break","case","continue","default","defer","else","for","func","goto","if","map","range","return","struct","type","var"};
        int flag = 0;
        for (String value : str) {
            if (value.equals(s)) {
                flag = 1;
                break;
            }
        }
        if (flag == 1) {
            System.out.println(s+" is a keyword");
        }
        else {
            System.out.println(s+" is not a keyword");
        }
    }
}
