package chapter06.upDown;

import java.util.Scanner;

public class startMain {

	public static void main(String[] args) {

		int a;
		String result;
		Start start = new Start();
		
		while (true) {
			System.out.print("숫자를 입력 하세요> ");
			Scanner scan = new Scanner(System.in);
			a = scan.nextInt();
			result = start.check(a);
			

			if (result.equals("SUCCESS!"))
				break;

		}
	}

}
