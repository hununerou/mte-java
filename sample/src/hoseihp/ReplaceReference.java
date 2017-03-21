package hoseihp;

import javax.swing.JOptionPane;

public class ReplaceReference {

	public static void main(String[] args) {
		new ReplaceReference().start();
	}

	void start() {
		String[] messages = new String[2];
		messages[0] = "hello";
		messages[1] = "world";
		assign(messages);
		for (int i = 0; i < messages.length; i++) {
			JOptionPane.showMessageDialog(null, "messages[" + i + "]: " + messages[i]);
		}
	}

	void assign(String[] array) {
		
		array[0] = "こんにちは";
		array[1] = "世界";
	}
}
