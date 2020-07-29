package beginner_1_4;
import java.util.Scanner;
public class practice4_4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int[] numbers = {3,4,9};
		System.out.print("1桁の数字を入力してください");
		int input = scanner.nextInt();
		for (int n: numbers) {
			if (n == input) {
				System.out.println("アタリ!");
			}else {
				System.out.println("ハズレ");
			}
		}

	}
}
