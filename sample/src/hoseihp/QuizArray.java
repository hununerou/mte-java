//あきらめやつ

package hoseihp;
import javax.swing.JOptionPane;

public class QuizArray{
	public static void main(String args[]){
		new QuizArray().start();
	}
	void start(){
		String input = JOptionPane.showInputDialog("問題番号を選んでください\n0~4");
		int choice = Integer.parseInt(input);

		if(answer(choice)){
		JOptionPane.showMessageDialog(null,"正解です");
		}
		else{
		JOptionPane.showMessageDialog(null,"不正解です");
		}
	}
	boolean answer(int quiz){

		int choice = quiz;
		if(choice == 0){
			String input = JOptionPane.showInputDialog("1+2は");
			int a = Integer.parseInt(input);
				if(a == 3){
					return true;
				}
				else{
					return false;
				}
		}
		else if(choice == 1){
			String input = JOptionPane.showInputDialog("1*2は");
			int a = Integer.parseInt(input);
				if(a == 2){
					return true;
				}
				else{
					return false;
				}
		}
		else if(choice == 2){
			String input = JOptionPane.showInputDialog("2+1ha");
			int a = Integer.parseInt(input);
				if(a == 3){
					return true;
				}
				else{
					return false;
				}
		}
		else if(choice == 3){
			String input = JOptionPane.showInputDialog("2*1ha");
			int a = Integer.parseInt(input);
				if(a == 2){
					return true;
				}
				else{
					return false;
				}
		}
		else if(choice == 4){
			String input = JOptionPane.showInputDialog("3+1ha");
			int a = Integer.parseInt(input);
				if(a == 4){
					return true;
				}
				else{
					return false;
				}
		}
		else{
			JOptionPane.showMessageDialog(null, "an illegal point");
			return false;
		}
	}
	
}