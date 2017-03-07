//あきらめやつ

package hoseihp;

import javax.swing.JOptionPane;

public class Random {
	public static void main(String args[]) {
		new Random().start();
	}

	void start() {
		double random = Math.random() * 3;
		System.out.println(random);

		String str = JOptionPane.showInputDialog("じゃけんじゃんけんしましょう");
		String str1 = "";
		String str2 = "";

		// CPUの出目
		if (random < 1.0)
			str1 = "グー";
		else if (1.0 < random && random < 2.0)
			str1 = "チョキ";
		else if (2.0 < random && random < 3.0)
			str1 = "パー";

		// プレイヤーの出目
		int val = Integer.parseInt(str);
		if (val == 1)
			str2 = "グー";
		else if (val == 2)
			str2 = "チョキ";
		else if (val == 3)
			str2 = "パー";

		if (random > 1.0 && val == 3) { // グー
			JOptionPane.showMessageDialog(null, "私は" + str1 + "あなたは" + str2 + "。あなたの、勝ち！");

		} else if (1.0 < random && random < 2.0 && val == 1) { // チョキ
			JOptionPane.showMessageDialog(null, "私は" + str1 + "あなたは" + str2 + "。あなたの、勝ち！");
		} else if (2.0 < random && val == 2) { // パー
			JOptionPane.showMessageDialog(null, "私は" + str1 + "あなたは" + str2 + "。あなたの、勝ち");
		} else if (str1 == str2) { // あいこ
			JOptionPane.showMessageDialog(null, "私もあなたも" + str1);
			start();
		} else { // プレイヤーの負け
			JOptionPane.showMessageDialog(null, "私は" + str1 + "あなたは" + str2 + "。あなたの、負け！w");
		}
	}
}