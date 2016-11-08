import java.io.InputStream;
import java.util.Scanner;

public class CashRegister {
	static Scanner scan = new Scanner(System.in);

	static double price;
	static double subtotal;
	static int quantity;
	static double change;
	static double grandTotal;
	static double tax = .06;
	static String payMethod = "";
	static String cash = "cash";
	static String credit = "credit";
	static String name;
	static String check = "check";

	public static double setSubTotal() {
		subtotal = price * quantity;
		return subtotal;
	}

	public static double getSubTotal() {
		return subtotal;
	}

	public double setGrandTotal() {
		grandTotal = grandTotal + (grandTotal * tax);
		return grandTotal;
	}

	public double getGrandTotal() {
		return grandTotal;
	}

	public static String setPayMethod() {

		boolean isValid = false;
		while (!isValid) {
			System.out.print("Please enter your payment method. (Cash, Check, Credit): ");
			String payMethod = scan.nextLine();
			payMethod.trim();
			payMethod.toLowerCase();
			if (payMethod.compareTo(cash) != 0 && payMethod.compareTo(credit) != 0 && payMethod.compareTo(check) != 0) {
				System.out.println("Please enter check, cash, or credit.");
			} else {
				isValid = true;
			}

		}
		//make paymethod
		//each paymethod will have unique message
		//cash 
		//credit cc#, exp date, cvv
		//check "do not take checks"
		
		//once paid give receipt

		return payMethod;

	}

//	public static void makePayment() {
//		if (payMethod.equals(cash)) {
//
//		} else if (payMethod.equals(credit)) {
//
//		} else {
//
//		}
//	}

}