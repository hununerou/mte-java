package withcom;
import javax.swing.*;
import java.awt.Container;
class Lbl{
	public static void main(String args[]){
		JFrame f = new JFrame("ラベルの表示");
		//ラベルコンテンツの確保
		Container cont = f.getContentPane();
		//ラベルの表示
		JLabel label = new JLabel("こんにちは");
		
		//ラベルをコンテンツに入れる
		cont.add(label, null);
		//フレームサイズ
		f.setSize(400, 200);
		//フレーム表示
		f.setVisible(true);
		//exit
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}