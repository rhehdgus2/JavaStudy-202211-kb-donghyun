package j08_클래스.캡슐화;

public class StudentMain2 {
    public static void main(String[] args) {
        Student2 s1 = new Student2();

        s1.setName("고동현");

        String nameS1 = s1.getName();
        System.out.println(nameS1);
    }
}
