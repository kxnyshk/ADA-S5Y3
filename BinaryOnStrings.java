import java.util.Arrays;
import java.util.Scanner;

public class BinaryOnStrings {
    
    static{
    
        System.out.println("This program traverses a Binary Search for a string.");
    }
    public static void main(String[] args){
    
        String[] array = {"kanishk", "srk", "aakash", "nikhil", "nikki", "ray", "bakshy", "feluda", "arindam"};
        int n = array.length;

        Arrays.sort(array);
        // print(array, n);
        
        System.out.println("\nEnter input:");
        Scanner scan = new Scanner(System.in);
        String search = scan.nextLine();
        scan.close();

        binaryOnString(array, n, search);
    }

    public static void binaryOnString(String[] array, int n, String str) {
        
        int left = 0;
        int right = n-1;
        boolean found = false;
        while(left<=right){
            
            int mid = left+(right-left)/2;
            if(str.equals(array[mid])){
                System.out.println(str + " --> " + "Index " + mid + "\n");
                found = true;
                break;
            }
            else if(str.compareTo(array[mid])<0){
                right = mid-1;
            }
            else{
                left = mid+1;
            }
        }

        if(found==false){
            System.out.println(str + " not present in array.\n");
        }
    }

    public static void print(String[] array, int n) {
        
        for(String str:array){
            System.out.println(str);
        }

    }
}
