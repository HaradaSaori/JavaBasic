/*
 * PTra18_04.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice18;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class PTra18_04 {

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

				Collections.shuffle(array);

			}
		} catch (FileNotFoundException e) {
			System.out.println("ファイルが見つかりません");

		}

		// ★ ①のArrayListの中からGK1名、DF4名、MF4名, FW2名をランダムで出力してください
		int count = 0;

		for (int i = array.size() - 1; i > -1; i--) {
			if (array.get(i).getPosition().equals("GK")) {
				System.out.println(array.get(i));
				break;
			}
		}

		for (int j = array.size() - 1; j > -1; j--) {
			if (array.get(j).getPosition().equals("DF")) {
				System.out.println(array.get(j));
				count++;
				if (count >= 4) {
					break;
				}
			}
		}
		int count2 = 0;
		for (int k = array.size() - 1; k > -1; k--) {
			if (array.get(k).getPosition().equals("MF")) {
				System.out.println(array.get(k));
				count2++;
				if (count2 >= 4) {
					break;
				}
			}
		}

			int count3 = 0;
		for (int l = array.size() - 1; l > -1; l--) {
			if (array.get(l).getPosition().equals("FW")) {
				System.out.println(array.get(l));
				count3++;
				if (count3 >= 2) {
					break;
				}
			}
		}

	}

}
