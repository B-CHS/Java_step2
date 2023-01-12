package chapter06;

public class TakeTrans {
	public static void main(String[] args) {
		// 학생 2명 생성
		StdInfo studentJames = new StdInfo("James", 12000);
		StdInfo studentTom = new StdInfo("Tom", 12000);

		// 버스 타기
		Sub sub1 = new Sub("1호선");
		Sub sub4 = new Sub("4호선");
		Bus bus201 = new Bus(201);
		Bus bus15 = new Bus(15);
		studentJames.takeBus(bus201);
		studentJames.takeBus(bus15);
		studentTom.takesub(sub4);
		studentJames.takesub(sub1);
		studentTom.takesub(sub1);
		
		
		//정보 확인
		studentJames.ShowInfo();
		studentTom.ShowInfo();
		bus15.showInfo();
		bus201.showInfo();
		sub1.showInfo();
		sub4.showInfo();

	}

	//
}
