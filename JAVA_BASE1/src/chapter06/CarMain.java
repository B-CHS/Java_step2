package chapter06;

import javax.swing.JOptionPane;

public class CarMain {

	public static void main(String[] args) {

		Car car = new Car();

		
		System.out.println("제작회사 : "+car.company+"\n모델명 : "+car.model+"\n색깔 : "+car.color+"\n최고속도 : "+car.maxSpeed+"\n현재속도 : "+car.speed);
		System.out.println("------------------------------");
		car.speed=Integer.parseInt(JOptionPane.showInputDialog("현재속도"));
		System.out.println("변경된 현재속도 : "+car.speed);

	}

}
