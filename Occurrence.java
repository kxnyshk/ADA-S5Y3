import java.util.Scanner;

public class Occurrence {
    
    static{
    
        System.out.println("\nFinding the first and the last the last occurrence of an element in a sorted array by Binary Search.");
    }
    private static int search;
    public static void main(String[] args){
    
        int[] array = {1,1,3,3,3,5,5,5,5,67,67};
        int n = array.length;

        printArray(array);
        Scanner scan = Search();

        int firstOCC;
        firstOCC = firstBinarySearch(array, n, search);
        System.out.println("\nFirst occurrence --> Index: " + firstOCC);

        int lastOCC;
        lastOCC = lastBinarySearch(array, n, search);
        System.out.println("Last occurrence  --> Index: " + lastOCC + "\n");

        scan.close();

    }

    private static int lastBinarySearch(int[] array, int n, int key) {
        int start = 0;
        int end = n-1;
        int result = -1;

        while(start<=end){
            int mid = (start + (end-start)/2);
            if(key == array[mid]){
                result = mid;
                start = mid+1;
            }

            else if(key<array[mid]){
                end = mid-1;
            }

            else if(key>array[mid]){
                start = mid+1;
            }
        }
        return result;
    }

    private static int firstBinarySearch(int[] array, int n, int key) {
        int start = 0;
        int end = n-1;
        int result = -1;

        while(start<=end){
            int mid = (start + (end-start)/2);
            if(key == array[mid]){
                result = mid;
                end = mid-1;
            }

            else if(key<array[mid]){
                end = mid-1;
            }

            else if(key>array[mid]){
                start = mid+1;
            }
        }
        return result;
    }

    private static Scanner Search() {
        System.out.print("\nEnter element: ");
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
