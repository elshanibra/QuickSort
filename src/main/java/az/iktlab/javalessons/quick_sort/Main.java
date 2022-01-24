package az.iktlab.javalessons.quick_sort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        long startTime = System.nanoTime();
        int[] data = {53, 12, 46, 33, 19, 65, 27, 53};
        System.out.println("Unsorted Array");
        System.out.println(Arrays.toString(data));

        int size = data.length;

        // call quicksort() on array data
        QuickSort.quicksort(data, 0, size - 1);

        System.out.println("Sorted Array in Ascending Order ");
        System.out.println(Arrays.toString(data));
        System.out.println();
        long endTime = System.nanoTime();
        long totalTime = endTime - startTime;
        System.out.println(totalTime);
    }
}

