package hoseihp;
import javax.swing.JOptionPane;

public class SharedReferences {

	public static void main(String[] args) {
		new SharedReferences().start();
	}
	void start(){
		String messages[] = new String[2];
		messages[0] = "hello";
		messages[1] = "world";
		String copy[] = new String[2];
		//JOptionPane.showMessageDialog(null, copy); copy内容はhello(改行)world
		copy[0] = "こんにちは";
		copy[1] = "世界";
		for(int i = 0; i < messages.length; i++){
			JOptionPane.showMessageDialog(null, "messages["+i+"]"+messages[i]);
		}
		for(int i = 0; i<copy.length;i++){
			JOptionPane.showMessageDialog(null, "copy["+i+"]:"+copy[i]);
		}
	}
}
