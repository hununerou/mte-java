package hoseihp;
import javax.swing.JOptionPane;

public class QuestionOfThree{
	public static void main(String args[]){
		new QuestionOfThree().start();
	}
	void start(){
		String input = JOptionPane.showInputDialog("問題の番号を選んでね\n(1~3)の番号");
		int select = Integer.parseInt(input);
		
		if(select == 1){
			String in1 = JOptionPane.showInputDialog("1+2は?");
			int ans = Integer.parseInt(in1);
			if(ans == 3){
				JOptionPane.showMessageDialog(null, "正解ですQ");
			}else{
				int correctanswer = 3;
				JOptionPane.showMessageDialog(null, "バカ外れです!\n正解は"+correctanswer);
			}
		}
		else if (select == 2){
			String in1 = JOptionPane.showInputDialog("1*2は?");
			int ans = Integer.parseInt(in1);
			if(ans == 2){
				JOptionPane.showMessageDialog(null, "正解ですQ");
		}else{
			JOptionPane.showMessageDialog(null,"バカ外れです");
		}
	}
		else if (select == 3){
			String in1 = JOptionPane.showInputDialog("1/2は?");
			float ans = Float.parseFloat(in1);
			if(ans == 0.5){
				JOptionPane.showMessageDialog(null, "正解ですQ");
		}else{
			JOptionPane.showMessageDialog(null,"バカ外れです");
		}
	  }
	}		
}
	