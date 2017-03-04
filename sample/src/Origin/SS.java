package Origin;
//選択ソートを行います
public  class SS{
	public static void main(String args[]){
		int i,j,tmp,min;
		int [] array = {11,4,1,3,5};
		for(i=0;i<4;i++){    //配列サイクルの定義
			min = i;
			for(j=i+1;j<5;j++){
			if(array[min]>array[j]){
                min = j;
			  }
			}	
		    tmp = array[i];
		    array[i] = array[min];
		    array[min] = tmp;
		}
		for(int k=0;k<array.length;k++){
		System.out.print(array[k]+" ");
		}
	}
}