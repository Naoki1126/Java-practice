
public class Break01 {
	public static void main(String[] args) {
		for (int count = 0; count <5; count++) {
			// countが2になった場合にブロック処理を終了する。
			if(count == 2) {
				break;
			}
			System.out.println("Break1 = " + count);
		}
	}

}
