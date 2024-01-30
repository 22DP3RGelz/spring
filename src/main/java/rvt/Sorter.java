package rvt;

public class Sorter {

   

    public static int smallest(int[] numbers){
        int rezult = 0;
        
        for (int i = 0; i < numbers.length; i++){
            if (rezult >numbers[i]){
                rezult = numbers[i];
            }
        }
        return rezult;
    }

    public static int indexOfSmallest(int[] numbers){
        int rezult = 0;
        
        for (int i = 1; i < numbers.length; i++){
            if (numbers[i-1] > numbers[i]){
                rezult = numbers[i];
            }
        }
        return rezult;

    }

    public static int indexOfSmallestFrom(int[] numbers, int startIndex) {
        int rezult = 0;
        
        for (int i = startIndex; i < numbers.length; i++){
            if (numbers[i-1] > numbers[i]){
                rezult = numbers[i];
            }
        }
        return rezult;
    }

    

}

