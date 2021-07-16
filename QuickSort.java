public class QuickSort{
  public static void quickSortAlgo(int[] input, int startIndex, int endIndex) {
         // your code goes here
         if(startIndex >= endIndex){
             return;
         }

         int pivot = makePivot(input,startIndex,endIndex);
         quickSortAlgo(input, startIndex, pivot - 1);
         quickSortAlgo(input,pivot + 1,endIndex);
     }
     public static void swap(int []arr,int index1, int index2){
         int temp = arr[index1];
         arr[index1] = arr[index2];
         arr[index2] = temp;
     }
     public static int makePivot(int []arr,int startIndex,int endIndex) {

             int pivot = arr[startIndex];
             int count = 0;
             for (int i = startIndex + 1; i <= endIndex; i++) {

                 if (arr[i] <= pivot) {
                     count++;
                 }
             }
             int pivotpos = count + startIndex;
             int temp = arr[pivotpos];
             arr[pivotpos] = arr[startIndex];
             arr[startIndex] = temp;

             int i = startIndex;
             int j = endIndex;
             while (i < pivotpos && j > pivotpos) {
                 if (arr[i] < arr[pivotpos]) {
                     i++;
                 }
                 else if (arr[j] > arr[pivotpos]) {
                     j--;
                 }
                 else {
                     swap(arr, i, j);
                     i++;
                     j--;

                 }
                 

             }

             return pivotpos;
         }

     public static void quickSort(int[] input) {

         quickSortAlgo(input, 0, input.length - 1);
         PrintArray.printArray(input);
     }

 }