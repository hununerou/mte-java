package hoseihp;

import javax.swing.JOptionPane;

public class Quiz3 {

	public static void main(String[] args) {
		new Quiz3().start();
 }

	void start() {
		Question question =  inputQuestion();
		showQuestion(question);
 }

	Question inputQuestion() {
		String statement = JOptionPane.showInputDialog("問題文を入力");
		String correct = JOptionPane.showInputDialog("政界番号を入力");
		
		Question question = new Question();
		question.statement = statement;
		question.correct = Integer.parseInt(correct);
		return question;
 }

	void showQuestion(Question question) {
		String in = JOptionPane.showInputDialog(question.statement);
		int answer = Integer.parseInt(in);
		if (answer == question.correct) {
			JOptionPane.showMessageDialog(null, "正解です");
 }
		else {
			JOptionPane.showMessageDialog(null, "不正解です");
		}
	}
 }
