package j14_스태틱.빌더;

public class UserMain {
    public static void main(String[] args) {
        User user = User.builder()
                .name("고동현")
                .email("kdgkdg0217@naver.com")
                .build();

        System.out.println(user);
    }
}
