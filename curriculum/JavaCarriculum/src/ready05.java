
public class ready05 {
	public static void main(String[] args) {

		//プリミティブ型

		//整数型　(int long)
		// int  -2147483648 ～ 2147483647
		// long -9223372036854775808 ～ 9223372036854775807
		long long1 = 9223372036854775807; //コンパイルエラーになる
		long long2 = 9223372036854775807L; //明示的にlong型の場合、末尾にLをつける
		short short1 = 1234; //short型は-32768~32767まで
		byte byte1 = 127; //byte型は-128~127まで

		//浮動小数型 (double float)
		double double1 = 0.000; //浮動小数点は通常double型
		double double2 = 0.00d; //明示的にdまたはDを末尾につけることがある
		float float1 = 0.0000; //コンパイルエラーになる
		float float2 = 0.0001f; //float型の場合、末尾にfをつける

		//論理型  (boolean)trueかfalseの二択
		boolean boolean1 = true;
		boolean boolean2 = false;

		//文字型 (char) シングルクォーテーション及びセミコロンが必要
		char aisisi = 'あ';
		char ais = 'A';
		char char34 = "ab" //コンパイルエラー
		char caa = 'aaaa' //コンパイルエラー


		//参照型
		//データのある参照先を保存する型
		//データそのものでは無く、データの場所を参照することでデータを取り出す

		//文字列クラス(String) ダブルクォーテーションが必要
		String string1 = "あいう";



	}

}
