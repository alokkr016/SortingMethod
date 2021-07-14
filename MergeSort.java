
public class MergeSort {
    public static void mergeSort(int[] input) {  // 2 6 8 5 4 3
        // Write your code here
        if (input.length <= 1) {
            return;
        }
        int startIndex = 0;
        int endIndex = input.length - 1;
        mergeSortArray(input, startIndex, endIndex);
    }

    private static void mergeSortArray(int[] arr, int startIndex, int endIndex) {

        if (startIndex < endIndex) {

            int mid = (startIndex + endIndex) / 2;
            mergeSortArray(arr, startIndex, mid);
            mergeSortArray(arr, mid + 1, endIndex);
            merge(arr, startIndex, endIndex, mid);
        }
    }



    private static void merge(int []arr, int startIndex, int endIndex,int mid) {
      int []arr1 = makeArray(arr,startIndex,mid);
      int []arr2 = makeArray(arr,mid + 1,endIndex);
//        if(arr1.length == 0){
//            return arr2;
//        }
//        if(arr2.length == 0){
//            return arr1;
//        }
        int j = 0;
        int k = 0;
        int i = 0;
//        int []newArr = new int[arr1.length + arr2.length];

        while(j < arr1.length && k < arr2.length){
            if(arr1[j] < arr2[k]){
                arr[i] = arr1[j];
                j++;
            }
            else{
                arr[i] = arr2[k];
                k++;
            }
            i++;

        }
        while(j < arr1.length){

            arr[i] = arr1[j];
            i++;
            j++;
        }
        while(k < arr2.length){
            arr[i] = arr2[k];
            i++;
            k++;
        }
//        for(int m = 0;m < arr.length;m++){
//            arr[m] = newArr[m];
//        }
//        arr = newArr;
    }

    private static int[] makeArray(int []arr,int startIndex, int endIndex){
        int[] arr1 = new int[endIndex - startIndex + 1];
        for(int i = 0;i < arr1.length;i++){
            arr1[i] = arr[i + startIndex];
        }
        return arr1;
    }
}
