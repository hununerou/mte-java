package hoseihp;
import javax.swing.JOptionPane;

public class Count{
	public static void main(String args[]){
		new Count().start();

	}
	void start(){
		String input = JOptionPane.showInputDialog("カンマ区切りの整数を入力");
		int values[] = toIntArray(input);

		int karioki = values[0];
		int kari = values[1];
		
		JOptionPane.showMessageDialog(null, +karioki+"\n"+kari);
		
		JOptionPane.showMessageDialog(null, "入力した数は"+values.length);
		JOptionPane.showMessageDialog(null, "60未満は"+countLower(values));
		JOptionPane.showMessageDialog(null,"80以上は"+countUpper(values));
	}
	int[] toIntArray(String inp){
		String[] fields = inp.split(",",0);
		
		int[] a = new int[fields.length];
		for(int i = 0;i < fields.length; i++){
			a[i] = Integer.parseInt(fields[i]);
		}
		String karioki =  new String(inp);
		JOptionPane.showMessageDialog(null, "あなたが入力したのは"+fields.length+"\n"+karioki);
		
		return a;
	}

	int countLower(int[] val){
			int j = 0;
			
		JOptionPane.showMessageDialog(null, "入力した数字は"+val.length);
		for(int k = 0;k < val.length; k++){
			if(val[k] < 60){
				 j++;
			}
		}
		int a = j;
		return a;
	}
	int countUpper(int[] aiueo){
		int j = 0;
		for(int i = 0; i < aiueo.length; i++){
			if(aiueo[i] >=80){
				j++;
			}
		}
		return j;
	}
}