
import java.awt.List;
import java.io.File;
import java.util.ArrayList;

// Team Clara, Jake, Taher,

public class CashRegisterApp {

	public static void main(String[] args) { 
		ArrayList<Product> products = new ArrayList<Product>();

		Reader list = new Reader();
		list.openFile();
		list.readFile();

	}
}