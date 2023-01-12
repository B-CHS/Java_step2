package chapter05;

import javax.swing.JOptionPane;

public class TryCatch {

	public static void main(String[] args) {
		
		int num1, num2;
		
		num1=Integer.parseInt(JOptionPane.showInputDialog("값1"));
		num2=Integer.parseInt(JOptionPane.showInputDialog("값2"));
		
		//int res=num1/num2;
		//System.out.println(res);
		
		try {
			System.out.println(num1/num2);
		} catch (ArithmeticException e) {
			System.out.println("0 안됨");
		}

		System.out.println("error후 컴파일->프로그램 종료");
	}

}
