public class QuickSort1 {

    static{
    
        System.out.println("This program sorts the array by Quick sort.");
    }
    public static void main(String[] args){
    
        int[] array = {17,2,11,6,28,5,33,4};
        int n = array.length;
        int start = 0;
        int end = n-1;

        System.out.println("\nBefore sorting:");
        print(array,n);
        quickSort(array, start, end);
        System.out.println("\n\nAfter sorting:");
        print(array,n);
        System.out.println("\n");
    }

    public static int partition(int[] array, int start, int end) {
        
        int pivot = array[end];
        int pIndex = start;
        for(int i=start; i<end; i++){
            if(array[i]<=pivot){
                int temp;
                temp = array[i];
                array[i] = array[pIndex];
                array[pIndex] = temp;
                pIndex++;
            }
        }

        int temp;
        temp = array[pIndex];
        array[pIndex] = array[end];
        array[end] = temp;
        return pIndex;
    }

    public static void quickSort(int[] array, int start, int end) {
        
        if(start<end){
            int pIndex = partition(array, start, end);
            quickSort(array, start, pIndex-1);
            quickSort(array, pIndex+1, end);
        }
    }

    public static void print(int[] array, int n) {
        
        for(int i=0; i<n; i++){
            System.out.print(array[i] + " ");
        }
    }
}