package capsule.human;

public class NoCapsuleMan {
	public String name;
	public int age;

	public NoCapsuleMan(String name,int age) {
		this.name = name;
		this.age = age;
	}

	public void printData() {
		System.out.println("名前は" + this.name + "です");
		System.out.println("年齢は" + this.age + "歳です");
		this.age += 1;
		System.out.println("誕生日を迎えたので、年齢が" + this.age + "になりました");
	}
}
