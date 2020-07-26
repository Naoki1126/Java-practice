package extend.human;

//humanクラスを継承したEmployeeクラス
public class Employee extends Human {
	//サブクラスでのみのインスタンスフィールド
	private String deparment;

	public Employee(String name, int age, String deparment) {
		//superクラスのコンストラクタの呼び出し
		super(name,age);
		this.deparment = deparment;
	}
	//サブクラスで追加したメソッド
	public String getEmployeeProfile() {
		//親インスタンスのフィールドをthisで参照
		String profile = "年齢は、" + this.age + "です。";
		profile += "サラリーマンで、部署は" + this.deparment + "です。";
		return profile;
	}
}
