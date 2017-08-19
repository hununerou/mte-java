package mtetest2;

import java.util.ArrayList;

public class Cart {
	ArrayList<Item> cart;
	public static int cartnum = 0;
	int sum = 0;

	public Cart() {
		cart = new ArrayList<>();
	}

	public Cart(Item item) {
		cartnum++;
		cart.add(item);
		cart.get(cartnum);
	}

	public void addItem(Item itemName, int num) {
		sum = sum + itemName.price * num;
	}
	
	@Override
	public String toString() {
		return cartnum + ":" + cart;
	}

/*	public static void main(String[] args) {
		Item item = null;
		Cart c = new Cart(item);
		System.out.println(c);
	}*/
}
