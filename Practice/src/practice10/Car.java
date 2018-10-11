package practice10;

import java.util.Random;

public class Car {

	/* フィールド
	 * 		serialNo		:	int型
	 * 		color			：	String型
	 * 		gasoline		：	int型
	 * メソッド
	 * 		戻り値(int)、メソッド名(run)、引数(なし)
	 * 			ガソリンを1消費して、ランダムな距離(1～15)進む（戻り値が進んだ距離）
	 * 			ガソリンが負の数になった場合（もう進めない）は-1を返します。
	 */

	int serialNo;
	String color;
	int gasoline;


	int run() {
		this.gasoline -= 1;
		if(this.gasoline < 0) {
			return -1;
		} else {
			return new Random().nextInt(15) + 1;
		}

	}

}
