
public class Null01 {
	public static void main(String[]args) {

		//参照型変数の定義
		String string01 = "nullテスト";
		System.out.println(string01 + "の文字数：" + string01.length());
		string01 = "";
		System.out.println(string01 + "の文字数" + string01.length());
		string01 = null;
		System.out.println(string01 + "の文字数" + string01.length());

	}

}
