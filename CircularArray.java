import java.util.Scanner;

public class CircularArray {
    
    static{
    
        System.out.println("\nSearching for an element in a circular sorted array.");
    }
    private static int search;
    public static void main(String[] args){
    
        int[] array = {23,45,67,2,7,12};
        int n = array.length;

        printArray(array);
        Scanner scan = Search();

        int key;
        key = circularArray(array, n , search);
        System.out.println("\n" + search + " --> Index: " + key + "\n");

        scan.close();
    }

    private static int circularArray(int[] array, int n, int key) {
        int start = 0;
        int end = n-1;

        while(start<=end){
            int mid = (start + (end-start)/2);
            if(key == array[mid]){
                return mid;
            }
    
            if(array[start]<=array[mid]){
                if(key>=array[start] && key<array[mid]){
                    end = mid-1;
                }
    
                else{
                    start = mid+1;
                }
            }
    
            else if(array[mid]<array[end]){
                if(key>array[mid] && key<=array[end]){
                    start = mid+1;
                }
    
                else{
                    end = mid-1;
                }
            }
        }

        return -1;
    }

    private static Scanner Search() {
        System.out.print("\nEnter element to search: ");
        Scanner scan = new Scanner(System.in);
        search = scan.nextInt();
        return scan;
    }

    private static void printArray(int[] array) {
        System.out.print("\nArray: ");
        for(int x: array){
            System.out.print(x + " ");
        }
    }
}
