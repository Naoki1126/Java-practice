
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
		String　string1 = "あいう";

		//ラッパークラス
		//プリミティブ型を参照型として扱えるようにできるクラス
		//プリミティブ型のままでは使えないメソッドを使用できるようになる

		//オートボクシング プリミティブ型からラッパークラスへ自動で変換を行うこと
		//アンボクシング 逆でラッパークラスからプリミティブ型に自動で変換する

		Integer integer1 = 5;                   // オートボクシング
		Integer integer2 = Integer.valueOf(5);  // オートボクシングなし
		int int1 = integer1;             // アンボクシング
		int int2 = integer2.intValue();  // アンボクシングなし


		//配列
		//複数のデータを1つの変数で扱うもの。プリミティブ型だけでなく参照型も含められる
		int[] array1 = new int[3];  // 配列の宣言と生成
		array1[0] = 60;  // インデックス番号「0」を指定して１番目の要素にデータを代入
		array1[2] = 20;  // ２番目の要素より先に３番目の要素にデータを代入
		array1[1] = 20;  // ３番目と同じ値を２番目の要素に代入
		int int2 = array1[2];  // インデックス番号「2」を指定して３番目の要素を取得

		int array2[] = null;  // []は変数名の後ろでも可

		//変数宣言と同時に初期化
		int[] array3 = new int[] { 10, 20, 50 };
		int[] array4 = { 10, 20, 50 };

		//null rubyでいうnil 参照型変数の中身が何もないことを意味する。参照型変数がnullの時、参照先を保持していない
		//NullPointerException(ヌルポ)というエラーが発生



	}

}
