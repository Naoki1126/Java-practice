
public class Chapter08 {
	public static void main(String[] args) {
		//while文 1以上5未満の二乗
		int number = 1;
		int aaaa = 1;
		while (aaaa < 5) {
			System.out.println(number *= number);
			aaaa++;
			number = aaaa;
		}

		//通常for文 4つの要素の出力
		int[] numbers = { 1,2,3,4};
		for (int n = 0; n < numbers.length; n++) {
			System.out.println("numbersを順番に出力します");
			System.out.println("numbers =" + numbers[n]);
		}

		//拡張for文 要素の値が偶数の場合は処理を飛ばす

		for(int odd : numbers) {
			if(odd % 2 == 0) {
				continue;
			}
			System.out.println("4までの数値の偶数以外をoddに代入して出力します");
			System.out.println("odd = " + odd);
		}
	}
}
