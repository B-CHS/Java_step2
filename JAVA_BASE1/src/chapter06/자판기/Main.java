package chapter06.자판기;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		String select = "";
		int money = 0;
		Vending v = new Vending();
		v.init();
		Scanner scan = new Scanner(System.in);
		System.out.print("돈을 넣으세요> ");
		money = scan.nextInt();
		v.showCans(money);

		System.out.print("음료를 선택하세요> ");
		select = scan.next();
		v.outCan(select);
	}
}
