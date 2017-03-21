package hoseihp;

import javax.swing.JOptionPane;

public class Show2D {

	public static void main(String[] args) {
		new Show2D().start();
	}

	void start() {
		int[][] matrix = new int[2][3];
		matrix[0][0] = 1;
		matrix[0][1] = 2;
		matrix[0][2] = 3;
		matrix[1][0] = 4;
		matrix[1][1] = 5;
		matrix[1][2] = 6;
		for (int i = 0; i < 2; i++) { // 1次元の枠
			String line = "";
			for (int j = 0; j < 3; j++) { // 2次元の枠
				int value = matrix[i][j];
				line = line + value + " ";
			}
			JOptionPane.showMessageDialog(null, (i + 1) + "行目は" + line);
		}
	}
}
