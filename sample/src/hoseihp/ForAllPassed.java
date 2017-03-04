package hoseihp;
import javax.swing.JOptionPane;

public class ForAllPassed {

	public static void main(String[] args) {
		new ForAllPassed().start();
 }

	void start() {
		String input = JOptionPane.showInputDialog("5個の得点をカンマ区切りで入力");
		String[] fields = input.split(",",5);
		
		if(fields.length != 5){
			JOptionPane.showMessageDialog(null, "正しくない入力です:"+input);
		}
		else{
			int[] scores = toIntArray(fields);
			
			if(isAllPassed(scores)){
				JOptionPane.showMessageDialog(null, "すべて合格です");
			}
			else{
				JOptionPane.showMessageDialog(null, "不合格のものがあります");
			}
		}
	} 
		int[] toIntArray(String[] fields){
			int results[] = new int[fields.length];
			
		results[0] = Integer.parseInt(fields[0]);
		results[1] = Integer.parseInt(fields[1]);
		results[2] = Integer.parseInt(fields[2]);
		results[3] = Integer.parseInt(fields[3]);
		results[4] = Integer.parseInt(fields[4]);
		
		return results;
	}
		boolean isAllPassed(int[] score){
			for(int i = 0; i < score.length; i++){
				if(score[i] < 60){
					return false; //60未満があった場合即NG
				}
			}
				return true;		//全て80以上だった場合
		}
	
}