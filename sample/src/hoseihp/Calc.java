package hoseihp;

import javax.swing.JOptionPane;

public class Calc {

	public static void main(String[] args) {
		new Calc().start();
	}

	void start() {
		double result = getNumber();
		while (true) {
			if (result == 0) {
				JOptionPane.showMessageDialog(null, "終了しました");
				break; // 最初に0を入力された時のみ終了するコマンド
			}
			int operation = getOperator(result);
			if (operation == 0) {
				JOptionPane.showMessageDialog(null, "結果は" + result); // 計算結果を表示させて修了
				break;
			}
			if (operation == 1) { // たす
				result = result + getafterNumber();
			} else if (operation == 2) { // ひく
				result = result - getafterNumber();
			} else if (operation == 3) { // かける
				result = result * getafterNumber();
			} else if (operation == 4) { // わる
				result = result / getafterNumber();
			}
			// JOptionPane.showMessageDialog(null, "ここまでの計算結果は"+result);
		}
	}

	double getNumber() {	//一回だけ表示される仕様
		String input = JOptionPane.showInputDialog("実数を入力\n0で終了");
		double number = Double.parseDouble(input);
		return number;
	}

	int getOperator(double current) {
		String input = JOptionPane.showInputDialog(
				"どんな操作をしますか？ (現在の値: " + current + ")\n" + "[0] =\n" + "[1] +\n" + "[2] -\n" + "[3] *\n" + "[4] /\n");
		int operator = Integer.parseInt(input);
		return operator;
	}

	double getafterNumber() {
		String input = JOptionPane.showInputDialog("演算する数字を実数で入力");
		double number = Double.parseDouble(input);
		return number;
	}
}
