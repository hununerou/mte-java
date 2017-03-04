package hoseihp;
import javax.swing.JOptionPane;

public class Reverse{
	public static void main(String args[]){
		new Reverse().start();
	}
	void start(){
		String[] messages = new String[5];
		messages[0] = "おはよう";
		messages[1] = "こんにちは";
		messages[2] = "こんばんは";
		messages[3] = "さようなら";
		messages[4] =	"おやすみなさい";

		for(int i = 0;i < messages.length; i++){
				JOptionPane.showMessageDialog(null,messages[i]);
		}
	}
}