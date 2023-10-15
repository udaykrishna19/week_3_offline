import java.util.*;
public class Maxandmin {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("enter array size:");
        int size = scan.nextInt();
        int [] arr = new int [size];
        System.out.print("enetr elements:");
        for(int i =0; i < size; i++){
            arr[i]  = scan.nextInt();
        }
        Arrays.sort(arr);
        System.out.println("the max element is "+arr[size-1]);
        System.out.println("the min element is "+ arr[0]);
        scan.close();
    }
}
