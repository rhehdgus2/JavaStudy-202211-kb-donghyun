package j10_배열;

public class Array5 {
    public static int cmpMin(int[] num1, int[] num2) {
        int min = 0;
        for(int i = 0; i < num1.length; i++){
            if(num1[i] == num2[i]) {

                break;
            }
        }


        return min;
    }
    public static int notcmpMax(int[] array1, int[] array2) {
        int max = 0;

        return max;
    }
    public static void main(String[] args) {
        int[] num1 = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] num2 = new int[] {6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
    }
}

/*
2개의 배열에서 중복된 값 중 최소값
2개의 배열에서 중복되지 않은 값 중 최댓값

{1 2 3 4} { 2 4 5 6} 가장 작은 값 : 2, 큰 값 : 4
 */
