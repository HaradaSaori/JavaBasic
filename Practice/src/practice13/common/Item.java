package practice13.common;
/*
 * ★ common.Itemクラスを作成してください
 *
 * フィールド
 * 		name	:	String
 * 		additionalDamage	:	int
 * メソッド
 * 		各フィールドのアクセサ
 * コンストラクタ
 * 		name, additionalDamageに初期値を設定するコンストラクタ
 * 		上記2つを設定するための引数を持つ
 */

public class Item {

	String name;
	int additionalDamage;

	 // getter
    public String getName() {
        return this.name;
    }

    // setter
    public void setName(String name) {
        this.name = name;
    }

    // getter
    public int getAdditionalDamage() {
        return this.additionalDamage;
    }

    // setter
    public void setAdditionalDamage(int additionalDamage) {
        this.additionalDamage = additionalDamage;
    }

    public Item(String name, int additionalDamage) {
		this.name = name;
		this.additionalDamage = additionalDamage;
    }


}
