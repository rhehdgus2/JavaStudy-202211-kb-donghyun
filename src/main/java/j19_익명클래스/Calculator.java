package j19_익명클래스;

@FunctionalInterface	// 추상 메소드가 2개가 있으면 알려줌
public interface Calculator {
	
	public int calc(int a, int b);
//	public int calc2(int a, int b);
	
	public default int a() {	// default는 이미 정의된 메소드라 가능
		return 10;
	}
}
