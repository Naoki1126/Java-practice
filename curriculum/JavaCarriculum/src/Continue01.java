
public class Continue01 {
	public static void main(String[] args){
		for (int count = 0; count < 5; count++) {
			//continue 下記条件がtrueになった時にのみプロック処理を飛ばす
			if (count == 2) {
				continue;
			}
			System.out.println("Continue01 = " + count);
		}
	}
}
