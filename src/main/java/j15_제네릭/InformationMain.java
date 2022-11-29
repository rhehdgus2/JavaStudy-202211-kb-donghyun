package j15_제네릭;

public class InformationMain {

    public static void main(String[] args) {

        Student student = Student.builder()
                .studentCode(20220001)
                .name("고동현")
                .build();

        Teacher teacher = Teacher.builder()
                .teacherCode(200)
                .name("고동현")
                .build();

        Information<Student> studentInformation
                = new Information<Student>(student);

        Information<Teacher> teacherInformation
                = new Information<Teacher>(teacher);

        Information2 i1 = new Information2(student);    // Object가 업캐스팅해서 들어감
        Information2 i2 = new Information2(teacher);    // Object가 업캐스팅해서 들어감

        studentInformation.printInfo();
        teacherInformation.printInfo();

        System.out.println("학생이름 : " + studentInformation.getTarget().getName());
        System.out.println("학생이름2 : " + ((Student)i1.getTarget()).getName());
    }
}
