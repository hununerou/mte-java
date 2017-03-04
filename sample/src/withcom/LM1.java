package withcom;
import java.awt.Container;
import javax.swing.JFrame;
import java.awt.BorderLayout;
import javax.swing.JButton;
class LM1{
	public static void main(String args[]){
		JFrame f = new JFrame("ボーダーレイアウト");
		Container cont = f.getContentPane();
		
		JButton box1 = new JButton("北");
		JButton box2 = new JButton("東");
		JButton box3 = new JButton("南");
		JButton box4 = new JButton("西");
		JButton box5 = new JButton("センター!w");
		BorderLayout f1 = new BorderLayout(10,5);
		cont.setLayout(f1);
		
		cont.add(box1, "North");
		cont.add(box2, "East");
		cont.add(box3, "South");
		cont.add(box4, "West");
		cont.add(box5, "Center");
		
		f.setSize(400,400);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}