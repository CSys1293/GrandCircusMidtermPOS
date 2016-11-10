import java.util.Scanner;

public class Validator {

	public static int getInt(Scanner sc, String prompt) {
		int i = 0;
		boolean isValid = false;

		while (!isValid) {
			System.out.print(prompt);
			if (sc.hasNextInt()) {
				i = sc.nextInt();
				isValid = true;
			} else {
				System.out.println(" Error! Invalid integer value. Try again.");
//				String garbage = sc.nextLine();
				sc.nextLine();
			}
		}
		return i;
	}

	public static int getInt(Scanner sc, String prompt, int min, int max) {
		int i = 0;
		boolean isValid = false;
		while (!isValid) {
			i = getInt(sc, prompt);
			if (i < min)
				System.out.println(" Error! Number must be " + min + " or greater.");
			else if (i > max)
				System.out.println(" Error! Number must be " + max + " or less.");
			else
				isValid = true;
		}
		return i;
	}

	public static int getPositiveInt(Scanner sc, String prompt) {
		int i = 0;
		boolean isValid = false;
		while (!isValid) {
			i = getInt(sc, prompt);
			if (i <= 0) {
				System.out.println(" Error! You must enter a number greater than zero.");
			} else {
				isValid = true;
			}
		}
		return i;
	}

	public static double getDouble(Scanner sc, String prompt) {
		double d = 0;
		boolean isValid = false;
		while (!isValid) {
			System.out.print(prompt);
			if (sc.hasNextDouble()) {
				d = sc.nextDouble();
				isValid = true;
			} else {
				System.out.println(" Error! Invalid entry. Try again.");
			}
			sc.nextLine(); // discard any other data entered on the line
		}
		return d;
	}

	public static double getPositiveDouble(Scanner sc, String prompt) {
		double d = 0;
		boolean isValid = false;
		while (!isValid) {
			d = getDouble(sc, prompt);
			if (d <= 0) {
				System.out.println(" Error! You must enter a number greater than zero.");
			} else {
				isValid = true;
			}
		}
		return d;
	}

	public static String getYesOrNo(Scanner sc, String prompt) {

		boolean isValid = false;
		System.out.print(prompt);
		String yesNo = sc.next();
		while (!isValid) {
			if (!yesNo.toUpperCase().startsWith("Y") && !yesNo.toUpperCase().startsWith("N")) {
				System.out.print(" Error! Please enter \"Y\" or \"N\": ");
				yesNo = sc.next();
			} else {
				isValid = true;
			}
		}
		return yesNo;
	}
}