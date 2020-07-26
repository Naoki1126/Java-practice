package extend;

import extend.human.Employee;
import extend.human.Human;
import extend.human.Student;

public class Extend01 {
	public static void main(String[] args) {
		//Humanクラスのインスタンスを作成
		Human sugimoto = new Human("杉本",16);
		System.out.println("Humanクラスのメソッド；名前は" + sugimoto.getName());
		//Studentクラスのインスタンスを作成
		Student sato = new Student("佐藤",17,70);
		//subclassのインスタンスからスーパークラス(Humanクラス)のメソッドを呼び出し
		System.out.println("Humanクラスのメソッド；名前は、"  + sato.getName());
		//studentクラスに追加したgetStudentProfileメソッドを呼び出し
		System.out.println("Studentクラスのメソッド:プロフィールは、" + sato.getStudentProfile());

		//Employeeクラスのインスタンスを生成して、アップキャストでHumanクラスの変数に代入
		Human human = new Employee("田中",28,"システム部");
		//Superクラスのメソッドを実行
		System.out.println("Humanクラスのメソッド；名前は" + human.getName());

		//HumanクラスにはgetEmproyeeProfileメソッドがないのでアクセスするとコンパイルエラー
		// System.out.println("Employeeクラスのメソッド：" + human.getEmployeeProfile());
		//Employeeクラスの変数にダウンキャスト
		Employee tanaka = (Employee) human;
		//Employeeクラスの変数なので、Employeeクラスに追加したgetEmployeeProfileメソッドの呼び出しができる
		System.out.println("Employeeクラスのメソッド:プロフィールは" + tanaka.getEmployeeProfile());

		//printNameメソッドを使用して名前を表示
		Extend01.printName(sugimoto);
		//Humanクラスのサブクラスの変数を引数にして呼び出し
		Extend01.printName(sato);
		Extend01.printName(tanaka);

	}
	//引数がHumanクラスなので、Humanクラスかそのサブクラスなら呼び出しができる
	public static void printName(Human human) {
		System.out.println("Humanクラスのメソッド；名前は" + human.getName());
	}

}

// 継承
//修飾子 class クラス名 extends スーパークラス名前
	//サブクラスの処理
//final　が指定されたclassは継承が禁止
//継承のメリット
	//スーパークラスのメソッドをそのまま利用して、追加したい処理だけを実装できる。
	//同じスーパークラスを継承しているサブクラスをスーパークラスの変数に代入して使用できる。
	//メソッドの引数をスーパークラスの型で作成しておけばサブクラスの型ごとに作成しなくても同じ処理を実装できる