public class SelectionSort{
  public static int compare(int []arr,int index){
    int minIndex = index;
    for(int i = index + 1;i < arr.length;i++){
      if(arr[i] < arr[index]){
        minIndex = i;
      }
    }
    return minIndex;
  }
  public static void selectionSort(int[] arr){
    for(int i = 0;i < arr.length - 1;i++){
      int minIndex = compare(arr,i);
      int temp = arr[i];
      arr[i]= arr[minIndex];
      arr[minIndex] = temp;
    }
    PrintArray.printArray(arr);
  }
}