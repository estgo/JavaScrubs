
import java.util.Scanner;

public class TheBill
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("The price of the unit is: ");
        double unitPrice = scanner.nextDouble();
        System.out.print("The quantity of the unit is: ");
        int quantity = scanner.nextInt();
        System.out.print("The vatRate of the unit is: ");
        double vatRate = scanner.nextDouble();
        double totalPrice = 0;
        double vatValue = 0;
        double totalPriceVat = 0;
        totalPrice = unitPrice * quantity;
        vatValue = vatRate*totalPrice;
        totalPriceVat = totalPrice + vatValue;

        System.out.println("the total price without the VAT: "+totalPrice);
        System.out.println("the VAT: "+vatValue);
        System.out.println("the total price including the VAT: "+totalPriceVat);





    }
}
