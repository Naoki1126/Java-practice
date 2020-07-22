//再帰処理
public class Recursive01 {
	public static void main(String[] args) {
		int number = 1;
		//メソッドの呼び出し、引数にnumberを指定
		printNum(number);
	}

	public static int printNum(int number) { //上よりnumberを受け取る
		if (number < 50) {
			number *= 2;
			System.out.println("While1 = " + number);
			//条件に合致したら再びnumberを呼び出す
			printNum(number);
		}
		return number;
	}
}
