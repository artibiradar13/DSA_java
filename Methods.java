package DSA_java;
//method/function-----use again and again

import java.util.Scanner;


public class Methods {
    public static void main(String[] args) {
        
    sum();
    int ans=sum2(12,23);
System.out.println( ans);
}
    

static void sum(){//without parameters
    int number1,number2,sum;
    number1=12;
    number2=12;
    sum=number1+number2;
    System.out.println("the sum is :"+sum);

}
static int sum2(int a,int b){//with parameters

int sum=a+b;
return sum;

}

}
class Swap{
   public static void main(String[] args) {
    int num1=10;
    int num2=20;
    swap(num1,num2);
    System.out.println(num1+"  "+num2);
   }
   static void swap(int a,int b){
    
    int temp=a;
    a=b;
    b=temp;
    System.out.println(a+"  "+b);
    
   }    
}
//method overloading----same method name but different arguments or return type

//questions......

class Ques {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        boolean ans=isprime(n);
        System.out.println(ans);

    }
    static boolean isprime(int n){
        if(n<=1){
            return false;
        }
        for(int c=2;c<Math.sqrt(n);c++){
            if(n%c==0){
                return false;
            }

            }
        return true;
    }

    
}