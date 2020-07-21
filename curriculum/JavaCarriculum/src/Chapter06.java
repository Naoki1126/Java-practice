
public class Chapter06 {
	public static void main(String[] args) {
		int var = 2 + 5;
		System.out.println(var);
		var++;
		System.out.println(var);
		var *= 5;
		System.out.println(var);

		boolean bool = (var == 50);
		System.out.println(bool);
		bool = (var < 50) && (var % 10 == 0);
		System.out.println(bool);

	}
}
