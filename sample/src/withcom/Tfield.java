package withcom;
import javax.swing.JTextField;
import javax.swing.JFrame;
import java.awt.Container;
class Tfield{
	public static void main(String args[]){
		JFrame f = new JFrame();
		Container cont = f.getContentPane();
		//text filed
		JTextField fd = new JTextField("よおこそ");	
		
		cont.add(fd, null);
		
		f.setSize(500, 300);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}