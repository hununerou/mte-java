package hoseihp;
import javax.swing.JOptionPane;

public class SplitAverage{
	public static void main(String args[]){
		new SplitAverage().start();
	}
	void start(){
		double i[]= {5.5,4.4,3.3};
		
		double ave = (i[0]+i[1]+i[2])/3;
		
		JOptionPane.showMessageDialog(null, "全ての平均値は"+ave);
	}
}