package practice13.common;
/*
 * ★ common.Personクラスを継承して、common.Employeeクラスを作成してください
 *
 * フィールド
 * 		departmentNm（部署名）		:	String
 * 		departmentCnt（部署人数）	:	int
 * メソッド
 * 		各フィールドのアクセサ
 */

public class Employee extends Person{
	String departmentNm;
	int departmentCnt;

	  // getter
    public String getDepartmentNm() {
        return this.departmentNm;
    }

    // setter
    public void setDepartmentNm(String departmentNm) {
        this.departmentNm = departmentNm;
    }

    // getter
    public int getDepartmentCnt() {
        return this.departmentCnt;
    }

    // setter
    public void setDepartmentCnt(int departmentCnt) {
        this.departmentCnt = departmentCnt;
    }


}
