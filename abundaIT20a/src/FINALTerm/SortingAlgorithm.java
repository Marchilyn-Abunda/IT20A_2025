package FINALTerm;

public class SortingAlgorithm {

    public static void bubbleSort(int arr[]) {
        long start = System.nanoTime();
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        long end = System.nanoTime();
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println("\nBubble Sort Performance Time: " + (end - start) + " ns \n");
    }

    public static void selectionSort(int arr[]) {
        long start = System.nanoTime();

        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
        long end = System.nanoTime();
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println("\nSelection Sort Performance Time: " + (end - start) + " ns \n");
    }

    public static void insertionSort(int arr[]){
        long start = System.nanoTime();
        
        for(int i = 1; i <arr.length; i++){
            int key = arr[i];
            int j = i - 1; 
            
            while (j >= 0 && arr[j] > key){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
        
           long end = System.nanoTime();
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println("\nInsertion Sort Performance Time: " + (end - start) + " ns \n");
    }
    public static void main(String[] args) {
        int arr[] = {5, 3, 2, 1, 4};

        
//        Display
        System.out.println("Sorting using Bubble Sort");
        bubbleSort(arr);
        
         System.out.println("Sorting using Selection Sort");
         selectionSort(arr);
         
         System.out.println("Sorting using Insertion Sort");
         insertionSort(arr);
    }

}
