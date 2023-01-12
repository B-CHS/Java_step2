package chapter06;

public class Bus {

	// 맴버
	int busnumber;
	int passengerCount;
	int money;

	// 디폴트 생성자 생략

	public Bus(int busnumber) {
		this.busnumber = busnumber;

	}

	public void take(int money) {// 승객이 낸 돈
		this.money += money; // 버스의 수익이 증가
		passengerCount++;// 승객의 수 증가
	}

	public void showInfo() {// 버스의 정보를 출력
		System.out.println("버스 " + busnumber + "번의 승객은 " + passengerCount + "명이고 " + money + "원 입니다.");

	}
}
