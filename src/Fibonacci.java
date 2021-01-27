public class Fibonacci {
    public static void series(int n){ //Fibonacci series
        int first = 0, second = 1;
        System.out.println(first+"\n"+second);
        for(int i=2; i<=n; i++){
            int third = first+second;
            System.out.println(third);
            first=second;
            second=third;
        }
    }

    public static void fib(int n){ //nth fibonacci without recursion
        int[] arr = new int[n+1];
        arr[0]=0;
        arr[1]=1;
        for(int i=2; i<=n; i++){
            arr[i] = arr[i-1]+arr[i-2];
        }
//        for (int val:arr) {
//            System.out.println(val);
//        }
        System.out.println("the "+n+"th fibonacci is :"+arr[n]);
    }

    public static int fibWithRecursion(int n){ //nth fibonacci with recursion
        if(n==0 || n==1) return n;
        return fibWithRecursion(n-1)+fibWithRecursion(n-2);
    }

    public static void main(String[] args) {
        series(10); //Fibonacci series
        fib(10); //nth fibonacci without recursion
        System.out.println(fibWithRecursion(10)); //nth fibonacci with recursion
    }
}
