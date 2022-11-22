package j10_배열;

import java.util.Random;

public class Array3 {
    public static void main(String[] args) {
       Random random = new Random();
       int[] randomArray = new int[10];
       int total = 0;

       // 배열에 랜덤한 값 대입
       for (int i = 0; i < randomArray.length; i++) {
           randomArray[i] = random.nextInt(10) + 1;
       }

       /*
            1. 배열에서 값을 하나씩 꺼내어 total에 더한다.
            2. 배열의 값을 하나씩 꺼내어 출력한다. (단, 마지막에는 쉼표를 찍지 않는다.)
        */

       for (int i = 0; i < randomArray.length; i++) {
           total += randomArray[i];
           System.out.print(randomArray[i]);
           if(i != randomArray.length - 1) {
               System.out.print(",");
           }
       }
        System.out.println();

        System.out.println("총합: " + total);
    }
}

/*
    int 배열로 randomArray 배열 생성(10)
    10, 2, 4, 5, 7, 범위는 1 ~ 10까지
    마지막 총합 구하기
 */
