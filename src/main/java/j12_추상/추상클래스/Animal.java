package j12_추상.추상클래스;

/*
    추상 메소드를 하나라도 포함하는 클래스는
    추상 클래스로 정의하여야 한다.
 */

public abstract class Animal {

    private String kind;

    public Animal() {}

    public Animal(String kind) {        // 기본 생성자 정의, 오버로딩
        System.out.println(kind + "이(가) 생성되었습니다.");
    }


// 추상메소드            // 추상 클래스에 추상 메소드는 꼭 포함할 필요는 없음
    public abstract void move();        // 추상메소드는 {} 필요없이 세미클론으로 끝냄

    public void eat() {
        System.out.println("동물이 밥을 먹습니다.");
    }
}
