import java.util.Scanner;

public class LinearSearch {

    static{
    
        System.out.println("This program traverses a Linear search for an element in an array.\n");
    }
    public static void main(String[] args){
    
        int[] array = {10,30,50,20,60,80,0,90,100,70};
        int n = array.length;
        
        System.out.println("Enter input:");
        Scanner scan = new Scanner(System.in);
        int search = scan.nextInt();
        scan.close();
        
        linearSearch(array, n, search);
    }

    public static void linearSearch(int[] array, int n, int m) {
        
        int i = 0;
        boolean found = false;
        while(i<n){
            if(m == array[i++]){
                System.out.println(m + " --> Index " + (i-1) + "\n");
                found = true;
                break;
            }  
        }

        if(found==false){
            System.out.println(m + " not present in array.\n");
        }
    }
}