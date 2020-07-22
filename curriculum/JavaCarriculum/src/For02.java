
public class For02 {
	public static void main(String[] args) {
		//拡張for文　展開したい変数に要素が配列で含まれている時に使用
		int[] array = { 1,2,3,4,5 }; //変数の初期化
		for (int number : array) { //(arrayの要素を一つずつnumber要素の数だけ代入する　(rubyでいうeach do |f|と同じ)
			System.out.println("number= " + number);
		}

		//下記通常のfor文での配列の取り出し

		String[] names = { "田中", "山田","丸山" }; //配列namesの定義
		//左より　nを0で初期化、namesの要素数を取得しnがnamesの要素数より下の場合にtrue、プロック処理後nに1を足す,
		for (int n = 0; n < names.length; n++) {
			System.out.println(names[n]); //インデックス番号の指定[]
		}
	}
}
