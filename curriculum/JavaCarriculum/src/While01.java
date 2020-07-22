
public class While01 {
	public static void main(String[] arg) {
		int number = 1; //numberに1を代入
		while (number < 50) { //条件指定　numberが50未満の場合下記処理を繰り返す trueで有る限り
			number *= 2; // number = number * 2;
			System.out.println("while01=" + number); //numberの数値を出力
		}
	}
}
