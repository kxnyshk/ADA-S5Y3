import java.util.ArrayList;
import java.util.Collections;

public class bucket1 {
 
    static{
    
        System.out.println("This program sorts out the array by Bucket sort.");
    }
    public static void main(String[] args){
    
        float[] array = {(float)0.96, (float)0.01, (float)0.56, (float)0.34, (float)0.07, (float)0.12,
                            (float)0.67, (float)0.23, (float)0.02, (float)0.10};
        int bucketSize = 10;

        System.out.println("\nBefore sorting:");
        print(array,bucketSize);
        bucketSort(array, bucketSize);
        System.out.println("\nAfter sorting:");
        print(array,bucketSize);
    }

    public static void bucketSort(float[] array, int n) {
        
        if(n<=0)                                            // return if bucket size/array is empty
            return; 

        @SuppressWarnings("unchecked")                      // supress unchecked warnings for RAW type
        ArrayList<Float>[] buckets = new ArrayList[n];      // creating a new float input type ArrayList 'buckets' with 'n' entries
        for(int i=0; i<n; i++){
            buckets[i] = new ArrayList<Float>();            // initializing a new ArrayList at every index of 'buckets'
        }

        for(int i=0; i<n; i++){
            int bucketIndex = (int) array[i]*n;             // bucketIndex = 10*value
            buckets[bucketIndex].add(array[i]);             // adding every value of input array at calculated bucketIndex of of 'buckets'
        }

        for(int i=0; i<n; i++){
            Collections.sort(buckets[i]);                   // sorting every inner ArrayList at every index of 'buckets'
        }

        int arrayIndex = 0;                                 // initializing output array's index 'arrayIndex' as 0
        for(int i=0; i<n; i++){                             // traversing every entry of arrayList 'buckets'
            for(int j=0, size=buckets[i].size(); j<size; j++){  // traversing every entry of arrayList at every bucketIndex of 'buckets'
                array[arrayIndex] = buckets[i].get(j);      // putting values from every arrayList 'bucket' --> 'bucketIndex' to output array at every initialized arrayIndex
                    arrayIndex++;                           // moving on to next arrayIndex
            }
        }
    }

    public static void print(float[] array, int n) {
        for(int i=0; i<n; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println("\n");
    }
}