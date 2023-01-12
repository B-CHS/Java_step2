package chapter05;

import javax.swing.JOptionPane;

public class FunTest02 {

	// 합계 메소드(함수)
	// 접근 지정자 : public(공용 : 제한없음) / protected(패키지 내에서 공용됨) / private(클레스 안에서만 사용)
	// void : return 없음
	//메인을 기준으로 하여 메인선언 전 또는 후에 정의해도됨
	//static이 없으면 다른 클레스에서 사용불가
	public  void sum(int num1, int num2) {
		//int num1 = 3;
		//int num2 = 5;
		int total = num1 + num2;
		System.out.println(total);

	}
	//실행 담당하는 메소드
	public static void main(String[] args) {
		int a, b;
		FunTest02 ob=new FunTest02();
	
		a = Integer.parseInt(JOptionPane.showInputDialog("값1"));
		b = Integer.parseInt(JOptionPane.showInputDialog("값2"));
		ob.sum(a, b);
		//sum(a,b);
		

	}

}















