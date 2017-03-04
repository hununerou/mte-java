package withcom;
import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JCheckBox;
import java.awt.FlowLayout;
class CB{
	public static void main(String args[]){
		JFrame f = new JFrame("チェックボックス搭載");
		Container cont = f.getContentPane();
		
		JCheckBox box0 = new JCheckBox("1000,");
		JCheckBox box1 = new JCheckBox("2000");
		JCheckBox box2 = new JCheckBox("3000");
		FlowLayout f1 = new FlowLayout();
		cont.setLayout(f1);
		
		cont.add(box0);
		cont.add(box1);
		cont.add(box2);
		
		f.setSize(500, 200);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
}