package hoseihp;
import javax.swing.JOptionPane;
import java.util.Scanner;

public class InterestCharge{
	Scanner scan;
	public static void main(String args[]){
		 new InterestCharge().start();
	}
	void start(){
		String str1 = JOptionPane.showInputDialog("現在の預金額");
		String str2 = JOptionPane.showInputDialog("預金する期間(日)");
		String str3 = JOptionPane.showInputDialog("年利(%)");
		
		scan = new Scanner(str1);
		int deposit = scan.nextInt();
		scan = new Scanner(str2);
		double day = scan.nextInt();
		scan = new Scanner(str3);
		double val = scan.nextInt();
		
		JOptionPane.showMessageDialog(null, "見込み利息は"+(deposit*(day/365)*(val/100))*0.8);
	}
}