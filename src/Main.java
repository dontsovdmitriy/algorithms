import binarySearch.BinarySearch;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Integer> myList = Arrays.asList(1,3,5,7,9);

        System.out.println(BinarySearch.search(myList, 9));
        System.out.println(BinarySearch.search(myList, -1));

        }

}
