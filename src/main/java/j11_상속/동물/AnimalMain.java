package j11_상속.동물;

public class AnimalMain {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Human human = new Human();
        Tiger tiger = new Tiger();

        int a = (int) 3.14; // 다운캐스팅 (명시적 형변환 필요)
        double d = (double) 3; // 업캐스팅

        Animal hAnimal = (Animal) human; // 업캐스팅
        Animal tAnimal = tiger;
        Animal[] animals = new Animal[3];

        animals[0] = new Human();
        animals[1] = new Tiger();
        animals[2] = new Animal();

        for(int i = 0; i < animals.length; i++){
            animals[i].move();
        }

        for(int i = 0; i < animals.length; i++) {
            if(animals[i] instanceof Human) {
                Human h = (Human) animals[i];
                h.readBook();
            } else if (animals[i] instanceof Tiger) {
                Tiger t = (Tiger) animals[i];
                t.hunting();
            } else {
                System.out.println("다운캐스팅 불가");
            }
        }
    }
}
