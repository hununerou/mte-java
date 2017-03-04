package myjava02;
public class Sansho{
	public static void main(String args[]){
		//インスタンス
		Sansho obj = new Sansho();
		//メンバーメソッド呼び出し準備
		obj.display();
	}
	//メンバーメソッド
	void display(){
		int x = 21;
		int y = 11;
		System.out.println("intx="+x + ",inty="+y);
	}
}