package beginner_1_3;
import java.util.Scanner;
public class practice3_6 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("【数あてゲーム】");
		int ans = new java.util.Random().nextInt(10);

		for(int i = 0;i < 5;i++) {
			System.out.println("0~9の数字を入力してください");
			int n = scanner.nextInt();
			if (n == ans) {
				System.out.println("アタリ!");
				break;
			}else {
				System.out.println("違います");
			}
		}
		System.out.println("ゲームを終了します");
	}
}
