import java.util.Scanner;

public class SelectionControlStructure1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        if(num1 == num2){
            System.out.println(num1+num2);
        }
        else {
            System.out.println(2*(num1+num2));
        }
    }
}

//Display the sum of two given number are same, if the number are not same display the double of the sum.