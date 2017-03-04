package Origin;
public class ShellSort{
	public static void main(String args[]){
		
		int range,j,k,l,tmp;
		int array[] = {1,9,5,7,8,6,4,2,3}; 
		
		//4,2,1,0と間隔を狭めていく定義
		for(range = array.length/2; range >= 1;range /= 2){
			//以下のISループに1ずつ値を増加していく
			for(j=0; j<range; j++){
				//基本挿入法ISの導入、kの要素とk+iの要素の比較準備
				for(k=j + range;k < array.length;k += range){
					tmp = array[k];
					l = k;
					for(;l >= range && array[l-range]>tmp;l -= range){
						array[l] = array[l-range];
					}
					array[l] = tmp;
				}
			}
		}
		for(int z = 0;z<array.length;z++){
		System.out.print(array[z]+" ");
		}
	}
}