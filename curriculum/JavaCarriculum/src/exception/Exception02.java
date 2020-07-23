package exception;

//例外処理
//try-catch
public class Exception02 {
	public static void main(String[] args) {
		// tryプロック (例外が発生する可能性がある処理
		try {
			System.out.println("100 / 0　は?");
			int result = 100 / 0;
			System.out.println("計算結果" + result);
		// catch(例外クラス 変数名)
		// catchブロック　例外が発生した時に実行する処理
		} catch (ArithmeticException e) {
			//例外クラスが一致するので、例外処理が実行される
			System.out.println("例外が発生");
		// finallyブロック 例外の有無にかかわらず実行する処理
		} finally {
			System.out.println("プログラム終了");
		}
	}
}
