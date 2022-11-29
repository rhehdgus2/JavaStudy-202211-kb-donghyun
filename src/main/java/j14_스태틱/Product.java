package j14_스태틱;

/*
    공유영역
 */

import lombok.Data;

@Data
public class Product {
    private static int autoIncrement = 20220000;

    private int serialNumber;
    private String name;

    public Product(String name) {
        this.serialNumber = ++autoIncrement;
        this.name = name;
    }

    public static void print() {
        System.out.println(autoIncrement);
        Product product = new Product("아이폰");

        System.out.println(product.add(10, 20));
    }

    public int add(int a, int b) {
        return a + b;
    }

}