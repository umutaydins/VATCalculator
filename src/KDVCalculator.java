import java.util.Scanner;

public class KDVCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the price without VAT: ");
        double priceWithoutVAT = scanner.nextDouble();

        scanner.close();

        // Calculate the VAT rate
        double vatRate = (priceWithoutVAT > 1000) ? 0.08 : 0.18;

        // Calculate the price with VAT
        double priceWithVAT = priceWithoutVAT * (1 + vatRate);

        // Calculate the VAT amount
        double vatAmount = priceWithoutVAT * vatRate;

        System.out.println("Price without VAT: " + priceWithoutVAT + " USD");
        System.out.println("VAT Rate: " + (vatRate * 100) + "%");
        System.out.println("VAT Amount: " + vatAmount + " USD");
        System.out.println("Price with VAT: " + priceWithVAT + " USD");
    }
}
