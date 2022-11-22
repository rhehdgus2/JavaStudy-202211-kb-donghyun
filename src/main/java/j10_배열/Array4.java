package j10_배열;

import java.util.Random;

public class Array4 {
    //최솟값
    public static int foundMinNumber(int[] numbers) {
        int min = numbers[0];
        for(int i = 0; i < numbers.length; i++) {
            if(min > numbers[i]) {
                min = numbers[i];
            }
        }

        return min;
    }
    // 최댓값
    public static int foundMaxNumber(int[] numbers) {
        int max = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (max < numbers[i]) {
                max = numbers[i];
            }
        }

        return max;
    }
    public static void main(String[] args) {
        Random random = new Random();
        int[] randomArray = new int[10];
        int total = 0;

        for (int i = 0; i < randomArray.length; i++) {
            while (true) {                                          // 무한 루프(break 걸릴때 까지)
                int randomNumber = random.nextInt(10) + 1;
                boolean found = true;
                for (int j = 0; j < randomArray.length; j++) {      //found를 false만 안나오면 계속 true
                    if (randomArray[j] == randomNumber) {
                        found = false;
                        break;
                    }
                }
                if (found) {                                   // 무한루프 여기서 걸림
                    randomArray[i] = randomNumber;
                    break;
                }

            }
        }
        for (int i = 0; i < randomArray.length; i++) {
            total += randomArray[i];
            System.out.print(randomArray[i]);
            if(i != randomArray.length - 1) {
                System.out.print(",");
            }
        }
        System.out.println();

        System.out.println("총합: " + total);
        System.out.println("최소값: " + foundMinNumber(randomArray));
        System.out.println("최댓값: " + foundMaxNumber(randomArray));
    }
}