package j15_제네릭;

import lombok.Getter;

public class Information<T> {       // 제네릭하면 다운캐스팅 필요 X
    @Getter
    private T target;

    public Information(T target) {
        this.target = target;
    }

    public void printInfo() {
        System.out.println(target);
    }
}
