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

//	책 빌려가기 기능 => 대여 성공/실패를 boolean으로 알려주자. 

	boolean rentBook(Book rentBook) {

//		1. 내가 가진 돈이 -> 빌려갈 책의 대여료만큼 없는가? => 대여 실패 처리. 
		if (point < rentBook.rentFee) {
			System.out.println("포인트가 부족하여 대여할 수 없습니다.");
			return false; // 결과 선정 + 함수 강제 종료 기능.
		}

//		2. 나이가 연령제한보다 적은가? => 대여 실패 처리. 
		if (getKoreanAge() < rentBook.limitAge) {
			System.out.println("나이가 어려서 대여할 수 없습니다.");
			return false;
		}

//		3. 책이 대여 가능한 상태인지? -> 빌려간 사람이 있다면 대여 불가.
		if (rentBook.rentUser != null) {
			System.out.println("이미 빌려간 사람이 있습니다. ");
			return false;

		}

//		1,2,3, 질문 모두 통과. => 대여 처리.

//		내 포인트를 대여료 만큼 차감.
		point -= rentBook.rentFee;

//		책의 대여자를 "나"로 등록.
		rentBook.rentUser = this;

		System.out.println("대여 성공");

//		최종 결과 성공 처리
		return true;

	}

}