package classMethod;
// 実行ファイル
// importにより外部のクラスを読み込む
// importで宣言しないとパッケージ名.クラス名をつけて読み込まなければならない
// importがあればクラス名だけで外部のメソッドを使える
import classMethod.human.Human02;
public class ClassMethod02 {

	 public static void main(String[] args) {
		 	//もし仮にimportで宣言をしない場合、 new classMethod.human.Human02();と書く
	        Human02 yamada = new Human02();
	        System.out.println("名前は" + yamada.name + "で、年齢は" + yamada.age + "です。");
	        //もし仮にimportで宣言をしない場合、 new classMethod.human.Human02("佐藤”,25);と書く
	        Human02 sato = new Human02("佐藤", 25);
	        System.out.println("名前は" + sato.name + "で、年齢は" + sato.age + "です。");
	    }

}
