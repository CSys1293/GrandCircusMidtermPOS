import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

//import java.util.Scanner;

// Team Clara, Jake, Taher,



public class CashRegisterApp {
	
	public static void main(String[] args) throws IOException {
		ArrayList<Product> products = new ArrayList<Product>();
//		Scanner scan = new Scanner(System.in);
//		boolean keepGoing = true;

		      File file = new File("newPriceList.txt");
		      
		      // creates the file
		      file.createNewFile();
		      
		      // creates a FileWriter Object
		      FileWriter writer = new FileWriter(file); 
		      
		      // Writes the content to the file
		      writer.write("\"Camping\", \"Tent\", 129.95"
		      		+ "\n\"Camping\", \"Sleeping bag\", 50.00"
		      		+ "\n\"Camping\", \"Lantern\", 12.99"
		      		+ "\n\"Camping\", \"Camp stove\", 39.99"
		      		+ "\n\"Outerwear\", \"Jacket\", 189.50"
		      		+ "\n\"Outerwear\", \"Winter Coat\", 199.99"
		      		+ "\n\"Outerwear\", \"Snowsuit\", 100.00"
		      		+ "\n\"Outerwear\", \"Gloves\", 12.95"
		      		+ "\n\"Outerwear\", \"Hat\", 10.00"
		      		+ "\n\"Outerwear”, \"Scarf\", 7.86"
		      		+ "\n\"Water Sports\", \"Kayak\", 700.00 "
		      		+ "\n\"Water Sports\", \"Oars\", 23.93 "
		      		+ "\n\"Water Sports\", \"Fishing poles\", 89.45 "
		      		+ "\n\"Water Sports\", \"Water skis\", 154.99 "
		      		+ "\n\"Water Sports\", \"Canoe\", 968.31 "
		      		+ "\n\"Shoes\", \"Hiking boots\", 200.00 "
		      		+ "\n\"Shoes\", \"Trail shoes\", 99.00 "
		      		+ "\n\"Shoes\", \"Snow boots\", 129.00 "
		      		+ "\n\"Shoes\", \"Rain boots\", 40.00"); 
		      writer.flush();
		      writer.close();

		   }
	}

