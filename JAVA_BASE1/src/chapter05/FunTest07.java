package chapter05;

import java.util.Scanner;

public class FunTest07 {

	/*public static String eduStep(int edu) {

		String step;

		if (edu == 1) {
			step = "1단계";
		} else if (edu == 2) {
			step = "2단계";
		} else if (edu == 3) {
			step = "3단계";
		} else {
			step = "잘못 입력했습니다.";
		}
		return step;

	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("스터디 단계를 입력하세요 : ");
		int num = scan.nextInt();

		String b = eduStep(num);
		System.out.println(b);public static String eduStep(int edu)*/
	
		public static void eduStep(int edu) {
			String step;

			if (edu == 1) {
				step = "1단계";
			} else if (edu == 2) {
				step = "2단계";
			} else if (edu == 3) {
				step = "3단계";
			} else {
				step = "잘못 입력했습니다.";
			}System.out.println(step);

		}

		public static void main(String[] args) {

			Scanner scan = new Scanner(System.in);
			System.out.print("스터디 단계를 입력하세요 : ");
			int num = scan.nextInt();

			
			eduStep(num);
	}

}
