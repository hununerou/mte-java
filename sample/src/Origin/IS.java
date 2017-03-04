package Origin;
//挿入ソートを行います
public  class IS{
	public static void main(String args[]){
		int array[] = {5,9,33,1,2};
		int i,j,tmp;
			for(i=1;i<5;i++){
           for(j=i;j>=1 && array[j-1]>array[j];j--){
				 tmp = array[j-1];
				 array[j-1] = array[j];
				 array[j] = tmp;     
			   
			 }
		 }
			for(int k=0;k<array.length;k++){
				System.out.print(array[k]+" ");
			}
	  }
}