package hoseihp;

import javax.swing.JOptionPane;

public class ModifyParameter {

	public static void main(String[] args) {
		new ModifyParameter().start();
	}

	void start() {
		int variable = 100;
		modify(variable);
		JOptionPane.showMessageDialog(null, variable);
	}

	void modify(int param) {
		param = 200;
	}
}
