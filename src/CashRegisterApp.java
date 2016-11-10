
import java.util.ArrayList;
import java.util.Scanner;

// Team Clara, Jake, Taher,

public class CashRegisterApp {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<Product> productsForSale = Reader.FileReading();
		POSReceipt currentReceipt = new POSReceipt();
		String category = null;
		String pay = null;

		while (true) {

			boolean keepGoing = true;
			System.out.println("Welcome to Elk Mouth Goods");

			do {
				System.out.println("\nWhat category would you like to browse?");

				int userSelection = Validator.getInt(scanner,"1. Camping, 2. Outerwear, 3. Water Sports, 4. Shoes: ", 1, 4);
						
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

				int userItem = Validator.getInt(scanner,"Which item would you like to purchase? (1-" + j + "): ", 1, j)-1;

				int userQ = Validator.getPositiveInt(scanner, "How many would you like to buy? ");

				Cart itemsInCart = new Cart(activeItems.get(userItem).getName(), activeItems.get(userItem).getPrice(),userQ);

				currentReceipt.addToRec(itemsInCart);

				String choice = Validator.getYesOrNo(scanner, "\nWould you like to continue shopping? (\"YES\" to continue or \"NO\" to checkout): ");

				if (choice.toLowerCase().startsWith("y")) {
					scanner.nextLine(); // clear trash from scanner
					keepGoing = true;

				} else if (choice.toLowerCase().startsWith("n")) {
					keepGoing = false; // end the shopping session and move to checkout
				}

			} while (keepGoing);

			double subT = 0.00; // begin checkout process

			System.out.println("\nHere's what you have in your cart:");
			System.out.println("ITEM \t\tPRICE \tQTY \tTOTAL");
			for (Cart c : currentReceipt.getReceiptOfItems()) {
				System.out.println(c.getName() + "\t" + "$"+CashRegister.formatNumber(c.getPrice()) + "\t" + c.getQuantity() + "\t" + "$"+CashRegister.formatNumber(c.getItemSub()));
				subT += c.getItemSub();
			}

			System.out.println("\nSUBTOTAL: $" + CashRegister.formatNumber(subT) + "\nTAX @ 6%: $" + (CashRegister.formatNumber(subT * 0.06)));

			double gt = CashRegister.setGrandTotal(subT);
			System.out.println("GRAND TOTAL = $" + CashRegister.getGrandTotal());
			CashRegister.setPayMethod(pay);
			CashRegister.makePayment();
			System.out.println("Thank you for shopping at Elk Mouth Goods" + "\n\n\n");
		}
	}
}