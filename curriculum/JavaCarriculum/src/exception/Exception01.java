package exception;

//例外処理
//０で割り算した場合、nullオブジェクトのメンバを参照した場合に起こる
//例外処理をしていない場合、エラーメッセージが出力され、プログラムが終了する
public class Exception01 {
	public static void main(String[] args) {
		System.out.println("100 / 0　は?");
		// 0で割り算するので例外が発生する
		int result = 100 / 0;
		// 例外が発生した後の処理は実行されない
		System.out.println("計算結果" + result);
		System.out.println("プログラム処理");
	}
}
