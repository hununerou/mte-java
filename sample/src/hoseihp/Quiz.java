package hoseihp;
import javax.swing.JOptionPane;

public class Quiz{
	public static void main(String args[]){
		new Quiz().start();
	}
	void start(){
		String input = JOptionPane.showInputDialog("以下のうち、変数の名前に仕えるものはどれでしょうか\n数字でお答えください\n(1)void (2)goto (3)$ (4)#");
		int board = Integer.parseInt(input);
		if(board == 2){
			JOptionPane.showMessageDialog(null, "正解です");
		}
		else{
			JOptionPane.showMessageDialog(null, "不正解です");
		}
	}
}