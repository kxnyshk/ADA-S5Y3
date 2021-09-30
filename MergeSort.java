public class MergeSort {

    static{
    
        System.out.println("This program sorts array by Merge sort.");
    }
    public static void main(String[] args){
    
        int[] array = {15,5,24,8,1,3,16,10,20};
        int n = array.length;
        int lowerBound = 0;
        int upperBound = n-1;

        System.out.println("\nBefore sorting:");
        print(array,n);
        mergeSort(array, lowerBound, upperBound);
        System.out.println("\n\nAfter sorting:");
        print(array,n);
        System.out.println("\n");
        
    }

    public static void mergeSort(int[] array, int lB, int uB) {
        
        if(lB<uB){
            
            int mid = (lB+uB)/2;
            mergeSort(array, lB, mid);
            mergeSort(array, mid+1, uB);
            merge(array, lB, mid, uB);
        }
    }

    public static void merge(int[] array, int lB, int mid, int uB) {
        
        int i = lB;
        int j = mid+1;
        int k = 0;
        int[] sorted = new int[uB-lB+1];

        while(i<=mid && j<=uB){
            if(array[i]<=array[j]){
                sorted[k++] = array[i++];
            }
            else{
                sorted[k++] = array[j++];
            }
        }

        if(i>mid){
            while(j<=uB){
                sorted[k++] = array[j++];
            }
        }
        else{
            while(i<=mid){
                sorted[k++] = array[i++];
            }
        }

        // for(i=lB; i<=uB; i++){
        //     array[i] = sorted[i-lB];
        // }
        i = 0;
        while(lB<=uB){
            array[lB++] = sorted[i++];
        }
    }

    public static void print(int[] array, int n) {
        
        for(int i=0; i<n; i++){
            System.out.print(array[i] + " ");
        }
    }
}