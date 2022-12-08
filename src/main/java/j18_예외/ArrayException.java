package j18_예외;

public class ArrayException {
	public static void main(String[] args) {
		Integer[] numberArray = new Integer[] {1, 2, 3, 4, 5};
		
		try {
			// 예외가 예상되는 부분을 try에 넣는다.
			for(int i = 0; i < 6; i++) {
				System.out.println(numberArray[i]);
			}
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
			e.printStackTrace();	// 문제 발생한 곳을 추적
			System.out.println(e.getMessage());
			System.out.println("예외가 생성됨");	//예외가 있으면 출력, 없으면 생략
		}
		
		
		
		System.out.println("프로그램 정상 종료");
	}

}
