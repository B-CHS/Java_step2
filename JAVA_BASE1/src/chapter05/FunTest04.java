package chapter05;

import java.util.Scanner;

public class FunTest04 {

	public String channel;
	public int channelInt;
	public int volume;

	public void ChannelUP(int volume) {
		System.out.println("소리를 " + volume + "만큼 올립니다");

	}

	public void ChannelDown(int volume) {
		System.out.println("소리를 " + volume + "만큼 내립니다");
	}

	// 오버로딩 : 메소드 이름은 같으나 매개변수만 다름
	public void ChannelChange(String channel) {
		System.out.println("체널을 " + channel + "로 바꿉니다.");
	}

	public void ChannelChange(int channelInt) {
		System.out.println("체널을 " + channelInt + "로 바꿉니다.");
	}

	public static void main(String[] args) {
		FunTest04 voCh = new FunTest04();
		voCh.ChannelUP(5);
		voCh.ChannelDown(2);
		voCh.ChannelChange("6");
		voCh.ChannelChange(7);
		
		Scanner scan = new Scanner(System.in);
	}

}
