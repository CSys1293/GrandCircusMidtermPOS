
import java.util.ArrayList;
import java.util.Scanner;

// Team Clara, Jake, Taher,

public class CashRegisterApp {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Validator val = new Validator();
		ArrayList<Product> productsForSale = Reader.FileReading();
		String category = null;
		POSReceipt currentReceipt = new POSReceipt();
		String pay = null;


		while (true) {

			boolean keepGoing = true;
			System.out.println("Welcome to Elk Mouth Goods");

			// System.out.println("\nWhat category would you like to browse?");

			do {

				System.out.println("\nWhat category would you like to browse?");
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

				System.out.println("\nThese are our options for " + category + ":");

				int j = 0;
				ArrayList<Product> activeItems = new ArrayList<Product>();

				for (Product p : productsForSale) {

					if (p.getCategory().toString().equalsIgnoreCase(category)) {
						j++;
						System.out.println(j + ". " + p.getName() + " ~ " + "$" + CashRegister.formatNumber(p.getPrice()));
						activeItems.add(p);
					}
				}

				System.out.print("Which would you like to purchase? ");

				int userItem = (scanner.nextInt() - 1);

				System.out.print("How many would you like to buy? ");

				int userQ = scanner.nextInt();

				Cart thisOne = new Cart(activeItems.get(userItem).getName(), activeItems.get(userItem).getPrice(),
						userQ);

				currentReceipt.addToRec(thisOne);

				System.out.print("\nWould you like to continue shopping? ");

				String choice = scanner.next();

				while (!choice.toLowerCase().startsWith("n") && !choice.toLowerCase().startsWith("y")) {
					System.out.print(" Invalid answer. Please respond \"YES\" or \"NO\": ");
					choice = scanner.next();
				}

				if (choice.toLowerCase().startsWith("y")) {
					scanner.nextLine(); // clear trash from scanner
					keepGoing = true;

				} else if (choice.toLowerCase().startsWith("n")) {

					keepGoing = false; // end the shopping session

					// scanner.close(); // close the resource leak
				}
			} while (keepGoing);

			double subT = 0.00;

			System.out.println("Here's what you have in your cart:");

			for (Cart c : currentReceipt.getReceiptOfItems()) {
				System.out.println(c.getName() + "\t" + "$"+CashRegister.formatNumber(c.getPrice()) + "\t" + c.getQuantity() + "\t" + "$"+CashRegister.formatNumber(c.getItemSub()));
				subT += c.getItemSub();
			}

			System.out.println("Subtotal: $" + CashRegister.formatNumber(subT) + "\nTax @ 6%: $" + (CashRegister.formatNumber(subT * 0.06)));
			double gt = CashRegister.setGrandTotal(subT);

			System.out.println("Grand Total = $" + CashRegister.getGrandTotal());
			CashRegister.setPayMethod(pay);
			CashRegister.makePayment();
			System.out.println("Thank you for shopping at Elk Mouth Goods" + "\n\n\n");
		}

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
}