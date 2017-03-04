package hoseihp;

import javax.swing.JOptionPane;

public class Quiz1{
	public static void main(String args[]){
		new Quiz1().start();
	}
	void start(){
		Question question = new Question();
		question.statement = "10+20は?";
		question.correct = 30;
		showQuestion(question);
	}
	void showQuestion(Question aiueo){
		String input = JOptionPane.showInputDialog(aiueo.statement);
		int answer = Integer.parseInt(input);
		if(answer == aiueo.correct){
			JOptionPane.showMessageDialog(null, "正解です");
		}
		else{
			JOptionPane.showMessageDialog(null, "不正解です");
		}
	}
}