package j20_함수형인터페이스;

public class Main1 {
	
	public static void main(String[] args) {
		int a = 10;
		
		Runnable application1 = () -> {		//메소드안에서 메소드 정의, 괄호는 매개변수 딱 하나일때 생략 가능
			System.out.println("프로그램을 시작합니다.");
			System.out.println("a: " + a);
		};
		
		
		application1.run();
		
		Thread t1 = new Thread(() -> {
			for(int i = 0; i < 100; i++) {
				try {
					System.out.println("채팅기능");
					System.out.println(i + " : " + (i + 1));
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});	// 웹 개발시에는 thread 필요없음
		Thread t2 = new Thread(() -> {
			for(int i = 0; i < 100; i++) {
				try {
					System.out.println("알림기능");
					System.out.println(i + " : " + (i + 1));
					Thread.sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});
		
		t1.start();
		t2.start();		// 비동기처리 : 순서없이 먼저 처리되는대로 출력
	}

}
