public class Insertion {
    
    static{

        System.out.println("This program sorts out the array by Insertion sort.");
    }
    public static void main(String[] args){

        int[] array = {95, 12, 1, 17, 6, 56, 23};
        int n = array.length;

        System.out.println("\nBefore sorting:");
        print(array,n);
        insertionSort(array, n);
        System.out.println("\nAfter sorting:");
        print(array, n);


    }

    public static void insertionSort(int[] array, int n) {
        
        for(int i=1; i<n; i++){

            int temp = array[i];
            int j = i-1;
            while(j>=0 && array[j]>temp){
                array[j+1] = array[j];
                j--;
            }
            
            array[j+1] = temp;
        }   
    }

    public static void print(int[] array, int n) {
        for(int i=0; i<n; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println("\n");
    }
}
