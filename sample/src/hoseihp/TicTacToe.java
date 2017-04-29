package hoseihp;

import javax.swing.JOptionPane;

public class TicTacToe {

	public static void main(String[] args) {
		new TicTacToe().start();
	}

	void start() {
		java.awt.Font font = new java.awt.Font("ＭＳ ゴシック", 0, 15);
		javax.swing.UIManager.put("Label.font", font);

		TicTacToeGame game = createGame();
		for (int i = 0; i < 9; i++) {
			inputCell(game);
			if (isGameSet(game.board)) {
				JOptionPane.showMessageDialog(null, playerToString(game.player) + "の勝ちです");
				break;
			}
			changePlayer(game);
		}
	}

	TicTacToeGame createGame() { // 3*3のボードを作る
		TicTacToeGame game = new TicTacToeGame();
		game.player = (int) (Math.random() * 2); // 先攻後攻ランダム
		game.board = new int[3][3];
		for (int x = 0; x < 3; x++) {
			for (int y = 0; y < 3; y++) {
				game.board[x][y] = -1; // -1のときx,yは何も書かれていない状態 これを3*3マス全てに適用
			}
		}
		return game;
	}

	void changePlayer(TicTacToeGame game) { // プレイヤーとCPUの順番を切り替える
		if (game.player == 0) {
			game.player = 1;
		} else {
			game.player = 0;
		}
	}

	void inputCell(TicTacToeGame game) {
		if (game.player == 0) {
			inputCellByYou(game.board);
		} else {
			inputCellByComputer(game.board);
		}
		JOptionPane.showMessageDialog(null,
				playerToString(game.player) + "の手番が終了しました\n" + "現在の盤面:\n" + boardToString(game.board));
	}

	void inputCellByYou(int[][] board) { 
		String input = JOptionPane.showInputDialog("あなたの番です。好きなところに丸を置いてください\n1 2 3\n4 5 6\n7 8 9");
		int a = Integer.parseInt(input);
		if (a == 1) {
			if (Checkplayer(board[0][0])) {
				board[0][0] = 0;
			} 
		} else if (a == 2) {
			if (Checkplayer(board[1][0])) {
				board[1][0] = 0;
			}
		} else if (a == 3) {
			if (Checkplayer(board[2][0])) {
				board[2][0] = 0;
			}
		} else if (a == 4) {
			if (Checkplayer(board[0][1])) {
				board[0][1] = 0;
			}
		} else if (a == 5) {
			if (Checkplayer(board[1][1])) {
				board[1][1] = 0;
			}
		} else if (a == 6) {
			if (Checkplayer(board[2][1])) {
				board[2][1] = 0;
			}
		} else if (a == 7) {
			if (Checkplayer(board[0][2])) {
				board[0][2] = 0;
			}
		} else if (a == 8) {
			if (Checkplayer(board[1][2])) {
				board[1][2] = 0;
			}
		} else if (a == 9) {
			if (Checkplayer(board[2][2])) {
				board[2][2] = 0;
			}
		} else {
			JOptionPane.showMessageDialog(null, "無効な数値");
			//おけないところに置いた場合もう一度やらせるように設定したい
		}
	}

	void inputCellByComputer(int[][] board) {
		JOptionPane.showMessageDialog(null, "CPUの番です");
		int random = (int) (Math.random() * 9);
		if (random == 0) {
			if (Checkcom(board[0][0])) {
				board[0][0] = 1;
			}
		} else if (random == 1) {
			if (Checkcom(board[1][0])) {
				board[1][0] = 1;
			}
		} else if (random == 2) {
			if (Checkcom(board[2][0])) {
				board[2][0] = 1;
			}
		} else if (random == 3) {
			if (Checkcom(board[0][1])) {
				board[0][1] = 1;
			}
		} else if (random == 4) {
			if (Checkcom(board[1][1])) {
				board[1][1] = 1;
			}
		} else if (random == 5) {
			if (Checkcom(board[2][1])) {
				board[2][1] = 1;
			}
		} else if (random == 6) {
			if (Checkcom(board[0][2])) {
				board[0][2] = 1;
			}
		} else if (random == 7) {
			if (Checkcom(board[1][2])) {
				board[1][2] = 1;
			}
		} else if (random == 8) {
			if (Checkcom(board[2][2])) {
				board[2][2] = 1;
			}
		}
	}

	boolean Checkplayer(int a) { // -1以外の数値が置かれていないかどうかの判定
		if (a == -1) {
			return true;
		}
		JOptionPane.showMessageDialog(null, "そこにはもうおけません");
		return false;
	}

	boolean Checkcom(int a) { // playerとcomの2つを用意したのはDialog(そこにはおけない)を省略するため
		if (a == -1) {
			return true;
		}
		return false;
	}

	boolean isGameSet(int[][] board) { // どこかのラインが揃っているかをisStraightに問い合わせる
		if (isStraight(board[0][0], board[1][0], board[2][0])) { // 上横3つ
			return true;
		} else if (isStraight(board[0][1], board[1][1], board[2][1])) { // 中横3つ
			return true;
		} else if (isStraight(board[0][2], board[1][2], board[2][2])) { // 下横3つ
			return true;
		} else if (isStraight(board[0][0], board[1][0], board[2][0])) { // 左端縦3つ
			return true;
		} else if (isStraight(board[1][0], board[1][1], board[1][2])) { // 真ん中縦3つ
			return true;
		} else if (isStraight(board[2][0], board[2][1], board[2][2])) { // 右端縦3つ
			return true;
		} else if (isStraight(board[0][0], board[1][1], board[2][2])) { // 右肩下がり斜め3つ
			return true;
		} else if (isStraight(board[0][2], board[1][1], board[2][0])) { // 右肩上がり斜め3つ
			return true;
		}
		return false; // どこのラインも揃っていない場合
	}


	boolean isStraight(int a, int b, int c) {
		if (a == -1 || b == -1 || c == -1) { // もし□が一つでも残っているのならゲーム続行
			return false;
		}
		if (a == b && a == c) { // もしどこかのラインが揃ったのならゲーム終了
			return true;
		}
		return false; // 勝負がついていない場合
	}

	String boardToString(int[][] board) {
		String string = "";
		for (int y = 0; y < 3; y++) {
			for (int x = 0; x < 3; x++) {
				string = string + cellToString(board[x][y]); // 自らを足しているのはボードの数を9つ用意するため
				// JOptionPane.showMessageDialog(null, board[x][y]);
				// [0][0],[1][0],[2][0],[0][1]の順
			}
			string = string + "\n";
		}
		return string;
	}

	String playerToString(int player) {
		if (player == 0) {
			return "あなた";
		} else {
			return "コンピュータ";
		}
	}

	String cellToString(int cell) {
		if (cell == -1) {
			return "□";
		} else if (cell == 0) {
			return "○";
		} else {
			return "×";
		}
	}

	boolean canPut(int[][] board, int x, int y) {
		if (x < 0 || x > 3) {
			return false;
		}
		if (y < 0 || y > 3) {
			return false;
		}
		if (board[x][y] != -1) {
			return false;
		}
		return true;
	}
}

class TicTacToeGame {
	int player;
	int[][] board;
}
