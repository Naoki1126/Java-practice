
public class DoWhile {
	public static void main(String[] args) {
		int number = 1; // numberに1を代入
		// do-while文 ループ処理を開始
		do {
			number *= 2;
			System.out.println("DoWhile =" + number);
		} while (number < 50); //条件式がtrueであれば処理を続行する

	}
}

//　whileとの違い　条件式をプロックの前に評価するか後に評価するか
// 条件式がFalseの場合、Whileでは処理は実行されないが、do-whileでは1回は必ず実行される
