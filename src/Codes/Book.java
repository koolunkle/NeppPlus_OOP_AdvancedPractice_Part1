package Codes;

public class Book {

	String title;
	int limitAge;
	int rentFee;

	User rentUser;

	void printBookInfo() {
		System.out.println("===== 도서 정보 =====");
		System.out.println("제목 : " + title);

		if (limitAge == 0) {
			System.out.println("연령 제한 : " + "전체 이용가");
		} else {
			System.out.println("연령 제한 : " + limitAge + "세 이용가");

		}
		System.out.println("대여료 : " + rentFee + "P");

		if (rentUser != null) {

			System.out.println("빌려간 사람 : " + rentUser.name);
		} else {

			System.out.println("빌려간 사람 : 없음 (대여 가능)");

		}

		System.out.println("===================");

	}

}