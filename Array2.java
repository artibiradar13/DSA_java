import java.util.Arrays;
import java.util.Scanner;

public class Array2 {
    public static void main(String[] args) {
        //input from user
        Scanner sc=new Scanner(System.in);
        System.out.println("size of array");
        int n=sc.nextInt();
        int arr[]=new int[n];

        //loop for input
        for (int idx = 0; idx < arr.length; idx++) {
           System.out.println("elements?");
           arr[idx]=sc.nextInt();
            
        }

        //loop for output
        for (int i=0;i<n;i++){
            System.out.println("elements are:"+arr[i]);
        }


        //question-------
        //count the number of occuurrences of a particular element x---------
        System.out.println(CountOccuurences(arr,4));
        
        //find the last occuurance of an element x in array
        System.out.println(isSorted(arr));
        //sorted array
        System.out.println("smallest and largest elememt"+arr[0]+" "+arr[arr.length-1]);

    }
    //count the number of occurrances------
     static int CountOccuurences(int[] arr,int x){
            int count =0;
            for(int i=0;i<arr.length;i++){
                if(arr[i]==x){
                    count+=1;
                }

            }
            return count;
        }
    //find the lat number occurrance of an element 
    static boolean isSorted(int[] arr){
        boolean check=true;
        for(int i=1;i< arr.length;i++){
            if(arr[i]<arr[i-1]){
                check=false;
                break;
            }
        }
        return check;

    }
    static int[] smallestandlargest(int[]arr){
    Arrays.sort(arr);
    int[] ans= {arr[0],arr[arr.length-1]};
    return ans;
}

}

