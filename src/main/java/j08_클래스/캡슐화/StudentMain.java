package j08_클래스.캡슐화;

public class StudentMain {
    public static void main(String[] args) {
        Student s1 = new Student("고동현", "남");

        s1.printInfo();

        s1.setName("고동현");
        s1.printInfo();

        s1.gender = "여";
        s1.printInfo();
        System.out.println(s1.gender);
        System.out.println(s1.getName());

    }
}
