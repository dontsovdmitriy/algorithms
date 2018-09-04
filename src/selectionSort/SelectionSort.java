package selectionSort;

import java.util.List;

public class SelectionSort {

    private static int findSmallest(List<Integer> numbersList){
        int smallest = numbersList.get(0);
        int smallest_index = 0;
        for (int i = 1; i <numbersList.size() ; i++) {
            if (numbersList.get(i)< smallest){
                smallest_index = i;
            }
        }
        return smallest_index;
    }

    public static int[] selectionSort(int[] array) {

        for (int left = 0; left < array.length; left++) {
            int minIndex = left;
            for (int right = left + 1; right < array.length; right++) {
                if (array[right] < array[minIndex]) {
                    minIndex = right;
                }
            }
            if (minIndex != left) {
                int temp = array[left];
                array[left] = array[minIndex];
                array[minIndex] = temp;
            }
        }

        return array;



        /*

        List<Integer> resultList = new ArrayList<>();
        for (int i = 0; i <numbersList.size() ; i++) {
            int smallest = findSmallest(numbersList);
            resultList.add(smallest);
        }
        return  resultList;
    }
    */
    }
}
