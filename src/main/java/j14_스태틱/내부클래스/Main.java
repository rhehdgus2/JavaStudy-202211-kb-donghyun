package j14_스태틱.내부클래스;

public class Main {
    public static void main(String[] args) {
        A.B b = new A().new B("고동현");
        System.out.println(b.getName());
    }
}
