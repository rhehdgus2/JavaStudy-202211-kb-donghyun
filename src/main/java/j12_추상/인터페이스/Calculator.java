package j12_추상.인터페이스;

/*
 - 인터페이스 특징 -
 1. 모든 메소드는 기본적으로 추상 메소드이다.
 2. 변수는 선언할 수 없다. (생성자도 선언 불가능)
 3. 상수는 선언할 수 있다. (기본적으로 모든 변수선언은 상수로 선언된다.)
 4. 일반 메소드를 선언하고 싶으면 abstract 대신에 default 키워드를 사용한다.
 5. private X, public 만 사용 가능
 6. 상수를 선언할 때 final이 필요한데 인터페이스는 없어도된다.
 */

public interface Calculator {       // 추상메소드를 담기위한 용도

    public int ERROR_CODE = -999999;

    public int calc(int[] values);

}
