package Origin;

public class Web2 {

	public static void main(String[] args) {

		int[] array = new int[] {5,4,6,7,1,9,8,2,3};

		// 間隔は 4, 2, 1, 0と狭まっていく
		for (int range = array.length / 2; range > 0; range /= 2) {
			// 間隔内での移動
			for (int h = 0; h < range; h++) {
				// ここから挿入法
				// ソート対象データは間隔ごとの要素になるのでループの増分値はi += range
				for (int i = h + range; i < array.length; i += range) {
					System.out.print(i+" ");
				      }
			     	}
				}
			}
}