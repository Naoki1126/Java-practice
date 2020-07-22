package classMethod.human;

public class Human04 {

	//static変数 フィールドの参照をメソッドからでなく、classから出来るようにする
	static public int humanCount = 0;
	public String name;
	//final 上書きを出来なくするメソッドであればオーバーライド、クラスであれば継承を禁じる
	public static final String GREETING = "こんにちは";

	public Human04(String name) {
		this.name = name;
		//インスタン生成ごとにstatic変数をインクリメント
		Human04.humanCount++;
	}

	static public void staticMethodPrint() {
		//staticメソッドからインスタンス変数は使用できない(コンパイルエラー)
		//System.out.println("名前は" + name);
		//static変数のhumanCountを表示
		System.out.println("人の数は" + Human04.humanCount);
	}

	public void instanceMethodPrint() {
		//インスタンス変数のnameを表示
		System.out.println("名前は" + name);
		//static変数のhumanCountを表示
		System.out.println("人の数は" + Human04.humanCount);
	}

}
