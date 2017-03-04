package hoseihp;
import javax.swing.JOptionPane;

public class TailRecursion{
	public static void main(String args[]){
		new TailRecursion().start();
	}
	void start(){
		String input = JOptionPane.showInputDialog("startメソッドを起動しますか?\n"+"(1)はい\n"+"(2)いいえ");
		int yesno = Integer.parseInt(input);
		if(yesno == 1){
			start();
		}
	}
}