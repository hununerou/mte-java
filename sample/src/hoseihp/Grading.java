package hoseihp;
import javax.swing.JOptionPane;

public class Grading {
	public static void main(String args[]) {
		new Grading().start();
	}

	void start() {
		ScoreSheet[] aiueo = new ScoreSheet[3];	//三人分の名前、英語、数学、物理のスコアを用意する
		for (int i = 0; i < aiueo.length; i++) {
			aiueo[i] = getScoreSheets();			//コンストラクタ内で名前とかスコア入れる呼び出しをする
		}
		JOptionPane.showMessageDialog(null,
				"English average score is:" + (aiueo[0].English + aiueo[1].English + aiueo[2].English) / 3);

		int count = 0;								//数学60点未満晒す
		for (int i = 0; i < aiueo.length; i++)
			if (countMathDropouts(aiueo[i])) {
				count++;
			}
		JOptionPane.showMessageDialog(null, "How many students drop Math's border are:" + count);
												// System.out.println(aiueo[0].Psysics);
			//改善余地おおあり	物理の点数が最も高いものを表示する																									//for(int i = 0; i< aiueo.length; i++){
																							//if(aiueo[0].Psysics > aiueo[1].Psysics){
																							//	aiueo[1].Psysics = aiueo[0].Psysics																		
																							//	}}
				if(aiueo[0].Psysics > aiueo[1].Psysics){
					if(aiueo[0].Psysics > aiueo[2].Psysics){
						aiueo[2].Psysics = aiueo[0].Psysics;
					}
				}
				else if(aiueo[1].Psysics > aiueo[2].Psysics){
					aiueo[2].Psysics = aiueo[1].Psysics;
				}
		JOptionPane.showMessageDialog(null, "Psysics master is:"+aiueo[2].Psysics);
		}

	ScoreSheet getScoreSheets() {
		//String input = JOptionPane.showInputDialog("what's your name");
		String Escore = JOptionPane.showInputDialog("what's your English score");
		String Mscore = JOptionPane.showInputDialog("what's your Math score");
		String Sscore = JOptionPane.showInputDialog("what's your Psysics score");

		ScoreSheet r = new ScoreSheet();
		//r.name = input;
		r.English = Integer.parseInt(Escore);
		r.Math = Integer.parseInt(Mscore);
		r.Psysics = Integer.parseInt(Sscore);
		return r;
	}

	boolean countMathDropouts(ScoreSheet a) {
												// System.out.println(a.Math); 確認用
		if (a.Math < 60) {
			return true;
		}
		return false;
	}
	//ScoreSheet MaxPsysics(ScoreSheet hello){
		
	//}
}