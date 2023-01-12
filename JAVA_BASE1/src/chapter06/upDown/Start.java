package chapter06.upDown;

import java.util.Random;

public class Start {

	private int num = new Random().nextInt(50) + 1;
	private int count = 0;
	private String result = "FAIL!";

	public String check(int mynumber) {
		while (true) {
			if (num < mynumber) {
				System.out.println("DOWN!");
				count++;
			} else if (num > mynumber) {
				System.out.println("UP!");
				count++;
			} else {
				result = "SUCCESS!";
				System.out.println(count+"회 만에 정답!");
			}return result;
		}
	}
}
