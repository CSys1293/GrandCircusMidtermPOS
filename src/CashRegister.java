import java.util.Scanner;

public class CashRegister {
	static Scanner scan = new Scanner(System.in);

	double price;
	double subTotal;
	int quantity;
	static double change;
	double grandTotal;
	double tax = .06;
	double money;
	static String payMethod;;
	String cash = "cash";
	String credit = "credit";
	String name;
	String check = "check";

	// item subtotal
	public double setSubTotal(double price, double quantity) {
		subTotal = price * quantity;
		return subTotal;
	}

	public double getSubTotal() {
		return subTotal;
	}

	public double setGrandTotal(double subtotal) {
		grandTotal = subTotal + (subTotal * tax);
		return grandTotal;
	}

	public double getGrandTotal() {
		return grandTotal;
	}

	public String setPayMethod() {

		boolean isValid = false;
		while (!isValid) {
			System.out.print("Please enter your payment method. (Cash, Check, Credit): ");
			String payMethod = scan.nextLine();
			payMethod.trim();
			payMethod.toLowerCase();
			if (payMethod.compareTo(cash) != 0 && payMethod.compareTo(credit) != 0 && payMethod.compareTo(check) != 0) {
				System.out.println("Please enter check, cash, or credit.");
			} else if (payMethod.compareTo(check) == 0) {
				System.out.println("Sorry, we stopped excepting checks in 2012.");
			} else
				isValid = true;

		}
		// make paymethod
		// each paymethod will have unique message
		// cash
		// credit cc#, exp date, cvv
		// check "do not take checks"

		// once paid give receipt

		return payMethod;

	}

	public void makePayment() {
		String method = CashRegister.payMethod;
		
		if (method.compareTo(cash)== 0) {
			System.out.print("Please enter dollar amount: ");
			double dollars = scan.nextDouble();
			change = grandTotal - dollars;

		} else
			System.out.print("Please enter your credit card number: ");
	}

	public String getPayMethod() {
		return payMethod;
	}

}