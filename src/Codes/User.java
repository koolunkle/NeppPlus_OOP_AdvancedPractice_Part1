package Codes;

public class User {

	String name;
	int birthYear;
	int point;

	int getKoreanAge() {

		int age = 2021 - birthYear + 1;

		return age;

	}

	void printUserInfo() {
		System.out.println("===== 사용자 정보 =====");
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + getKoreanAge());
		System.out.println("보유 포인트 : " + point + "P");
		System.out.println("=====================");

	}

}