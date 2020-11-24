public class SumCount {
    public static void main(String[] args) {
        int num = 2489;
        int sum = 0;
        int count = 0;
        while (num != 0) {
            int digit = num % 10;
            sum += digit;
            num /= 10;
            count++;
        }
        System.out.println("sum of the digits: "+sum + "\ntotal number of digits: " + count);
    }
}
