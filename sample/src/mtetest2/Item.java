package mtetest2;
//商品名と金額を構成する
public class Item {
	String itemName;
	int price;

	public Item(String itemname, int price) {
		this.itemName = itemname;
		this.price = price;
	}

	public String toString() {
		return itemName + ":" + price;
	}

/*	public static void main(String[] args) {
		Item i = new Item("iphone6", 100);
		System.out.println(i);
	}*/
}