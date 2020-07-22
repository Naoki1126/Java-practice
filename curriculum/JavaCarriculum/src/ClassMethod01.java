
public class ClassMethod01 {
	public static void main(String[] args) {
		//Human01クラスを引数なしコントラクタでインスタンスを作成
		Human01 yamada = new Human01();
		//初期値が設定されたフィールドを参照
		System.out.println("名前は" + yamada.name + "です" + "年齢は" + yamada.age + "です");
		
		//Human01クラスを引数ありコントラクタでインスタンスを作成
		Human01 sato = new Human01("佐藤",25);
		//引数の値が設定されたフィールドを参照して表示
		System.out.println("名前は" + sato.name + "です" + "年齢は" + sato.age + "です");
		
	}

}
