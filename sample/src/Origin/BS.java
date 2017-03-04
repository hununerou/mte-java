package Origin;
//基本交換法を行います
public class BS{
	public static void main(String args[]){
		int array[] = {5,11,2,3,7};
		int i,j,tmp;
		//配列の交換定義
	    for(i=0;i<4;i++){
	    	//配列の中身の交換定義
	    	for(j=0;j<4;j++){
	    		//example:配列[0]は配列[1]より大きいか
	    		if(array[j]>array[j+1]){
	    			tmp = array[j];
	    			array[j] = array[j+1];
	    			array[j+1] = tmp;
	    		}
	    	}
	    }
	    for(int k = 0;k<array.length;k++){
	    System.out.print(array[k]+" ");
	    }
	}
}