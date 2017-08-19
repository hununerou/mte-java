package mtetest2;

public class mtetest2 {

	public static void main(String[] args) {
		
		// initialization
		setItems();
		
		// make a cart
		Cart c = new Cart();
		
		// set items to the cart
		setCart();
		
		// show cart
		System.out.println(c);
	}
	
	private static void setItems(){
		// ("iPhone 6",80000)
		// ("iPhone 7",90000)
		// ("iPhone 8",100000)
	}
	
	private static void setCart(){
		// iPhone 6 x2
		// iPhone 7 x3
		// iPhone 8 x1
	}

}
