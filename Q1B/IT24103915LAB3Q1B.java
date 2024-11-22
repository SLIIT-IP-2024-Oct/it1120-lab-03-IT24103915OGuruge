import java.util.Scanner;

public class RiceCostCalculatorWithDiscount {
    public static void main(String[] args) {
      
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the price of 1 kg of rice: ");
        double pricePerKg = scanner.nextDouble();        
        System.out.print("Enter the number of kilograms you want to buy: ");
        double quantity = scanner.nextDouble();      
        double totalAmount = pricePerKg * quantity;
        double discount = totalAmount * 0.10;
        double finalAmount = totalAmount - discount;
        System.out.println("Total amount before discount: " + totalAmount);
        System.out.println("Discount (10%): " + discount);
        System.out.println("The total amount you have to pay after the discount is: " + finalAmount);

scanner.close();
    }
}