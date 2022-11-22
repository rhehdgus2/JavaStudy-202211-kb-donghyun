package j08_클래스;

public class StudentMain {
    public static void main(String[] args) {
        Student student = new Student();
        Student student2 = new Student("부경대학교", "홍길동" , 2, false);

        student.school = "동의대학교";
        student.name = "고동현";
        student.studentYear = 4;
        student.gender = true;

        student.showStudentInfo();
        student2.showStudentInfo();
    }
}
