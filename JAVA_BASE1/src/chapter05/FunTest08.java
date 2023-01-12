package chapter05;

public class FunTest08 {
	// 재귀함수

	// 디폴트 생성자

	// 메소드 : 제귀함수
	public static int Recur(int a) {
		int result;
		// return (1);//정상종료는 아니었지만 오류없이 끝났다.
		// return 0;//정상 종료

		if (a == 1) {
			return (1);
		} else
			result = a*Recur(a-1);

		
		return result;
	}

	public static void main(String[] args) {
		System.out.println(Recur(5));

	}

}
