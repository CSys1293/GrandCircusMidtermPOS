
public class Product {
//you are going to generate getters and setters  
	
	
//set price to string convert to double when needed
	private String category;
	private String name;
	private double price;

	public Product(String cat, String itm, Double prc) {
		category =cat;
		name = itm;
		price = prc;
		
	}
	
	@Override
	public String toString() {
		return "[name=" + name + ", category=" + category + ", price=" + price + "]";
	}	
	
		
	public Product getProduct(String cat, String itm, Double prc) {
		Product p = new Product(cat, itm, prc) ;
		cat = category;
		itm = name;
		prc = price;
		return p;
	}

	//getters
	public String getCategory() {
		return category;
	}

	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}

	
	
	
	//setters
	public void setCategory(String cat) {
		category = cat;
	}

	public void setName(String itm) {
		name = itm;
	}

	public void setPrice(double prc) {
		price = prc;
	}

	
	//	@Override
//	public String toString() {
//		return category + "," + name + " $" + price;
//		
//	}
	
	
}