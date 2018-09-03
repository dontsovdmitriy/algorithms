package binarySearch;

import java.util.List;

public class BinarySearch {

    public static Integer search(List<Integer> itemList, int searchItem){

        int low = 0;
        int high = itemList.size()-1;
        int count = 0;

        while(low <= high){
            count++;
            int mid = (low + high)/2;
            int guess = itemList.get(mid);
            if (guess == searchItem){
      //          System.out.println(" attempt = " + count);
                return mid;
            }
            if (guess > searchItem){
                high = mid - 1;
            } else {
                low = mid +1;
            }
        }
    //    System.out.println(" attempt = " + count);
        return null;
    }
}
