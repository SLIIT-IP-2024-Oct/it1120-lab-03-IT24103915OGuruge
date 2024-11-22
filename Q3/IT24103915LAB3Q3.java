import java.util.Scanner;

public class RupeeDenominations {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);  
        System.out.print("Enter the rupee amount: ");
        int amount = scanner.nextInt();     
        int[] denominations = {5000, 1000, 500, 200, 100, 50, 20, 10, 5, 2, 1};     
        for (int denomination : denominations) {
        int count = amount / denomination; 
        amount = amount % denomination;   
        System.out.println(denomination + " Notes – " + count);
        }

scanner.close();
    }
}