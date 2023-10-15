import java.util.Scanner;

public class Findelement {
    public static int find(int [] arr, int n){
         int up = arr.length - 1, lwr = 0;
         int mid = (lwr+up)/2;
         while(lwr <= up){
            if(n  > arr[mid]){
                lwr = mid+1;
            }
            else if(n < arr[mid]){
                up = mid-1;
            }

            else{
                return mid;
            }
         }

         return -1;
    }
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("enter size :");
        int size = scan.nextInt();
        int [] arr = new int [size];
        System.out.print("Enter elements :");
        for(int i=0; i<size; i++){
             arr[i] = scan.nextInt();
        }
        System.out.print("enter element to find: ");
        int n = scan.nextInt();
      
            System.out.print(find(arr,n));
       
        scan.close();
    }
    
}
