import java.util.*;

public class Sortedarray {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter size:");
        int size = scan.nextInt();
        int [] arr = new int [size];
        System.out.print("enter elements:");
        for(int i=0; i<size; i++){
            arr[i] = scan.nextInt();
        }
        Arrays.sort(arr);

        for(int j : arr){
            System.out.print(j+" ");
        }

        scan.close();
    }
}
