package chapter05;

import java.util.Scanner;

public class Method {

	// 맴버면수(=필드)

	// 생성자 생략

	// 메소드

	void makeBread() {
		System.out.println("빵을 만듭니다.");
	}// method1

	void makeBread(int count) {
		for (int i = 0; i < count; i++) {
			System.out.println((i + 1) + "번째 빵을 만듭니다.");
		}
		System.out.println("요청하신 " + count + "개의 빵이 모두 완료되었습니다.");
	}// method2

	void makeBread(int count, String menu) {
		for (int i = 0; i < count; i++) {
			System.out.println((i + 1) + "번째 " + menu + "빵을 만듭니다.");
		}
		System.out.println("요청하신 " + count + "개의 " + menu + "빵이 모두 완료되었습니다.");
	}// method3

	void order() {
		Method a = new Method();
		while (true) {
			Scanner scan = new Scanner(System.in);
			System.out.println("1. 빵의 갯수 | 2. 빵의 갯수와 종류 | 3. 종료");
			System.out.print("선택> ");
			int sel = scan.nextInt();

			if (sel == 1) {
				System.out.print("주문할 빵의 갯수>");
				int num = scan.nextInt();
				a.makeBread(num);
				
			} else if (sel == 2) {
				System.out.print("주문할 빵의 갯수> ");
				int num = scan.nextInt();			
				System.out.print("주문할 빵의 종류> ");
				String name = scan.next();				
				a.makeBread(num, name);
				
			} else if (sel == 3) {
				System.out.println("프로그램 종료");
				break;
				
			} else
				System.out.println("잘못 선택 하셨습니다.");
			System.out.println();
		}

	}// method4
}
