
public class Chapter05 {
	public static void main(String[] args) {
		long lon1 = 111111111111L;
		System.out.println(lon1);
		double double01 = 0.02;
		double double02 = 0.0001d;
		System.out.println(double01);
		System.out.println(double02);
		boolean bool01 = true;
		boolean bool02 = false;
		System.out.println(bool01);
		System.out.println(bool02);
		//オートボクシング
		Integer integer1 = 123;
		//アンボクシング
		int int1 = integer1;
		System.out.println(int1);

		//オートボクシング
		Float float01 = 0.2f;
		//アンボクシング
		float float1 = float01;
		System.out.println(float1);

		//オートボクシング
		Character character01 = 'あ';
		//アンボクシング
		char char01 = character01;
		System.out.println(char01);



		int[] int02 = {1,2,3,4,5};
		//3つ目の要素を取得
		System.out.println(int02[2]);




	}
}
