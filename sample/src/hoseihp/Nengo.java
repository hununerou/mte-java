package hoseihp;
import javax.swing.JOptionPane;
import java.util.Scanner;

public class Nengo{
	private Scanner scan;
	public static void main(String args[]){
		new Nengo().start();
	}
		void start(){
			String str = JOptionPane.showInputDialog("現在、平成:");
			scan = new Scanner(str);
			int val = scan.nextInt();
			JOptionPane.showMessageDialog(null, "西暦だと"+(val+1988)+"年desu");
	}
}