package chapter06.자판기;

public class Vending {

	// 맴버변수
	private Can can[] = new Can[5];
	private int money;

	// can[0] = new Can("콜라", 1900); private 변수방이므로 반드시 메소드 안에서 초기화 한다.

	// 메소드
	public void init() {
		can[0] = new Can("콜라", 1900);
		can[1] = new Can("사이다", 1700);
		can[2] = new Can("환타", 1500);
		can[3] = new Can("밀키스", 1500);
		can[4] = new Can("커피", 2000);
	}

	// 사용 가능한 음료만 보여주기
	public void showCans(int m) {
		money = m;
		int count = 0;
		for (int i = 0; i < can.length; i++) {
			// 돈과 가격과 비교 판단
			if (can[i].getPrice() <= m) {
				count++;
				System.out.println(can[i].getCanName() + " - " + can[i].getPrice() + "원");
			} // if

		} // for
		if (count == 0) {
			System.out.println("돈을 더 넣으세요.");

		}
	}// 메소드

	public void outCan(String name) {
		for (int i = 0; i < can.length; i++) {
			if (can[i].getCanName().equals(name)) {
				System.out.println(can[i].getCanName() + "를 선택하셨습니다.");
				System.out.println("잔 액 : " + (money - can[i].getPrice()));
			}
		} // for

	}

}
