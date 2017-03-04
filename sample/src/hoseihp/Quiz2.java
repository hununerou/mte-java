package hoseihp;
import javax.swing.JOptionPane;

public class Quiz2{
	public static void main(String args[]){
		new Quiz2().start();
	}
	void start(){
		
		Question[] questions = new Question[3];
		
		for(int i = 0;i < questions.length; i++){
			questions[i] = inputQuestion();
		}
		for(int i = 0; i< questions.length;i++){
			Question question = questions[i];
				showQuestion(question);
		}			
			
	}
	Question inputQuestion(){
		String inp = JOptionPane.showInputDialog("問題文を3つ作成してください!おなしゃす!");
		String correct = JOptionPane.showInputDialog("正解の数字を入力してください");
		
		Question a = new Question();
		a.statement = inp;
		a.correct = Integer.parseInt(correct);
		return a;
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