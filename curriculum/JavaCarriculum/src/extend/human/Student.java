package extend.human;
//Humanクラスを継承したStudentクラス
public class Student extends Human{
	//サブクラス(Student)クラスで追加したフィールド
	private int score;

	public Student(String name, int age, int score) {
		//スーバークラスのコンストラクタの呼び出し
		super(name,age);
		//仮引数Score
		this.score = score;
	}
	//サプクラスで追加したメソッド

	public String getStudentProfile() {
		//親インスタンスのフィールドをSuperで参照
		String profile = "年齢は" + super.age + "です";
		profile += "学生で、テストの点数は" + this.score + "点です。";
		return profile;
	}
}
