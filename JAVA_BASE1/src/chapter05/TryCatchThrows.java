package chapter05;

public class TryCatchThrows {
	
	public static void fun() throws Exception{
		
		try {
			System.out.println("fun()메소드");
			throw new Exception();
		} catch (RuntimeException e) { //에러를 잡지 못해도 잡아도 무조건 수행
			// TODO: handle exception
		}
		
	}
	

	public static void main(String[] args) {
		//static이므로 바로 호출이 가능해야하지만 throws Exception 메소드 이므로 try로 호출
		//fun();
		
		try {
			fun();
		} catch (Exception e) {
			System.out.println("main()의 catch문 문장");
		}

	}

}
