
public class If01 {
	public static void main(String[] args) {
		int number = 7;
		if (number < 5) {
			System.out.println(number + "は5未満です");
		}
		if(number < 10) {
			System.out.println(number + "は10未満です");
		}
		if(number < 15) {
			System.out.println(number + "は10未満です");
		}

//		if (条件式){
//			ブロック(処理内容);
//		}

		//メソッドの呼び出し(引数7)
		if02(7);
	}

	//メソッドの定義(仮引数を定義)
	public static void if02(int number) {
		if (number <5) {
			System.out.println(number + "は5未満です");
		}else if (number < 10) {
			System.out.println(number + "は5以上10未満です");
		}else if (number < 15) {
			System.out.println(number + "は10以上15未満です");
		}else {
			System.out.println(number + "は15未満ではないです");
		}
	}

}
