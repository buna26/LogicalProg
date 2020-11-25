public class Swap {
    public static void main(String[] args) {
        int num = 1234;
        int count = 0;
        int ans1 =0,ans2=0,ans3=0;
        int[] arr = new int[10];
        int temp = 0;
        while (num != 0) {
            int digit = num % 10;
            arr[count++] = digit;
            num /= 10;
            ans1=ans1*10+digit;
        }
        System.out.println("before swap :");
        for (int i = count-1; i >= 0; i--) {
            System.out.println(arr[i]);
            ans2=ans2*10+arr[i];
        }
        temp = arr[0];
        arr[0] = arr[count - 1];
        arr[count - 1] = temp;
        System.out.println("after swap :");
        for (int j = count-1; j >=0; j--) {
            System.out.println(arr[j]);
            ans3=ans3*10+arr[j];
        }
        System.out.println("before swap the number was: "+ans2+"\nafter swap the number is: "+ans3);
    }
}
