package chapter06;

import javax.swing.JOptionPane;

public class Sungjuk {

	// 필드 또는 맴버변수
	private String std_num;
	private String std_name;
	private int java, oracle, spring;

	// 디폴드 생성자(생략가능)

	// 메서드

	public void Sum() {
		int total = java + oracle + spring;// 지역변수

		System.out.println("총합 : " + total);
	}

	public void Agv() {
		int Agv = (java + oracle + spring) / 3;

		System.out.println("평균 : " + Agv);
	}

	public static void main(String[] args) {

		Sungjuk rec = new Sungjuk();

		rec.std_num = JOptionPane.showInputDialog("학번");
		rec.std_name = JOptionPane.showInputDialog("이름");

		rec.java = Integer.parseInt(JOptionPane.showInputDialog("자바 점수"));
		rec.oracle = Integer.parseInt(JOptionPane.showInputDialog("오라클 점수"));
		rec.spring = Integer.parseInt(JOptionPane.showInputDialog("스프링 점수"));

		System.out.println("학번 - " + rec.std_num + " | 성명 - " + rec.std_name + "님의 성적입니다.");
		System.out.println("------------------------------------------");
		rec.Sum();
		rec.Agv();

	}
}
