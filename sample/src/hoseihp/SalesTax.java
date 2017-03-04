package hoseihp;
import javax.swing.JOptionPane;
import java.util.Scanner;

public class SalesTax{
	private Scanner scan;
	
	public static void main(String args[]){
		new SalesTax().start();
	}
		void start(){
			String str = JOptionPane.showInputDialog("表示価格:");
				scan = new Scanner(str);
				int val = scan.nextInt();
			JOptionPane.showMessageDialog(null, "税抜き価格は"+(val/1.08)+"円");
			JOptionPane.showMessageDialog(null, "内税は"+(val*1.08-val));
		}
}