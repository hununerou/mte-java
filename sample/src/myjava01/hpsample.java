package myjava01;

public class hpsample{
    public static void main(String args[]){

  int test[][] = {{40,57,16,75},{93,54,100},{29,43,65}};

  System.out.println("秋山君のテスト結果");
  System.out.println("国語のテスト結果は" + test[0][0]);
  System.out.println("数学のテスト結果は" + test[1][0]);
  System.out.println("英語のテスト結果は" + test[2][0]);

  System.out.println("---------------------");
  System.out.println("成田君のテスト結果");
  System.out.println("国語のテスト結果は" + test[0][1]);
  System.out.println("数学のテスト結果は" + test[1][1]);
  System.out.println("英語のテスト結果は" + test[2][1]);

  System.out.println("---------------------");
  System.out.println("山田君のテスト結果");
  System.out.println("国語のテスト結果は" + test[0][2]);
  System.out.println("山田君は数学のテストを受けませんでした");
  System.out.println("英語のテスト結果は" + test[2][2]);

  System.out.println("---------------------");
  System.out.println("吉田君のテスト結果");
  System.out.println("国語のテスト結果は" + test[0][3]);
  System.out.println("数学のテスト結果は" + test[1][2]);
  System.out.println("吉田君は英語のテストを受けませんでした");
 
  System.out.println("----------------------");
  System.out.println("配列0の要素数を調べます");
  System.out.println(test[0].length);
    }

}
