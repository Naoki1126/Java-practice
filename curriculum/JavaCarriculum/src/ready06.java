
public class ready06 {
	public static void main(String[] args){
		//演算子とオペランド
		//　a = b + 1
		// ＝ + - / % * を演算子
		// bや1をオペランドと呼ぶ

		int a = 15;
		int c;
		c = a + 3;  // c = 18
		c = a - 5;  // c = 10
		c = a * 2;  // c = 20
		c = a / 6;  // c = 2
		c = a % 4;  // c = 3

		//インクリメント、デクリメント演算子
		// ++ インクリメント
		// -- デクリメント

		int ab = 10;
		ab = ab + 1;
		ab++; //上記の省略（インクリメント)
		int abc = 12;
		abc = abc -1;
		abc--;//上記の省略(デクリメント)

		//前置きか後置で処理の内容が変わる
		a = 5;
		c = ++a;  // a をインクリメントした後に、a が c に代入される
		// それぞれの値は、a が「6」で c も「6」
		System.out.println(a);
		System.out.println(c);

		a = 5;
		c = a++;  // a を c に代入した後に、a がインクリメントされる
		// それぞれの値は、a が「6」で c が「5」
		System.out.println(a);
		System.out.println(c);
		//cには先に変数初期化時の5が代入された後にaが6になる
		//変数aの更新はどちらでも行う

//		代入演算子　変数への数値、計算結果の代入に使う
//
////		a = b  bをaに代入
//		a += b a+bをaに代入
//		a -= b a-bをbに代入
//		a *= b a*bをaに代入
//		a /= b a/bをaに代入
//		a %= b a%bをaに代入

		int n = 10;
		n += 3;
		System.out.println(n);
		n -= 3;
		System.out.println(n);
		n *= 2;
		System.out.println(n);
		n /= 5;
		System.out.println(n);
		n %= 3;
		System.out.println(n);

//		関係比較演算子　結果はtrueかfalseのbooleanになる
//		a < b aはbより小さい true
//		a > b aがbより大きい true
//		a <= b aがb以下 true
//		a >= aがb以上 true
//		a == b aとbが等しければtrue
//		a != b aとbが等しくなければtrue
//		c = a < 5;   // c = false
//		c = a <= 5;  // c = true
//		c = a > 4;   // c = true
//		c = a >= 6;  // c = false
//		c = a == 5;  // c = true
//		c = a != 5;  // c = false

//		論理演算子 結果はtrueかfalseのboolean型
//		a && b 条件二つがtrueであればtrue
//		a || b どちらかtrueであればtrue
//		!a aがfalseであればtrue
		boolean t = true;
		boolean f = false;

		if(t && f) {
			System.out.println("両方true");
		}else if(t || f) {
			System.out.println("片方がtrue");
		}else {
			System.out.println("test");
		}

		if(!f) {
			System.out.println("fがFalseであれば出力");
		}
		
//		文字列の連結  "" + ""
		String greeting = "こんにちは";
		String name = "丸山";
		System.out.println(greeting + name + "さん");
		
//		文字列の等価比較
		String aaaa = "こんにちは丸山さん";
		String bbbb = "こんにちは";
		String cccc = "丸山さん";
		String eeee = "こんにちは" + cccc;
		
//		中に入っているデータを比較する訳ではなく、参照先を比較するため下記だとエラーが出る。
//		if(aaaa == eeee) {
//			System.out.println("この構文は一般的には用いられない");
//		}
//		文字列を比較したい場合はequalsを用いる
//		c = a.equals(b);  // c = true
//		c = a.equals(e);  // c = true
//		c = a.equals(f);  // c = true
		
		if(aaaa.equals(eeee)) {
			System.out.println("この構文であればOK");
		}
		




	}

}
