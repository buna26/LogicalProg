public class Palindrome {
    public static void main(String[] args) {
        int num = 2345;
        int ans=0;
        int temp = num;
        while(num!=0){
            int digit = num%10;
            ans = ans*10+digit;
            num/=10;
        }
        System.out.println(ans);
        if(temp==ans){
            System.out.println("palindrome");
        }
        else{System.out.println("not palindrome");}
    }
}