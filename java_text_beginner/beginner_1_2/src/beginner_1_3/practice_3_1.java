package beginner_1_3;

public class practice_3_1 {
	public static void main(String[] args) {
		//weightの値が60に等しい
		int weight = 150;
		if (weight == 60) {
			System.out.println("weightの値は60です");
		}
		//変数age1とage2の合計が60を超えている
		int age1 = 30;
		int age2 = 39;
		if (age1 + age2 > 60) {
			age1 += 20;
		}
		//変数ageが奇数である
		int age = 23;
		if (!(age % 2 == 0)) {
			System.out.println("変数ageは奇数です");
		}
		//変数nameの中の文字列が湊と等しい
		String name = "湊";
		if (name.equals("湊")) {
			System.out.println("変数nameの中身は湊です");
		}
	}
}
