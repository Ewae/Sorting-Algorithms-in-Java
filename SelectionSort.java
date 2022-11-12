public class SelectionSort {
    
    public static void main(String[] args){
        int[] intArray = {0, -22, 33, 78, 125, 23, 24, 106, -9, 4, 3, 42};

        sort(intArray);



    }

    public static void sort(int[] arr){

        for(int lastPartitionIndex = arr.length-1; lastPartitionIndex>0; lastPartitionIndex--){
            int largest=0;
            for(int i = 1; i <= lastPartitionIndex; i++){
                if(arr[i] > arr[largest]){
                    largest = i;
                }
            }
            swap(arr, largest, lastPartitionIndex);
        }
  
    }

    private static void swap(int[] arr, int largest, int lastPartitionIndex){

        if(largest == lastPartitionIndex){
            return;
        }

        int temp = arr[lastPartitionIndex];
        arr[lastPartitionIndex] = arr[largest];
        arr[largest] = temp;

    }
}
