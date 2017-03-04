package hoseihp;
import javax.swing.*;

public class Basic1{
	public static void main(String args[]){
		new Basic1().start();
	}
	
	void start(){
		JOptionPane.showMessageDialog(null, "1+2*3="+(1+2*3));	//1と2*3=6をただつなげている（10の位の1は1*10ではない）
		System.out.println("hellooooooooo");
	}
}
	
