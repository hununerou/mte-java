package hoseihp;

import javax.swing.JOptionPane;

public class Grading {
	public static void main(String args[]) {
		new Grading().start();
	}

	void start() {
		ScoreSheet[] aiueo = new ScoreSheet[3];
		for (int i = 0; i < aiueo.length; i++) {
			aiueo[i] = getScoreSheets();
		}
		JOptionPane.showMessageDialog(null,
				"English average score is:" + (aiueo[0].English + aiueo[1].English + aiueo[2].English) / 3);

		int count = 0;
		for (int i = 0; i < aiueo.length; i++)
			if (countMathDropouts(aiueo[i])) {
				count++;
			}
		JOptionPane.showMessageDialog(null, "How many students drop Math's score are" + count);

	}

	ScoreSheet getScoreSheets() {
		String input = JOptionPane.showInputDialog("what's your name");
		String Escore = JOptionPane.showInputDialog("what's your English score");
		String Mscore = JOptionPane.showInputDialog("what's your Math score");
		String Sscore = JOptionPane.showInputDialog("what's your Psysics score");

		ScoreSheet r = new ScoreSheet();
		r.name = input;
		r.English = Integer.parseInt(Escore);
		r.Math = Integer.parseInt(Mscore);
		r.Psysics = Integer.parseInt(Sscore);
		return r;
	}

	boolean countMathDropouts(ScoreSheet a) {
		System.out.println(a.Math);
		if (a.Math < 60) {
			return true;
		}
		return false;
	}
}