public class InsertionSort {
    
    public static void main(String[] args){

        int[] arr = {1, -22, 3, 5, 74, -32};

        sort(arr);

        for (int num : arr) {
            System.out.println(num);
        }

    }

    public static void sort(int[] arr){

        for(int UnsortedIndex = 1;  UnsortedIndex < arr.length ;UnsortedIndex++){

            int newElement = arr[UnsortedIndex];

            int i;

            for(i = UnsortedIndex; i > 0; i--){
                if(newElement < arr[i-1]){
                    arr[i] = arr[i-1];
                }else {
                    break;
                }
            }

            arr[i] = newElement;

        }
    }
}
