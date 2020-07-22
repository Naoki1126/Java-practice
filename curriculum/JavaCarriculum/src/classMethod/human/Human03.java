package classMethod.human;

public class Human03 {
	public String name;
	public int age;
	public String profession;

	public Human03() {
		this.name = "山田";
		this.age = 20;
		this.profession = "プログラマー ";
	}

	public String getProfile() {
		//処理の結果を呼び出し元に返す　return
		return "年齢は" + this.age + "、職業は" + this.profession + "です";
	}

	public void greet(String friend) {
		if (friend == null) {
			System.out.println("挨拶をする人がいません");
			//returnには処理を終了させるという意味がある 戻り値なしのvoidでも使用可能
			return;

		}
		System.out.println(friend + "さん、こんにちは!");
	}

}
