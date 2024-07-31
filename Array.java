//datastructure-------arrays------collection of similar type of data 
//indexing ------0 based 
//contiguous memory allocation
public class Array {
    public static void main(String[] args) {
    //syntax--------
        int [] age= new int[2];
        float[] arr={1.4f,3.5f,45,67,8};//no size define


    //inserting element in age----
        age[0]=45;
        age[1]=34;
        System.out.println(age[0]);
        
        

    //types of Arrays--------
    //-single/1-D array
        int[] in={456};
    //multidimentional/2-D array----
        int [][] D={{34,56},{34,56}};
        int[][] twoD=new int[2][2];
        twoD[1][1]=34;
        twoD[0][1]=23;
        twoD[1][0]=45;
        twoD[0][0]=343;

    //length operation--------
    System.out.println(age.length);


    //traversing through arrays--------
    //for loop
    for(int i=0;i<2;i++){
        System.out.println(age[i]);

    }
    //for each loop
    for(int x:age){
        System.out.println(x);
    }

    //while loop
    int i=0;
    while (i<age.length) {
        System.out.println(age[i]);
        i++;
    }
    //traverse multiarray-------
    for(int k=0;k<2;k++){//k<arr.length
        for(int j=0;j<2;j++){//j<arr[i].length
            System.out.println(twoD[k][j]);
        }
    }


    //practice ques--------------
    //calculate sum of array
    int arr1[]={1,7,2};
    int sum=0;
    for(int j=0;j<arr1.length;j++){
        sum=sum+arr1[j];
    }
    System.out.println("sum "+sum);


    //calculate the max element from array
    int ans=0;
    for(int j=0;j<arr1.length;j++){
        if(ans<arr1[j]){
        ans=arr1[j];}
    }
    System.out.println("max "+ans);

    //search the given item----
    int x=2;//searching element
    for(int k=0;k<arr1.length;k++){
        if(x==arr1[k]){
        System.out.println("location"+arr1[k]);}
    }
     
    
}

}
