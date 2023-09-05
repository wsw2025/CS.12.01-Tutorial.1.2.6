public class Mountain {
    /** @param array an array of positive integer values

     @param stop the last index to check
     Precondition: 0 <= stop < array.length
     @return true if for each j such that 0 <= j < stop, array[j] < array[j + 1] ;
     false otherwise
     */

    public static boolean isIncreasing(int[] array, int stop) {
        for (int i = 0; i < stop; i++){
            if(array[i]>=array[i+1]){
                return false;
            }
        }
        return true;
        // To be implemented.
    }
    /** @param array an array of positive integer values

     @param start the first index to check
     Precondition: 0 <= start < array.length - 1
     @return true if for each j such that start <= j < array.length - 1,
     array[j] > array[j + 1];
     false otherwise
     */

    public static boolean isDecreasing(int[] array, int start) {
        // To be implemented.
        for (int i = start; i < array.length-1; i++){
            if(array[i]<=array[i+1]){
                return false;
            }
        }
        return true;
    }

    public static int getPeakIndex(int[] array) {
        // To be implemented.
        for (int i = 1; i < array.length-1; i++){
            if(array[i]>array[i-1]&&array[i]>array[i+1]){
                return i;
            }
        }
        return -1;
    }

    public static boolean isMountain(int[] array) {
        int peak = getPeakIndex(array);
        if(peak==-1){
            return false;
        }
        if(isIncreasing(array, peak) && isDecreasing(array, peak)){
            return true;
        }
        return false;
        // To be implemented.
    }
}
