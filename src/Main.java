import binarySearch.BinarySearch;
import selectionSort.SelectionSort;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Integer> sortedList = Arrays.asList(1,3,5,7,9);
        int[] unsortedArray = {9,7,5,3,1};
        List<Integer> unsortedList = Arrays.asList(9,7,5,3,1);

        //BinarySearch

        /*
        System.out.println(BinarySearch.search(sortedList, 9));
        System.out.println(BinarySearch.search(sortedList, -1));
        */

        //SelectionSort
        System.out.println(Arrays.toString(SelectionSort.selectionSort(unsortedArray)));
        }

}
