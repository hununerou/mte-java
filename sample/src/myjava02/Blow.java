package myjava02;
public class Blow{
	public static void main(String args[]){
		int i=0;
		while(i<5){
			i++;
			if((i%2)==0){
				continue;
		}
			System.out.println(i+"回目の処理です。");
		}
		System.out.println("2の倍数は飛ばしました。");
	}
}