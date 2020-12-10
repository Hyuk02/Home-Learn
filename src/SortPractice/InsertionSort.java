package SortPractice;

public class InsertionSort {
    //삽입 정렬
    public static void main(String[] args) {
        int i,j,temp;
        int array[] = {10,1,5,8,7,6,4,3,2,9};

        //Insertion Sort
        for(i = 0; i < array.length-1; i++) { // i(0)부터 array 배열-1(9)까지 반복
            j = i; // j 는 i의 값과 같다.
            while (j >= 0 && array[j] > array[j + 1]){ //
                temp = array[j];
                array[j] = array[j + 1];
                array[j + 1] = temp;
                j--; // 아직 이해못함
            }
        }
        for(i = 0; i < array.length; i++) {
            System.out.printf("%d ",array[i]);//정렬된 배열 나열
        }
    }
}
