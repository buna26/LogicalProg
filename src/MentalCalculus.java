import java.util.Scanner;

public class MentalCalculus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the array size");
        int size = sc.nextInt();
        if(size<=0){
            System.out.println(size+" is too small");
        }
        else if(size>20){
            System.out.println(size+" exceeds the limit");
        }
        else{
            System.out.println("Enter the numbers");
            int[] array = new int[size];
            String reverse="";
            for(int i=0;i<size;i++)
            {
                array[i] = sc.nextInt();
                int a=array[i];
                if(a<100||a>999)
                {
                    System.out.println(a+" is not in the range");
                    break;
                }
            }
            for(int j=0;j<size;j++)
            {
                String s=String.valueOf(array[j]);
                reverse+=Character.toString(s.charAt(2)).concat(Character.toString(s.charAt(0)));
                System.out.println(reverse);
                reverse="";
            }
        }
    }
}
