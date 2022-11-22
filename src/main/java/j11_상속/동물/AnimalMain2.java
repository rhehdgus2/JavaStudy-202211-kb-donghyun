package j11_상속.동물;

public class AnimalMain2 {                             // 여러개의 클라스는 상속 불가
    public static void main(String[] args) {
    Animal[] animals = new Animal[5];
    animals[0] = new Human();
    animals[1] = new Tiger();
    animals[2] = new Human();
    animals[3] = new Tiger();
    animals[4] = new Human();

        System.out.println("[업캐스팅]");
        for(int i = 0; i < animals.length; i++) {
            animals[i].move();
        }
        System.out.println();

        System.out.println("[다운캐스팅]");
        for(int i = 0; i < animals.length; i++) {
            if(animals[i] instanceof Human) {           // instanceof 업캐스팅 전의 자료형이 얘가 휴먼이였니?
                ((Human) animals[i]).readBook();        // 다운캐스팅할때 괄호 꼭 필요
            }else if(animals[i] instanceof Tiger) {
                ((Tiger) animals[i]).hunting();

            }
        }


    }
}