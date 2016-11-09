
import java.util.ArrayList;
import java.util.Scanner;

// Team Clara, Jake, Taher,

public class CashRegisterApp {

	public static void main(String[] args) { 
		Scanner scanner = new Scanner(System.in);
		Validator val = new Validator();
		
		System.out.println("Welcome to Elk Mouth Goods");
		System.out.println("What are you shopping for today?");

			
		String choice1;
		String choice2;
		String choice3;
		String choice4;
		
		ArrayList<Product> productsForSale = Reader.FileReading();

		System.out.print(productsForSale.toString());

		
		
		boolean condition = true;
		//loop until checkout
		do  {
		System.out.println("Select a category: ");
		
		System.out.println("1. Camping, 2. Outerwear, 3. Water Sports, 4. Shoes: ");
		//take user input(validate int 1 2 3 or 4)
		int userSelection = scanner.nextInt();
		
		//display items in selected category
		//camping option
		if(userSelection == 1) {
			//prompt user for input
			System.out.println("Camping");
			System.out.println("Select an item: ");
			//items from category camping
			System.out.println("1. Tent");
			System.out.println("2. Sleeping bag");
			System.out.println("3. Lantern");
			System.out.println("4. Camp Stove");
			int userItem = scanner.nextInt();
			}
		//if user selects outerwear
		else if (userSelection == 2) {
			//prompt user for input
			System.out.println("Outerwear");
			System.out.println("Select an item: ");
			//items from category outerwear
			System.out.println("1. Jacket");
			System.out.println("2. Winter Coat");
			System.out.println("3. Snowsuit");
			}
		else if(userSelection == 3 ) {
			//prompt user for input
			System.out.println("Water Sports");
			System.out.println("Select an item: ");
			//items from cat 3 water sports
			System.out.println("1. Kayak");
			System.out.println("2. Oars");
			System.out.println("3. Fishing Poles");
			System.out.println("4. Water Skis");
			System.out.println("5. Canoe");
		}
		else if(userSelection == 4) {
			//prompt user for input
			System.out.println("Shoes");
			System.out.println("Select an item: ");
			// items from cat shoes
			System.out.println("1. Hiking Boots");
			System.out.println("2. Trail Shoes");
			System.out.println("3. Snowboots");
			System.out.println("4. Rainboots");
			
		}
		//ask for qtny for selected item
		System.out.println("How many woud you like to buy?");
		//display line total price * qtny
		//continue shopping or check out?
		
		//display subtotal, tax, grandtotal "use big decimal"
		
		//payment type
		
		//display receipt 
		System.out.println();
		
		//start over
		

	} while (condition);
		
	System.out.println("Would you like to continue shopping?");
	

		System.out.println("Thank you for shopping at Elk Mouth Goods");
	}

	private static void printnewPriceList() {
		// TODO Auto-generated method stub
		
	}

}