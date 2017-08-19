package mtetest2;

import java.util.ArrayList;

public class Cart {
	ArrayList<Item> cart;
	public static int cartnum = 0;
	int sum = 0;

	public Cart() {
		cartnum++;
		cart = new ArrayList<>();
	}

	/*public Cart(Item item) {
		cartnum++;
		cart.add(item);

	}*/

	public void addItem(Item itemName, int num) {
		cart.add(itemName);
		sum = sum + itemName.price * num;
		// showCart(itemName, num);
	}

	/*
	 * public String showCart(Item itemName, int num){ return itemName.itemName
	 * + itemName.price + itemName.price* sum; }
	 */
	@Override
	public String toString() {
		return cartnum + ":" + cart + " " + sum;
	}

	/*
	 * public static void main(String[] args) { Item item = null; Cart c = new
	 * Cart(item); System.out.println(c); }
	 */
}
