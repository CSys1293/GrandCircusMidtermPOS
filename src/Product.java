
public class Product {
//you are going to generate getters and setters  
	
	private String category;
	private String item;
	private double price;

	public Product(String category, String item, Double price) {
		this.category = category;
		this.item = item;
		this.price = price;
		
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
	public void setCategory(String category) {
		this.category = category;
	}

	public void setItem(String item) {
		this.item = item;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return category + "," + item + " $" + price;
		
	}
	
	
}