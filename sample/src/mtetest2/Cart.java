package mtetest2;

import java.util.ArrayList;

public class Cart {
	private ArrayList<Item> cart = new ArrayList<>();
	
	public static int cartnum = 0;

	public Cart(Item item) {
		cartnum++;
		cart.add(item);
		cart.get(cartnum);
	}

	public String toString(){
		return cartnum + ":" + cart;
	}
	public static void main(String[] args) {
		Item item = null;
		Cart c = new Cart(item);
		System.out.println(c);
	}
}
