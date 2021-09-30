public class selection {

    static{
    
        System.out.println("This program sorts the array by Selection sort.");
    }
    public static void main(String[] args){
    
        int[] array = {30, 1, 45, 17, 5, 12};
        int n = array.length;

        System.out.println("\nBefore sorting:");
        print(array,n);
        sort(array,n);
        System.out.println("\nAfter sorting:");
        print(array,n);
    }

    public static void sort(int[] array, int n) {
        
        int i,j;
        for(i=0; i<n-1; i++){
            
            int min = i;
            for(j=i+1; j<n; j++){

                if(array[j]<array[min])
                    min = j;
            }

            if(min!=i){
                int temp;

                temp = array[i];
                array[i] = array[min];
                array[min] =  temp;
            }
        }
    }

    public static void print(int[] array, int n) {
        
        for(int i=0; i<n; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println("\n");
    }
}
