package hoseihp;
import javax.swing.JOptionPane;

public class Max3Error{
	public static void main(String args[]){
		new Max3Error().start();
	}
	
	void start(){
		String input1 = JOptionPane.showInputDialog("1つ目の入力");
		String input2 = JOptionPane.showInputDialog("2つ目の入力");
		String input3 = JOptionPane.showInputDialog("3つ目の入力");
		int a = Integer.parseInt(input1);
		int b = Integer.parseInt(input2);
		int c = Integer.parseInt(input3);
		int result = max(a,b,c);
		JOptionPane.showMessageDialog(null, "最大は"+result);
	}
	
	int max(int a,int b,int c){
		if(a > b){
			if(a > c){
				return a;
			}
			else{
				return c;
			}
		}
		else{
			if(b > c){
				return b;
			}
		}
		return c;
	}
}