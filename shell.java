public class shell {

    static{
    
        System.out.println("This program sorts the array by Shell sort.");
    }
    public static void main(String[] args){
    
        int[] array = {23,1,45,17,10,7,4};
        int n = array.length;

        System.out.println("\nBefore sorting:");
        print(array,n);
        sort(array,n);
        System.out.println("\n\nAfter sorting:");
        print(array,n);
    }

    public static void sort(int[] array, int n) {
        
        int i,j,g;
        for(g=n/2; g>=1; g/=2){

            for(j=g; j<n; j++){

                for(i=j-g; i>=0; i=i-g){

                    if(array[i]<array[i+g])
                        break;
                    else{
                        int temp;

                        temp = array[i];
                        array[i] = array[i+g];
                        array[i+g] = temp;
                    }
                }
            }
        }
    }

    public static void print(int[] array, int n) {
        
        for(int i=0; i<n; i++){
            System.out.print(array[i] + " ");
        }
    }
}