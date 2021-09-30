public class QuickSort {
    
    static{
    
        System.out.println("This program sorts the array by Quick sort.");
    }
    public static void main(String[] args){
    
        int[] array = {10,16,8,12,15,6,3,9,5};
        int n = array.length;
        int lowerBound = 0;
        int upperBound = n-1;

        System.out.println("\nBefore sorting:");
        print(array,n);
        quickSort(array, lowerBound, upperBound);
        System.out.println("\n\nAfter sorting:");
        print(array,n);
        System.out.println("\n");
    }

    public static int partition(int[] array, int l, int h){

        int pivot = array[l];
        int i = l;
        int j = h;
        
        while(i<j){
            
            while(array[i]<=pivot){
                i++;
            }
            while(array[j]>pivot){
                j--;
            }

            if(i<j){

                int temp;
                temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }

        int temp1;
        temp1 = array[l];
        array[l] = array[j];
        array[j] = temp1;
        
        return j;
    }

    public static void quickSort(int[] array, int l, int h) {
        
        if(l<h){
            int loc = partition(array, l, h);
            quickSort(array, l, loc-1);
            quickSort(array, loc+1, h);
        }
    }

    public static void print(int[] array, int n) {
        
        for(int i=0; i<n; i++){
            System.out.print(array[i] + " ");
        }
    }
}
