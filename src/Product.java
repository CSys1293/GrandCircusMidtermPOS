
public class Product {
//you are going to generate getters and setters  
	
	private String category;
	private String item;
	private double price;

	public Product(String cat, String itm, Double prc) {
		cat = category;
		itm = item;
		prc = price;
		
	}
	
	public Product getProduct(String cat, String itm, Double prc) {
		Product p = new Product(cat, itm, prc) ;
		cat = category;
		itm = item;
		prc = price;
		return p;
	}

	//getters
	public String getCategory() {
		return category;
	}

	public String getItem() {
		return item;
	}

	public double getPrice() {
		return price;
	}
//setters
	public void setCategory(String cat) {
		cat = category;
	}

	public void setItem(String itm) {
		itm = item;
	}

	public void setPrice(double prc) {
		prc = price;
	}
	@Override
	public String toString() {
		return category + "," + item + " $" + price;
		
	}
	
	
}