package hoseihp;

import javax.swing.JOptionPane;

public class ModifyArray {

	public static void main(String[] args) {
		new ModifyArray().start();
	}

	void start() {
		int[] array = new int[3];
		array[0] = 0;
		array[1] = 1;
		array[2] = 2;
		modify(array);
		for (int i = 0; i < array.length; i++) {
			JOptionPane.showMessageDialog(null, i + ": " + array[i]);
		}
	}

	void modify(int[] param) {
		String input = JOptionPane.showInputDialog("変更する配列をえらぶ");
		int a = Integer.parseInt(input);
		if(a < 3){
		param[a] = 12345;
		}
		else{
			JOptionPane.showMessageDialog(null, "ンゴオオオオオオオオオ");
			modify(param);
		}
	}

}
