package myjava01;

import javax.swing.JOptionPane;

public class HelloWork {

	public static void main(String[] args) {
		new HelloWork().start();

	}

	void start() {
		String str1 = new String("私の名前は");
		String str2 = new String("私の趣味は");
		String input1 = JOptionPane.showInputDialog("名前は？");
		String input2 = JOptionPane.showInputDialog("趣味は？");
		JOptionPane.showMessageDialog(null, str1+input1+"です。"+str2+input2+"です。");

	}
}
