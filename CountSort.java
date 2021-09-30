public class CountSort {
    
    static{
    
        System.out.println("This program sorts the array by Count sort.");
    }
    public static void main(String[] args){
    
        int[] array = {2,1,1,0,2,5,4,0,8,9};
        int n = array.length;
        int max = max(array, n);
        // System.out.println(max);

        System.out.println("\nBefore sorting:");
        print(array,n);
        countSort(array, n, max);
    }

    public static void countSort(int[] array, int n, int max) {
        int[] Count = new int[max+1];
        int[] Sorted = new int[n];

        for(int i=0; i<n; i++){
            ++Count[array[i]];
        }
        for(int i=1; i<=max; i++){
            Count[i] = Count[i]+Count[i-1];
        }
        for(int i=n-1; i>=0; i--){
            Sorted[--Count[array[i]]]=array[i];
        }

        System.out.println("\n\nAfter sorting:");
        print(Sorted,n);
        System.out.println("\n");
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
