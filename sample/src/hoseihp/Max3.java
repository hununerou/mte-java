package hoseihp;
import javax.swing.JOptionPane;

public class Max3{
	public static void main(String args[]){
		new Max3().start();
	}
	void start(){
		String inputAlice = JOptionPane.showInputDialog("アリスの得点は?");
		String inputbob = JOptionPane.showInputDialog("ボブの特典は?");
		String inputcharley = JOptionPane.showInputDialog("チャリーの特典は");
		int alice = Integer.parseInt(inputAlice);
		int bob = Integer.parseInt(inputbob);
		int charley = Integer.parseInt(inputcharley);
		
		if(alice>bob && alice>charley){
			JOptionPane.showMessageDialog(null, "aliceが一番");
		}
		else if(bob>charley){
			JOptionPane.showMessageDialog(null, "bobが一番");
		}
		else{
			JOptionPane.showMessageDialog(null, "charleyが一番");
		}
	}
}