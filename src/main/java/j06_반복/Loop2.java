package j06_반복;

public class Loop2 {
    public static void main(String[] args) {
        /*
            [2단]
            2 X 1 = 2
            2 X 2 = 4
            2 X 3 = 6
            ...
            2 X 9 = 18

         */
        for(int i = 0; i < 8; i++) {
            int dan = i + 2;
            System.out.println("[" + dan + "단]");
            for (int j = 0; j < 9; j++) {
                int num = j + 1;
                System.out.println(dan + "X" + num + "=" + (dan * num));
            }
        }
    }
}
