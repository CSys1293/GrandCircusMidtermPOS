
import java.util.ArrayList;
import java.util.Scanner;

// Team Clara, Jake, Taher,

public class CashRegisterApp {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Validator val = new Validator();
		ArrayList<Product> productsForSale = Reader.FileReading();
		String category = null;

		System.out.println("Welcome to Elk Mouth Goods");
		System.out.println("\nWhat are you shopping for today?");

		
		System.out.print("1. Camping, 2. Outerwear, 3. Water Sports, 4. Shoes: ");

		// take user input(validate int 1 2 3 or 4)

		int userSelection = scanner.nextInt();

		if (userSelection == 1) {
			category = "Camping";
		} else if (userSelection == 2) {
			category = "Outerwear";
		} else if (userSelection == 3) {
			category = "Water Sports";
		} else if (userSelection == 4) {
			category = "Shoes";
		}

		System.out.println("These are our options for " + category + ":");

		int j = 0;

		for (Product p : productsForSale) {
						
			if (p.getCategory().toString().equalsIgnoreCase(category)) { 
				j++;
				System.out.println(j + ". " + p.getName() + " ~ " + "$" + p.getPrice());
			} 
		}

		System.out.print("Which would you like to purchase? ");
		int userItem = scanner.nextInt();

		
		
		
		
		
		System.out.print("How many would you like to buy? ");
		int qty = scanner.nextInt();

		System.out.println("Would you like to continue shopping?");
		System.out.println("Thank you for shopping at Elk Mouth Goods");
	}

	// boolean condition = true;
	// loop until checkout

	// if user selects outerwear

	// ask for qtny for selected item

	// display line total price * qtny
	// continue shopping or check out?

	// display subtotal, tax, grandtotal "use big decimal"

	// payment type

	// display receipt
	// System.out.println();

	// start over

	// } while (condition);

	// private static void printnewPriceList() {

}
