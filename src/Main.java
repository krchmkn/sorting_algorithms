import com.github.korchemkin.Sorter;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] unsortedArr = { 9, 5, 8, 1, 3, 7, 2, 6, 4, 0 };

        Sorter sorter = new Sorter();
        int[] insertionSortResult = sorter.insertionSort(unsortedArr);
        int[] selectionSortResult = sorter.selectionSort(unsortedArr);
        int[] bubbleSortResult = sorter.bubbleSort(unsortedArr);
        int[] mergeSortResult = sorter.mergeSort(unsortedArr);
        int[] quickSortResult = sorter.quickSort(unsortedArr);

        System.out.println("unsortedArr " + Arrays.toString(unsortedArr));
        System.out.println("insertionSortResult "
            + Arrays.toString(insertionSortResult));

        System.out.println("selectionSortResult "
            + Arrays.toString(selectionSortResult));
        System.out.println("bubbleSortResult "
            + Arrays.toString(bubbleSortResult));

        System.out.println("mergeSortResult "
            + Arrays.toString(mergeSortResult));
        System.out.println("quickSortResult "
            + Arrays.toString(quickSortResult));
    }
}
