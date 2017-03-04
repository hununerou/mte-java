package withcom;
import java.awt.Container;
import javax.swing.JTextArea;
import javax.swing.JFrame;
class Tarea{
	public static void main(String args[]){
		JFrame f = new JFrame();
		Container cont = f.getContentPane();
		
		JTextArea area = new JTextArea("可\n変\n長\nよ",2,20);
		cont.add(area, null);
		
		f.setSize(300, 200);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
}