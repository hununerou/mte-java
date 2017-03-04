package hoseihp;
import javax.swing.JOptionPane;

public class MessagesError{
	public static void main(String args[]){
		new MessagesError().start();
	}
	void start(){
		String[] messages = new String[9];
		messages[0] = null;
		messages[1] = "入出力";
		messages[2] = "式と変数";
		messages[3] = "条件分岐";
		messages[4] = "手続き";
		messages[5] = "関数"	;				
		messages[6] = "値の列";
		messages[7] = "繰り返し";
		messages[8] = "複合データ";
		
		String input = JOptionPane.showInputDialog("何回目の授業ですあ?\n"+"1から8で入力してください");
		int index = Integer.parseInt(input);
		if(index < 1 || index > 8){
			JOptionPane.showMessageDialog(null, "1から8で入力してください");
			start();
		}
		else{
			JOptionPane.showMessageDialog(null, index+"回目の授業は"+messages[index]);
		}
	}
}