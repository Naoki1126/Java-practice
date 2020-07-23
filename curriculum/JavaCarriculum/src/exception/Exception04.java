package exception;
//throws文 例外発生時にcatch文を記述してメソッド内で例外処理するのではなく、例外をスローして呼び出しもとに例外処理させたい場合に使用
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Exception04 {
	public static void main(String[] args) {
		try {
			// readFileメソッド呼び出し
			Exception04.readFile("exception.txt");
			// 呼び出し元も例外処理を記述しないとコンパイルエラーになる
		} catch (FileNotFoundException e) {
			//例外処理が実行される
			System.out.println("FileNotFoundException例外が発生");
		}
		//catch文で例外処理が実行されるので、処理が実行される
		System.out.println("プログラム終了");
	}
	//修飾子 戻り値の型 メソッド名(引数) throws 例外クラスの型
		//検査例外のFileNotFoundException例外をスロー
	public static void readFile(String fileName) throws FileNotFoundException{
		System.out.println("ファイルの読み込み開始");
		//ファイルが存在しないため、例外が発生;
		FileReader fr = new FileReader(fileName);
		System.out.println(fileName + "の読み込み完了");
	}


}
