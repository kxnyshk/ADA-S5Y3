public class RotationsCircularArray {
    
    static{
    
        System.out.println("\nChecking the number of rotations on a circular sorted array.");
    }
    public static void main(String[] args){
    
        int[] array = {23,45,67,2,7,12};
        int n = array.length;

        printArray(array);

        int rotations;
        rotations = Rotations(array, n);
        System.out.println("\nRoations on array: " + rotations + "\n");
    }

    private static void printArray(int[] array) {
        System.out.print("\nArray: ");
        for(int x: array){
            System.out.print(x + " ");
        }
    }

    private static int Rotations(int[] array, int n) {
        int min = array[0];
        int min_idx = -1;
        for(int i=0; i<n; i++){
            if(min>array[i]){
                min = array[i];
                min_idx = i;
            }
        }
        return min_idx;
    }
}
