package practice10;
/*
 * PTra10_06.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */

public class PTra10_06 {

	/*
	 * PTra10_05で作成したCarクラスを使用します
	 */

	public static void main(String[] args) {

		/*
		 * carインスタンスを3件作成し、それぞれの色、ガソリンを入力して決定してください
		 * 各carインスタンスのrunメソッドを実行して、それぞれ「目的地にまでn時間かかりました。残りのガソリンは、xリットルです」を出力してください。
		 */
		final int distance = 300;
		Car[] cars = new Car[3];


		Car car1 = new Car();
		car1.color = "blue";
		car1.gasoline = 50;

		Car car2 = new Car();
		car2.color = "yellow";
		car2.gasoline = 70;

		Car car3 = new Car();
		car3.color = "white";
		car3.gasoline = 100;

		cars[0] = car1;
		cars[1] = car2;
		cars[2] = car3;


		for (int i = 0; i < cars.length; i++) {
			int sum = 0;
			int count = 0;
			while (true) {
				int run = cars[i].run();
				count++;

				if(run == -1) {
					System.out.println(cars[i].color + ":目的地に到達できませんでした。");
					break;
					}

				sum += run;

				if(sum > distance) {
					System.out.println(cars[i].color + ":目的地にまで" + count + "時間かかりました。残りのガソリンは" + cars[i].gasoline + "リットルです。");
					break;

				}
			}
		}

	}
}
