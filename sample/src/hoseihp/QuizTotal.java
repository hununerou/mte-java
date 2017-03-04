package hoseihp;
import javax.swing.JOptionPane;

public class QuizTotal{
	public static void main(String args[]){
		new QuizTotal().start();
	}
	void start(){
		JOptionPane.showMessageDialog(null,"以下3問に答えてください");
		String input1 = JOptionPane.showInputDialog("1+2は?");
		String input2 = JOptionPane.showInputDialog("1*2は?");
		String input3 = JOptionPane.showInputDialog("1/2は?");
		
		int a = Integer.parseInt(input1);
		int b = Integer.parseInt(input2);
		float c = Integer.parseInt(input3);
		
		int result1 = ans1(a);
		int result2 = ans2(b);
		float result3 = ans3(c);
		
		JOptionPane.showMessageDialog(null, "正解した数は:"+(result1+result2+result3));
		if((result1+result2+result3) == 0){
		JOptionPane.showMessageDialog(null, "一つも正解してないです");
		}
	}
	int ans1(int a){
		if(a == 3){
			a = 1;
			return a;
		}
		else{
			a = 0;
			return a;
		}
	}
	int ans2(int b){
		if (b == 2){
			b = 1;
			return b;
		}
		else{
			b = 0;
			return b;
		}
	}
	float ans3(float c){
		if(c == 0.5){
			c = 1;
			return c;
		}
		else{
			c = 0;
			return c;
		}
	}
}