package hoseihp;

import javax.swing.JOptionPane;

public class BreakError {

	public static void main(String args[]) {
		new BreakError().start();
	}

	void start() {
		int score = getInput();
		JOptionPane.showMessageDialog(null, "入力された特典は" + score + "点です");
	}

	int getInput() {
		while (true) {
			String input = JOptionPane.showInputDialog("0から100までの整数を入力してください");
			int val = Integer.parseInt(input);
			if (0 <= val && val <= 100) {
				return val;
			}
			JOptionPane.showMessageDialog(null, "範囲外の値です:" + val);
		}

	}
}
