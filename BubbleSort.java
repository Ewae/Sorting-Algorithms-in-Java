public class BubbleSort {

    public static void main(String[] args){
        int[] arr = {1, -22, 3, 5, 4};

        sort(arr);

        for (int number : arr) {
            System.out.println(number);
        }

    } 

    public static void sort(int[] arr){
        for (int lastPartitionIndex = arr.length-1; lastPartitionIndex > 0; lastPartitionIndex-- ){
            for(int i = 0; i < lastPartitionIndex; i++){
                if(arr[i] > arr[i+1]){
                    swap(arr, i, i+1);
                }
            }
            }

        }

    private static void swap(int[] arr, int i, int j){
     
        if (arr[i] == arr[j]){
            return;
        }

        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;    
    }
}