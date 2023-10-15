import java.util.Scanner;

public class LargesttwoandSmallesttwo {
    public static void findTwolargest(int [] arr){
           int max_one = 0,max_two = 0;
           for(int i=0; i<arr.length; i++){
            for(int j =i + 1; j<arr.length; j++){
                max_one = arr[i] > arr[j] && arr[i] > max_one ? arr[i] : max_one;
            }
        }

        for(int i=0; i<arr.length; i++){
            if(arr[i] < max_one && arr[i] > max_two){
                max_two = arr[i];
            }
        }

        System.out.print("first max element "+ max_one +" second max element "+ max_two);
    }
    
    public static void findTwosmallest(int [] arr){
        int least_one = arr[0];
        for(int i =0; i<arr.length; i++){
            for(int j = i+1; j<arr.length; j++){
                least_one = arr[i] < arr[j] && arr[i] < least_one ? arr[i] : least_one; 
            }
        }

        int least_two = 0;

        for(int i=0; i<arr.length; i++){
            if(arr[i] < least_one && arr[i] > least_two){
                least_two = arr[i];
            }
            
        }

        System.out.print("first least element "+least_one+" second least element "+least_two);
    }
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("enter size: ");
        int size = scan.nextInt();
        System.out.print("enter array elements: ");
        int [] arr = new int [size];
        for(int i=0; i<size; i++){
            arr[i] = scan.nextInt();
        }
        findTwolargest(arr);
        findTwosmallest(arr);
        scan.close();
    }
}
