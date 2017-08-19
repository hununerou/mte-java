package mtetest2;

public class mtetest2 {

	public static void main(String[] args) {		
		// make a cart
		Cart c = new Cart(item);
		
		// set items to the cart
		Item i6 = new Item("iPhone 6",80000);
		Item i7 = new Item("iPhone 7",90000);
		Item i8 = new Item("iPhone 8",100000);

        Cart addItem(Item itemName, int num){
        c.addItem(i6,2);
        c.addItem(i7,3);
		c.addItem(i8,1);
        }
		// show cart
        // {
        //   {itemName, number, totalPrice}, {itemName, number, totalPrice}, ..., 
        //   allTotalPrice
        // }
		System.out.println(c);
	}
}
