package practice18;

/*
 * ★ BestElevenCandidate.csvの情報を保持するためのクラス、entity.Playerクラスを作成してください
 *
 * フィールド
 * 		position	：	String
 * 		name		：	String
 * 		country		：	String
 * 		team		：	String
 * メソッド
 * 		各アクセサ
 *
 * 		toString()	：	Objectクラスのオーバーライド
 * 		各フィールドの値を、カンマ区切りの文字列で取得する
 */


public class Player {
	String position;
	String name;
	String country;
	String team;

	 // getter
    public String getPosition() {
        return this.position;
    }

    // setter
    public void setPosition(String position) {
        this.position = position;
    }

    // getter
    public String getName() {
        return this.name;
    }

    // setter
    public void setName(String name) {
        this.name = name;
    }

    // getter
    public String getCountry() {
        return this.country;
    }

    // setter
    public void setCountry(String country) {
        this.country = country;
    }

    // getter
    public String getTeam() {
        return this.team;
    }

    // setter
    public void setTeam(String team) {
        this.team = team;
    }

    public String toString(){
        String str = position + "," + name + "," + country + "," + team;
       return str;
    }

}
