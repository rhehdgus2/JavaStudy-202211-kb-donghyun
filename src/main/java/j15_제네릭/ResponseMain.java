package j15_제네릭;

public class ResponseMain {

    public static CMRespDto<?> response(String msg, Object data) {         // ? : 와일드카드, 어떤 자료형이 들어올지 모르겠다(string/student/teacher), extends(상속)도 사용가능
        // ex) people - student, teacher 상속관계이면, extends people쓰면 string 사용 불가, super.student하면 student의 부모인 people만 사용 가능
        return new CMRespDto<>(msg, data);
    }

    public static void main(String[] args) {
        Student student = Student.builder()
                .studentCode(20220001)
                .name("고동현")
                .build();

        System.out.println(response("학생데이터 응답", student));
        System.out.println(response("student code error!!", "학번에 오류가 있습니다."));
    }
}
