import java.util.Scanner;

public class GenerateBill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pizza = sc.nextInt();
        int puffs = sc.nextInt();
        int coolDrinks = sc.nextInt();

        int pizzaPrice = pizza*100;
        int puffsPrice = puffs*20;
        int coolDrinksPrice = coolDrinks*10;

        int totalPrice = pizzaPrice+puffsPrice+coolDrinksPrice;

        System.out.println("Bill Details");
        System.out.println("No of pizzas:"+pizza);
        System.out.println("No of puffs:"+puffs);
        System.out.println("No of cooldrinks:"+coolDrinks);
        System.out.println("Total price="+totalPrice);
        System.out.println("ENJOY THE SHOW!!!");
    }
}
