
import java.util.Arrays;


public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
        /*int[] array = {3, 1, 5, 99, 3, 12};
        System.out.println(smallest(array));
        System.out.println(indexOfSmallest(array));
        System.out.println(indexOfSmallestFrom(array, 2));*/
        int[] numbers = {8, 3, 7, 9, 1, 2, 4};
        MainProgram.sort(numbers);        

    }
    
    public static int smallest(int[] array) {
        int smallest = array[0];
        for(int i = 0; i < array.length; i++) {
            if(smallest > array[i]) {
                smallest = array[i];
            }
        }
        return smallest;
    }
    
    public static int indexOfSmallest(int[] array) {
        int indexOfSmallest = 0;
        for(int i = 0; i < array.length; i++) {
            if(smallest(array) == array[i]) {
                indexOfSmallest = i;
            }
        }
        return indexOfSmallest;
    }
    
    public static int indexOfSmallestFrom(int[] array, int startIndex) {
        int indexOfSmallestFrom = startIndex;
        int smallest = array[startIndex];
        for(int i = startIndex; i < array.length; i++) {
            if(smallest > array[i]) {
                smallest = array[i];
                indexOfSmallestFrom = i;
            }
        }
        return indexOfSmallestFrom;
    }
    
    public static void swap(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
    
    public static void sort(int[] array) {
        for(int i = 0; i < array.length; i++) {
            System.out.println(Arrays.toString(array));
            swap(array, i, indexOfSmallestFrom(array, i));
        }
    }
}
