package j08_클래스;

public class Student {
    String school;
    String name;
    int studentYear;
    boolean gender;

    Student() {}
    Student(String school, String name, int studentYear, boolean gender) {
        this.school = school;
        this.name = name;
        this.studentYear = studentYear;
        this.gender = gender;

     }

    void showStudentInfo() {
        System.out.println("학교명 : " + school);
        System.out.println("이름 : " + name);
        System.out.println("학년 : " + studentYear);
        System.out.println("성별 : " + (gender ? "남" : "여"));

    }
}


/*
    학생 정보
    String school(학교명)
    String name(학생이름)
    int studentYear(학년)
    boolean gender(성별 true=남, false=여)

    showStudent() {
        학교명 :  동의대학교
        이름 : 고동현
        학년 : 4
        성별 : 남
    }
 */