public class TailRecursion {
//   public static void printNum(int n){
//       if(n==10) return;
//       System.out.println(n+1);
//       printNum(n+1);
//   }
    public static void printNum(int n){ //Non Tail Recursion
        if(n==0) return;
        printNum(n-1);
        System.out.println(n);
    }
    public static void printReverseNum(int n){
        if(n==0) return;
        System.out.println(n);
        printReverseNum(n-1);
    }
    public static void main(String[] args) {
//        printNum(0);
        printNum(10);
        printReverseNum(10);
    }
}
