package hoseihp;
import javax.swing.JOptionPane;

public class HighOrLow{
	public static void main(String args[]){
		new HighOrLow().start();
	}
	void start(){
		int[] deck = createDeck();
		int victories = play(deck);
	
		if(victories == 0){
			JOptionPane.showMessageDialog(null, "1回も当たりませんでした");
		}
		else{
			JOptionPane.showMessageDialog(null, victories+"回当たりました");
		}
	}
	int[] createDeck(){
		//52枚のカードを作る
		int[] deck = new int[13];
		for(int i = 0;i < 13;i++){
			deck[i] = i+1;   //実際のカード1-13を生成
		}
		//シャッフルシマス
		for(int i = 0;i < deck.length;i++){
			//0~12の乱数を精製
			int random = (int)(Math.random()*deck.length); //intのキャストで小数点以下切り捨て
			
			//0~12で整っているカードと乱数の位置のカードを入れ替え
			int card = deck[i];
			deck[i] = deck[random];
			deck[random] = card;
		}
			return deck;
	}
	int play(int[] battle){
		int b = 0;
		for(int i = 0; i < battle.length; i++){
		String input = JOptionPane.showInputDialog("現在のカードは次のカードより\n1.大きい 2.小さい");
		int a = Integer.parseInt(input);

			if(a == 1){
				if(checkLow(b,battle)){
				b++;
				}
				else{
					return b;
				}
			}
		else if(a == 2){
			if(checkHigh(b,battle)){
				b++;
			 	}
			else{
				return b;
				}
			}
		else{
			JOptionPane.showMessageDialog(null, "an illegal point");
			return 0;
			}
		}
		return b;
	}
	//プレイヤーが次のカードを大きいと読んだ場合
	boolean checkHigh(int current,int[] next){

		int i = current;
			if(next[i+1] > next[i]){
			JOptionPane.showMessageDialog(null, "現在のカードは"+next[i]+"、次のカードは"+next[i+1]+"\n"+"正解です");
			return true;
		}
		else{
			JOptionPane.showMessageDialog(null, "現在のカードは"+next[i]+"、次のカードは"+next[i+1]+"\n"+"失敗です");
			return false;
		}
	}
	//プレイヤーが次のカードを小さいと読んだ場合
	boolean checkLow(int current,int[] next){
		
		int i = current;
		if(next[i+1] < next[i]){
			JOptionPane.showMessageDialog(null, "現在のカードは"+next[i]+"、次のカードは"+next[i+1]+"\n"+"正解です");
			return true;
		}
		else{
			JOptionPane.showMessageDialog(null, "現在のカードは"+next[i]+"、次のカードは"+next[i+1]+"\n"+"失敗です");
			return false;
		}
	}
}