package myjava02;
public class Through{
	public static void main(String args[]){
		int i,k;
		go:
		for(i=0;i<5;i++){
			for(k=0;k<3;k++){
				System.out.println("iの値は"+i +"、kの値は"+k);
				if(i==2 && k==2){
					
				break go;
				}
			}
		}
	}
}