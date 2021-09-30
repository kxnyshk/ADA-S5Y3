public class heap {
    
    static{
    
        System.out.println("This program sorts out the array by Heap sort.");
    }
    public static void main(String[] args){
    
        int[] array = {25,1,14,54,13,8,23};
        int n = array.length;

        System.out.println("\nBefore sorting:");
        print(array,n);
        heapSort(array,n);
        System.out.println("\nAfter sorting:");
        print(array,n);
    }

    public static void heapSort(int[] array, int n) { // HEAP SORT
        
        for(int i=n/2-1; i>=0; i--){ // HEAP CREATION
            
            heapify(array, n, i);
        }

        for(int i=n-1; i>0; i--){ // HEAP DELETION & EVENTUAL SORTING

            int temp;

            temp = array[i];
            array[i] = array[0];
            array[0] = temp;

            heapify(array, i, 0);
        }
    }

    public static void heapify(int[] array, int n, int i) { // HEAPIFY --> ARRANGING IN MAX HEAP
     
        int largest = i;
        int left = i*2 + 1;
        int right = i*2 + 2;

        while(left<n && array[left]>array[largest])
            largest = left;
        while(right<n && array[right]>array[largest])
            largest = right;
        
        if(largest!=i){

            int temp;

            temp = array[i];
            array[i] = array[largest];
            array[largest] = temp;

            heapify(array, n, largest);
        }
    }

    public static void print(int[] array, int n) {
        
        for(int i=0; i<n; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println("\n");
    }
}
