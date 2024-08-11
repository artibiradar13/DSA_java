
import java.util.Scanner;

public class arrayquues1 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("size of the array:");
        int n=sc.nextInt();
       
        //array intialisation------------
        int[] arr= new int[n];


        //input array from user-----------
        for(int i=0;i<n;i++){
        System.out.println("enter array elements");
        arr[i] =sc.nextInt();
        }

        //for output
        for(int i=0;i<n;i++){
        System.out.println(arr[i]);

        }
        //target element to search----
        int target=4;
        PairSum(arr,target);
        TripleSum( arr,target);
        findUnique(arr);
        findSecondLargest(arr);
        findduplicate(arr);
        sc.close();
    }
   //find the total number of pairs in arrays whose sum is equal to the given value x
    static void PairSum(int[] arr,int target){
        int n=arr.length;
         for(int i =0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i] + arr[j]==target){
                    System.out.println("Pairsum of "+target+" is: "+arr[i]+","+arr[j]);
                }

            }
         }
    } 

    //count the number of triplets whose sum is equal to the given value x
    static void TripleSum(int[] arr,int target){
        int n=arr.length;
         for(int i =0;i<n;i++){
            for(int j=i+1;j<n;j++){
                for(int k=j+1;k<n;k++){

                   if(arr[i] + arr[j]+arr[k]==target){
                    System.out.println("Triplet sum "+target+" is: "+arr[i]+","+arr[j]+","+arr[k]);
                   }
                }

            }
         }
    } 


    // find a unique number in a given array
    static void findUnique(int[] arr){
        int n=arr.length;
         for(int i =0;i<n;i++){
            for(int j=i+1;j<n;j++){
                
                if(arr[i]==arr[j]){
                    arr[i]=-1;
                    arr[j]=-1;
            
                }
                

            }
         }
         for(int i=0;i<n;i++){
            if(arr[i]>0){
                System.out.println("unique element is "+arr[i]);
            }
         }
    }
    


    //find the second-largest element in the given array
    //find maximum-----
    static int findMax(int[] arr){
        int n=arr.length;
        int mx=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i]>mx){
                mx=arr[i];
            }
        }
            
    return mx;
    }
    //find second largest
    static void  findSecondLargest(int[] arr){
        int mx=findMax(arr);
        for (int i = 0; i <arr.length; i++) {
            if(arr[i]==mx){
                arr[i]=Integer.MIN_VALUE;
            }
            
        }
        int secondMax=findMax(arr);
    System.out.println("Second largest element is: "+secondMax);
    }


    //find duplicates in a array------------------
    static int findduplicate(int[] arr){
        int n=arr.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(arr[i]==arr[j]){
        
                    return arr[i];
                }
                
            }
        }
        return -1;
    }






}
