package withcom;
import javax.swing.JFrame;
class Yobidashi{
	public static void main(String args[]){
    JFrame f = new JFrame("welcome to hell!");  //フレーム呼び出し
    f.setSize(400, 200);      //フレームサイズ指定
    f.setVisible(true);       //trueとして呼び出さないと表示されない
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //閉じます
	}
}