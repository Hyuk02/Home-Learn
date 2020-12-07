package SortPractice;

public class BubbleSort {
    //거품 정렬
    public static void main(String[] args) {
        int i,j,temp;
        int array[] = {1,10,5,8,7,6,4,3,2,9};
        //Bubble Sort
        for(i = 0; i < array.length; i++) { // 0부터 array의 배열만큼 반복
            for(j = 0; j < array.length-1-i; j++) { //0부터 array의 배열-1까지 차감하며 반복 (123456789.. 12345678.. )

                if(array[j] > array[j + 1]) { // 왼쪽에 있는 값이 오른쪽에 있는 값보다 클 경우
                    //자리 교환
                    temp = array[j]; //temp(임시 공간)에 왼쪽 값을 넣는다.
                    array[j] = array[j + 1]; //왼쪽 값이 있던 자리에 오른쪽 값을 넣는다.
                    array[j + 1] = temp; // 오른쪽 값이 있던 자리에 왼쪽 값(temp)을 넣는다.
                }
            }
        }
        for(i = 0; i < array.length; i++) {
            System.out.printf("%d ",array[i]);//정렬된 배열 나열
        }
    }
}
