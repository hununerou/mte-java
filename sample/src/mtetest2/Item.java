package mtetest2;

public class Item {
	String itemname;
	int price;

	public Item(String itemname, int price) {
		this.itemname = itemname;
		this.price = price;
	}

	public String toString() {
		return itemname + ":" + price;
	}

/*	public static void main(String[] args) {
		Item i = new Item("iphone6", 100);
		System.out.println(i);
	}*/
}