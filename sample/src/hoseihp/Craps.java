package hoseihp;

import javax.swing.JOptionPane;

public class Craps {

	public static void main(String[] args) {
		new Craps().start();
	}

	void start() {
		TwoDices dices = toss("あなた");
		if (dices.total == 7 || dices.total == 11) { // クラップスとか言うゲームのルールでサイコロの目の合計が7か11なら即勝ちらしい
			JOptionPane.showMessageDialog(null, "あなたの勝ちです");
		} else if (dices.total == 2 || dices.total == 3 || dices.total == 12) { // クラップスとかいうry2か3か12なら即負けらしい
			JOptionPane.showMessageDialog(null, "あなたの負けです");
		} else { // 上記二つにあてはまらなかった場合(帰り値はなし
			loop(dices.total);
		}
	}

	TwoDices toss(String player) {
		JOptionPane.showMessageDialog(null, "今からゲームをします。\nはじめにサイコロを2回投げます\n\n一回目の準備おk?");
		double random = Math.random() * 6 + 1;
		int aaa = (int) random;
		JOptionPane.showMessageDialog(null, "1回目のサイコロ:" + aaa + "\n2回目のサイコロを振ります");
		int bbb = (int) (Math.random() * 6 + 1);
		JOptionPane.showMessageDialog(null, "あなたの2回振ったサイコロの目の合計は" + (aaa + bbb) + "です.");
		TwoDices tot = new TwoDices(); // この作業いる？
		tot.first = aaa;
		tot.second = bbb;
		tot.total = aaa + bbb;
		return tot;
	}

	void loop(int point) {	//以下では7を出したらそいつの負け、それ以外では最初に自分が振ったサイコロの目と同じならそいつの勝ちルール
		while (true) {
			JOptionPane.showMessageDialog(null, "CPUがサイコロを振る番です");
			int cp = (int) (Math.random() * 6 + 1);
			JOptionPane.showMessageDialog(null, "1回目のサイコロ:" + cp + "\n2回目のサイコロを振ります");
			int u = (int) (Math.random() * 6 + 1);
			JOptionPane.showMessageDialog(null, "2回目のサイコロは:" + u + "\nCPUのサイコロの目の合計は" + (cp + u) + "です\n最初の値は" + point);
			if (cp + u == 7) {
				JOptionPane.showMessageDialog(null, "7が出たのでCPUの負け、あなたの勝ちです");
				break;
			} else if (cp + u == point) {
				JOptionPane.showMessageDialog(null, "最初にあなたが振ったサイコロの合計といっしょなのでCPUの勝ち、あなたの負けです");
				break;
			} else {
				JOptionPane.showMessageDialog(null, "勝負がつかなかったのでもう一度あなたが振る番です");
				int again = (int) (Math.random() * 6 + 1);
				JOptionPane.showMessageDialog(null, "1回目のサイコロ:" + again + "\n2回目のサイコロを振ります");
				int age = (int) (Math.random() * 6 + 1);
				JOptionPane.showMessageDialog(null, "あなたのサイコロの目の合計は" + (again + age) + "です\n最初の値は" + point);
				if (again + age == 7) {
					JOptionPane.showMessageDialog(null, "7が出たのでCPUの勝ち、あなたの負けです");
					break;
				} else if (again + age == point) {
					JOptionPane.showMessageDialog(null, "最初にあなたが振ったサイコロの合計といっしょなのでCPUの負け、あなたの勝ちです");
					break;
				}
			}
			String input = JOptionPane.showInputDialog("勝負がつかなかったのでまたCPUの番です。 それとももうやめますか?\n1でやめる");
			int a = Integer.parseInt(input);
			if (a == 1) {
				JOptionPane.showMessageDialog(null, "クソゲーを終了します");
				break;
			}
		}
	}
}

class TwoDices {
	int first;
	int second;
	int total;
}
