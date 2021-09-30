import java.util.Scanner;

public class LinearOnStrings {
    
    static{
    
        System.out.println("This program traverses a Linear search for a string.");
    }
    public static void main(String[] args){
    
        String[] array = {"kanishk", "srk", "aakash", "nikhil", "nikki", "ray", "bakshy"};
        int n = array.length;
        
        System.out.println("\nEnter input:");
        Scanner scan = new Scanner(System.in);
        String search = scan.nextLine();
        scan.close();

        linearOnString(array, n, search);
    }

    public static void linearOnString(String[] array, int n, String str) {
        
        int i = 0;
        boolean found = false;
        while(i<n){
            if(str.equals(array[i++])){                                   // String1.equals(String2) --> comapring 2 strings in java
                System.out.println(str + " --> Index " + (i-1) + "\n");
                found = true;
                break;
            }  
        }

        if(found==false){
            System.out.println(str + " not present in array.\n");
        }
    }
}
