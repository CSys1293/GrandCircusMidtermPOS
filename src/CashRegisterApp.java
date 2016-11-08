
import java.util.ArrayList;

// Team Clara, Jake, Taher,

public class CashRegisterApp {

	public static void main(String[] args) { 
		ArrayList<Product> products = new ArrayList<Product>();

		Reader list = new Reader();
		list.openFile();
		list.readFile();
		
		ArrayList<String> tempArray = new ArrayList<String>();
		tempArray.add("Camping \t Tent \t 129.95");
		tempArray.add("Outerwear \t Jacket \t 189.50");
		tempArray.add("Water Sports \t Kayak \t 700.00");
		tempArray.add("Shoes \t Hiking Boots \t 200.00");
		tempArray.add("Shoes \t Trail Shoes \t 99.00");
		
		
		System.out.println("Welcome to Elk Mouth Goods");
		
		System.out.println("What are you shopping for today?");
		
		System.out.println("1. Camping, 2. Outerwear, 3. Water Sports, 4. Shoes: ");
		//take user input(validate int 1 2 3 or 4)
		
		//display items in selected category
		//ask for qtny for selected item
		//display line total price * qtny
		//continue shopping or check out?
		//loop until checkout
		//display subtotal, tax, grandtotal "use big decimal"
		
		//payment type
		
		//display receipt 
		
		//start over
		

	}
}