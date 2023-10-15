import java.util.*;

public class Printnoduplicate {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("enter size:");
        int size = scan.nextInt();
        int [] arr = new int [size];
        System.out.print("enter elements:");
        for(int i=0; i<size; i++){
            arr[i] = scan.nextInt();
        }
       HashSet<Integer> hs = new HashSet<Integer>();
       for(int j : arr){
        hs.add(j);
       }

       for(int k : hs){
        System.out.print(k+" ");
       }
 
        scan.close();
    }
    
}
