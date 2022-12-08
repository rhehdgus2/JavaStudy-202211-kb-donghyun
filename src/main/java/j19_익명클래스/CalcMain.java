package j19_익명클래스;

public class CalcMain {
	
	public static void main(String[] args) {
		
		Calculator c = new Calculator() {	// c에는 주소값이 들어감, 생성
			@Override						// 정의
			public int calc(int a, int b) {
				return a + b;
			}
		};
		// 오버라이드하면 매개변수 바꿔도 상관X, 메소드명, 자료명은 바뀌면 안댐
		// 위아래 같음
		// 람다는 대상이있어야함(Calculator)
		// ★람다는 인터페이스안에 추상메소드가 딱 1개만 존재해야함★
		// 람다는 항상 인터페이스
		Calculator c1 = (int x, int y) -> {		//정의와 생성
			return x + y;	// 중간에 다른 실행문이 없으면 return과 int, {} 생략 가능
		};
		
		CalculatorSub cs = x -> x * x;
		
		System.out.println(cs.calc(10));
		System.out.println(cs.a());
		
		int r1 = c1.calc(10, 20);
		System.out.println(r1);
		
		Calculator c2 = new Addition();
		
		int r2 = c2.calc(20, 30);
		System.out.println(r2);
	}

}
