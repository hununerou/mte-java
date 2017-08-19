package mtetest2;

import java.util.ArrayList;

public class Cart {
	private ArrayList<Item> cart = new ArrayList<>();
	
	public static int cartnum = 0;

	public Cart(Item item) {
		cartnum++;
		cart.add(item);
	}

	public String toString(){
		return cartnum + ":" + cart;
	}
}
