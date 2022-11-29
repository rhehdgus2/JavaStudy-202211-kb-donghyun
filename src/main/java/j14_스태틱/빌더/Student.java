package j14_스태틱.빌더;

import lombok.AllArgsConstructor;
import lombok.ToString;

@AllArgsConstructor  // 전체 생성자(모든 매개변수가 있음)
@ToString
public class Student {
    private int studentCode;
    private String name;
    private String address;

    public static StudentBuilder builder() {
        return new StudentBuilder();
    }

    public static class StudentBuilder {
        private  int studentCode;
        private String name;
        private String address;

        public StudentBuilder studentCode(int studentCode) {
            this.studentCode = studentCode;
            return this;
        }

        public StudentBuilder name(String name) {
            this.name = name;
            return this;
        }

        public StudentBuilder address(String address) {
            this.address = address;
            return this;
        }

        public Student build() {
            return new Student(studentCode, name, address);
        }

    }
}
