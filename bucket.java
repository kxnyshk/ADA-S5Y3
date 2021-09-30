import java.util.*;

public class bucket {
    
    static{
    
        System.out.println("This program sorts the array by Bucket sort");
    }
    public static void main(String[] args){
    
        int[] array = {32, 1, 45, 17, 4, 67, 34, 12, 23, 7};
        int bucketSize = 10;

        System.out.println("\nBefore sorting:");
        print(array,bucketSize);
        bucketSort(array,bucketSize);
        System.out.println("\nAfter sorting:");
        print(array,bucketSize);
    }

    public static int hash(int n, int m) {
        return n/m;
    }

    public static void bucketSort(int[] array, int n) {
        
      @SuppressWarnings("unchecked")  
      List<Integer>[] buckets = new List[n];

        for(int i=0; i<n; i++){
            buckets[i] = new ArrayList<>();
        }

        for(int num : array){
            buckets[hash(num, n)].add(num);
        }

        for(List<Integer> bucket : buckets){
            Collections.sort(bucket);
        }

        int bucketIndex = 0;
        for(List<Integer> bucket : buckets){
            for(int num: bucket){

                array[bucketIndex++] = num;
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