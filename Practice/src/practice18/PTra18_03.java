/*
 * PTra18_03.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice18;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class PTra18_03 {

	/*
	 * PTra19_02で作成したPlayerクラスを使用します
	 */

	public static void main(String[] args) {

		/*
		 * ①
		 * ★ file/BestElevenCandidate.csvの内容を取得し、１行毎にPlayerインスタンスに情報を格納してください
		 * ★ ArrayListを作成して、Playerインスタンスを格納してください
		 */
		ArrayList<Player> array = new ArrayList<>();
		try (Scanner scanner = new Scanner(new File("file/BestElevenCandidate.csv"))) {
			while (scanner.hasNext()) {
				String line = scanner.nextLine();

				String[] i = line.split(",");

				Player player = new Player();

				player.setPosition(i[0]);
				player.setName(i[1]);
				player.setCountry(i[2]);
				player.setTeam(i[3]);

				array.add(player);

			}
		} catch (FileNotFoundException e) {
			System.out.println("ファイルが見つかりません");

		}
		for(int i = array.size() - 1;i > -1; i--){
			if(array.get(i).getTeam().equals("レアル・マドリード")) {
				 array.remove(i);
			}else if(array.get(i).getTeam().equals("バルセロナ")){
				 array.remove(i);
			}

		}

		// ★ ①のArrayListの中から"レアル・マドリード", "バルセロナ"の選手を除外してください
		// ★ 削除後のArrayListの中身を全件出力してください
		for (Player date : array) {
			System.out.println(date.toString());
		}

	}
}
