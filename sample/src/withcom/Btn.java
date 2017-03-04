package withcom;
import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Container;
import javax.swing.ImageIcon;
class Btn{
	public static void main(String args[]){
		//フレーム
		JFrame f = new JFrame("ボタン表示");
		//コンテンツ区画
		Container cont = f.getContentPane();
		//ボタン出す
		JButton but = new JButton(new ImageIcon("/home/mte/eclipse/sample/20130812-DSC_1068-blog.jpg"));
		//ボタンコンテンツを登録
		cont.add(but);
		
		//フレームサイズ
		f.setSize(400, 200);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}