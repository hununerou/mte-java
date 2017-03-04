package hoseihp;
import javax.swing.JOptionPane;

public class ConvertCelsius{
	public static void main(String args[]){
		new ConvertCelsius().start();
	}
	
	void start(){
		String input = JOptionPane.showInputDialog("摂氏を入力");
		double a = Double.parseDouble(input);
		double b = 0;
		double c = 0;
		double result1 = convert1(a,b);
		double result2 = convert2(a,c);
		JOptionPane.showMessageDialog(null, "摂氏→華氏:"+result1);
		JOptionPane.showMessageDialog(null, "摂氏→ケルビン:"+result2);
	}
	double convert1(double a,double b){
		b = a*1.8-459.67;
		return b;
	}
	double convert2(double a, double c){
		c = a+273.15;
		return c;
	}
	
}