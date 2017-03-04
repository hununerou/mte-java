package hoseihp;
import javax.swing.JOptionPane;

public class BringError{
	public static void main(String args[]){
		new BringError().start();
	}
	void start(){
		String input = JOptionPane.showInputDialog("得点は?");
		int score = Integer.parseInt(input);
		if(score < 0 || score > 100){
			JOptionPane.showMessageDialog(null, "違法な数値です");		
		}
		else if(score < 60){
			JOptionPane.showMessageDialog(null, "不合格です");
		}
		else if(score < 80){
			JOptionPane.showMessageDialog(null,"合格ですyo");
		}
		else{
			JOptionPane.showMessageDialog(null, "合格です");
			JOptionPane.showMessageDialog(null,"素晴らしい成績です");
		}
	}
}