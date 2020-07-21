
public class Switch01 {
	public static void main(String[] args) {
		int val = 2;
		switch (val){
		case 3:
			System.out.println("よく出来ました");
			break;
		case 2:
			System.out.println("普通でした");
			break;
		case 1:
			System.out.println("頑張ろう");
			break;
		default:
			System.out.println("何も言えません");
		}

		//break 条件にあった時にその後の処理をさせないために必要、書かなければ無限ループする
		//default caseに一致しない時の処理

	}
}
