import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Scanner;

public class CashRegister {
	static Scanner scan = new Scanner(System.in);

	double price;
	double itemSubTotal;
	static double subTotal;
	int quantity;
	static double change;
	static double grandTotal;
	static double tax = .06;
	double money;
	static String payMethod;;
	String cash = "cash";
	String credit = "credit";
	String name;
	String check = "check";

	public void setItemSubTotal(double price, int quantity) {
		itemSubTotal = price * quantity;
		return;
	}
	
	public void setSubTotal(double price) {
		itemSubTotal = price;
		return;
	}	

	public double getItemSubTotal() {
		return itemSubTotal;
	}
	public void cartArray(){
		ArrayList<Double> items = new ArrayList<>();
		

	}

//	public void setSubTotal() {
//		for (items i : cart) {
//			double subTotal = ((Product.getPrice()) * (Product.getQuantity()));
//			finalPrice += subTotal;
//			return;
//		}
//	}

	public double getSubTotal() {
		return subTotal;
	}

	public static double setGrandTotal(double subTotal) {
		grandTotal = (subTotal + (subTotal * tax));
		return grandTotal;

	}

	public static String getGrandTotal() {
		return CashRegister.formatNumber(grandTotal);
	}

	public void setPayMethod(String p) {
		boolean isValid = false;
		while (!isValid) {
			System.out.print("Please enter your payment method. (Cash, Check, Credit): ");
			p = scan.nextLine();
			p.trim();
			p.toLowerCase();
			if (p.compareTo(cash) != 0 && p.compareTo(credit) != 0 && p.compareTo(check) != 0) {
				System.out.println("Please enter check, cash, or credit.");
			} else if (p.compareTo(check) == 0) {
				System.out.println("Sorry, we stopped excepting checks in 2012.");
			} else
				isValid = true;
		}
		payMethod = p;
		return;
	}

	public void makePayment() {
		if (payMethod.equalsIgnoreCase(cash)) {
			System.out.print("Please enter dollar amount: ");
			double dollars = scan.nextDouble();
			change = grandTotal - dollars;
			System.out.println("Your change is $" + CashRegister.formatNumber(change) + ".");
		} else
			System.out.print("Please enter your credit card number: ");
		long cc = scan.nextLong();
		System.out.print("Please enter your expiration date: ");
		int date = scan.nextInt();
		System.out.print("Please enter your CVV#: ");
		int cvv = scan.nextInt();
		System.out.println("Approved! $" + CashRegister.getGrandTotal() + " was charged to your account.");
	}

	public static String formatNumber(double x) {
		BigDecimal format = new BigDecimal(x).setScale(2, BigDecimal.ROUND_HALF_UP);
		String formatted = format.toString();
		return formatted;
	}

	
}