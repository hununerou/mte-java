package myjava01;
public class Ronri{
	
	public static void main(String args[]){
		int x = 15;
		int y = 20;
		int z = 30;
		boolean a =(x<y)&&(++x<y);
		
		System.out.println("x&y= "+(x&y));
		System.out.println("x|y= "+(x|y));
		System.out.println("x^y= "+(x^y));
		System.out.println("xとyは"+a);
		System.out.println(x);
		System.out.println("x>y||x>zは"+((x>y)|(++x>z)));
		System.out.println(x);
		System.out.println(x>y? ("yは20以上です。"):("xは20未満です。"));
	}
}