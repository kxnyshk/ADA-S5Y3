public class bubble {
    static{
    
        System.out.println("This program sorts the array by Bubble sort method.");
    }
    public static void main(String[] args){
    
        int[] a = {23,1,67,12,5};
        int n = a.length;

        System.out.println("\nBefore sorting:");
        print(a,n);
        sort(a,n);
        System.out.println("\n\nAfter sorting:");
        print(a,n);
    }

    public static void sort(int[] array, int n) {
        
        for(int i=0; i<n-1; i++){
            
            boolean sort = false;
            for(int j=0; j<n-i-1; j++){

                if(array[j]>array[j+1]){
                    int temp;

                    temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                    sort = true;
                }
            }

            if(sort==false){
                break;
            }
        }
    }

    public static void print(int[] array, int n) {
        
        for(int i=0; i<n; i++){
            System.out.print(array[i] + " ");
        }
    }
}
