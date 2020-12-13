public class MaxMin {
    public static int[] numToArr(int num){
        int[] arr = new int[10];
        int count = 0;
        while (num != 0) {
            int digit = num % 10;
            arr[count++] = digit;
            num /= 10;
        }
        return arr;
    }
    public static int arrToNum(int[] arr,boolean flag){
        int ans=0;
        for (int i = arr.length - 1; i >= 0; i--) {
            if(flag && arr[i] == 5){
                arr[i] = 6;
            }
            if(!flag && arr[i] == 6){
                arr[i] = 5;
            }
            ans = ans * 10 + arr[i];
        }
        return ans;
    }
    public static void main(String[] args) {
        int num1=45 , num2=540;
        int[] arr1 = new int[10];
        int[] arr2 = new int[10];
        arr1 = numToArr(num1);
        arr2 = numToArr(num2);
        int maxSum= arrToNum(arr1,true)+arrToNum(arr2,true);
        int minSum= arrToNum(arr1,false)+arrToNum(arr2,false);
        System.out.println("Max sum is: "+maxSum);
        System.out.println("Min sum is: "+minSum);

    }
}
