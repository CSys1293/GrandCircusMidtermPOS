
public class Cart {

	private String name;
	private double price;
	private int quantity;
	private double itemSub;

	public Cart(String n, double p, int q) {
		name = n;
		price = p;
		quantity = q;
		itemSub = (p*q);

	}

	public String getName() {

		return name;
	}

	public double getPrice() {
		return price;
	}

	public int getQuantity() {
		return quantity;
	}

	public double getItemSub() {
		return itemSub;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public void setItemSub(double itemSub) {
		this.itemSub = itemSub;
	}

	@Override
	public String toString() {
		return "[item = " + name + ", price = " + price + ", quantity = " + quantity + ", subtotal = " + itemSub +" ]";
	}	

}
