package j04_입력;

import java.util.Scanner;

public class Input1 {
    public static void main(String[] args) {
        String name = null;
        int age = 0;
        String phone = null;
        String address = null;

        Scanner scanner = new Scanner(System.in);

        name = scanner.next();
        age = scanner.nextInt();
        scanner.nextLine();
        phone = scanner.nextLine();
        address = scanner.nextLine();

        System.out.println("이름: " + name);
        System.out.println("나이: " + age);
        System.out.println("연락처: " + phone);
        System.out.println("주소: " + address);
    }
}
