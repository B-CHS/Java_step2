package chapter05;

public class FunTest06 {

	public String channel;
	public int channelInt;
	public int volume;

	// 생성자 생략

	// viod외의 모든 타입의 메소드

	public void channelUP(int volume) {
		
		//this.volume=volume;
		System.out.println("소리를 높이겠습니다.");
		//return volume + 2;

	}

	public static void main(String[] args) {

		FunTest06 tv = new FunTest06();
		//
		
		//방법1
		//System.out.println("소리를 "+ tv.channelUP(9) +" 만큼 높이겠습니다.");
		
		//방법2
		tv.channelUP(5);
		System.out.println("소리를 "+ " 만큼 높이겠습니다.");
	}

}
