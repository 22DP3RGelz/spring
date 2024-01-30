package rvt;

public class Search {
    public static int binarySearch(int[] arr, int SearchValue){
        int startIndex = 0;
        int endIndex = arr.length - 1;

        while (startIndex <= endIndex) {
            int middleIndex = (startIndex + endIndex) / 2;

            if (SearchValue == middleIndex){
                return middleIndex;
            }
            else if (SearchValue > middleIndex){
                startIndex = middleIndex + 1;
            }
            else if (SearchValue < middleIndex){
                endIndex = middleIndex -1;
            }
        }
        return -1;
    }
}
