public class RadixSort {
    
    static{
    
        System.out.println("This program sorts the array by Radix sort.");
    }
    public static void main(String[] args){
    
        int[] array = {432,8,530,90,88,231,11,45,677,199};
        int n = array.length;
        int max = max(array, n);

        System.out.println("\nBefore sorting:");
        print(array,n);
        radixSort(array, n, max);
        System.out.println("\n\nAfter sorting:");
        print(array,n);
        System.out.println("\n");
    }

    public static void countSort(int[] array, int n, int pos, int max) {
        
        int[] Count = new int[max+1];
        int[] Sorted = new int[n];

        for(int i=0; i<n; i++){
            ++Count[(array[i]/pos)%10];
        }
        for(int i=1; i<=max; i++){
            Count[i] = Count[i]+Count[i-1];
        }
        for(int i=n-1; i>=0; i--){
            Sorted[--Count[((array[i]/pos)%10)]]=array[i];
        }
        for(int i=0; i<n; i++){
            array[i] = Sorted[i];
        }
    }

    public static void radixSort(int[] array, int n, int max) {
        
        for(int pos=1; max/pos>0; pos*=10){
            countSort(array, n, pos, max);
        }
    }
    
    public static int max(int[] array, int n) {
        int max=0;
        for(int i=0; i<n; i++){
            if(array[i]>max){
                max = array[i];
            }
        }
        return max;
    }

    public static void print(int[] array, int n) {
        
        for(int i=0; i<n; i++){
            System.out.print(array[i] + " ");
        }
    }
}
