import java.util.*;
public class SumandAverage{
    public static void main(String [] args){
          Scanner scan = new Scanner(System.in);
          System.out.print("enterb size:");
          int size = scan.nextInt();
          int arr [] = new int [size];
          System.out.print("enter array elements:");
          for(int i=0; i < size; i++){
            arr[i] = scan.nextInt();
          }

          int sum =0;
          for (int j : arr) {
               sum += j; 
          }

          System.out.println("the sum is "+ sum);
          System.out.println("the average is "+ sum/arr.length);
          scan.close();
    }
}