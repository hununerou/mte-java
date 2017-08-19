package mtetest2;

public class mtetest2 {

	public static void main(String[] args) {
		Item item = null;
		// initialization
	//	item = new Item(setItems());
		
		// make a cart
		Cart c = new Cart(item);
		
		// set items to the cart
		setCart();
		
		// show cart
		System.out.println(c);
	}
	

	
	private static void setCart(){
		// iPhone 6 x2
		// iPhone 7 x3
		// iPhone 8 x1
	}

}
