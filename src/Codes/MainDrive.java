package Codes;

public class MainDrive {

	public static void main(String[] args) {

//		실제 시나리오 작성 공간.

		Book book1 = new Book();
		book1.title = "뽀로로";
		book1.rentFee = 1000;
		book1.limitAge = 0;

		Book book2 = new Book();
		book2.title = "원피스";
		book2.rentFee = 1500;
		book2.limitAge = 15;

		Book book3 = new Book();
		book3.title = "타짜";
		book3.rentFee = 2000;
		book3.limitAge = 19;

		User u1 = new User();
		u1.name = "김준기";
		u1.birthYear = 1996;
		u1.point = 10000;

		User u2 = new User();
		u2.name = "이고딩";
		u2.birthYear = 2004;
		u2.point = 1500;

		User u3 = new User();
		u3.name = "박초딩";
		u3.birthYear = 2012;
		u3.point = 5000;

		u1.printUserInfo();
		book3.printBookInfo();

//		김준기 -> 타짜 대여 시도. 가능?

		boolean u1book3 = u1.rentBook(book3);
		System.out.println(u1book3);

//		u1, book3 정보 확인
		u1.printUserInfo();
		book3.printBookInfo();

//		u2, u3, book1, boo2 등 다양한 경우 시험 => 동작 확인. (디버그 모드)

		boolean u2book1 = u2.rentBook(book1);
		System.out.println(u2book1);

		u2.printUserInfo();
		book1.printBookInfo();

		boolean u3book2 = u3.rentBook(book2);
		System.out.println(u3book2);

		u3.printUserInfo();
		book2.printBookInfo();

		boolean u2book2 = u2.rentBook(book2);
		System.out.println(u2book2);

		u2.printUserInfo();
		book2.printBookInfo();

	}

}