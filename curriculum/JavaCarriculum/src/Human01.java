
public class Human01 {
	
	//インスタンスフィールド（情報)の宣言
	public String name;
	public int age;
	
	//引数なしのコントラクタを作成
	public Human01() {
		//初期化処理
		name = "山田";
		age = 20;
	}
	//引数ありのコントラクタを作成
	//mainメソッドから受け取る仮引数を定義
	public Human01(String name,int age) {
		//引数をインスタンスフィールドに代入する処理 thisを用いる
		//name = name とすると引数に引数を代入する処理になるので注意
		this.name = name;
		this.age = age;
	}
}
