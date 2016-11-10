import java.util.ArrayList;

public class POSReceipt {
	ArrayList<Cart> receiptOfItems = new ArrayList<Cart>();


	public ArrayList<Cart> getReceiptOfItems() {
		return receiptOfItems;
	}

	public void setReceiptOfItems(ArrayList<Cart> receiptOfItems) {
		this.receiptOfItems = receiptOfItems;

		System.out.println("Elk Mouth Goods");

		// formatting

		// System.out.println("Your items: " + items + " " + price);
		// System.out.println("Your subtotal is: " + subtotal);
		// System.out.println("Your tax: " + tax);
		// System.out.println("Your grandtotal is: " + grandtotal);
		//
		System.out.println("Thank you for shopping at Elk Mouth Goods");

	}

	public void addToRec(Cart q) {
		receiptOfItems.add(q);
	}

	@Override
	public String toString() {
		String s = receiptOfItems.toString();
		return s;
	}

}
