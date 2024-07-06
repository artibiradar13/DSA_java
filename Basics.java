package DSA_java;

import java.util.Scanner;

public class Basics {
    public static void main(String[] args) {
        System.out.println("what is your name:");
        //how to take input
        Scanner sc = new Scanner(System.in);
        sc.nextInt();//input in integer only
        sc.next();//input string

        //data types-primitive
        int number=45;
        char letter ='r';
        float marks = 98.67f;
        boolean check=false;

        //type casting
        int num=(int)(54.667f);
        System.out.println("num"+num);

        //conditional statements
        //if-else
        int salary=25000;
        if(salary>10000){
            System.out.println("salary big");
        }
        else{
            System.out.println("salary small");
        }
        //multiple/nested
        if(salary==3500){
            salary=salary+1;
        }
        else if(salary<35000){
            salary=salary+5;
        }
        else{
            System.out.println("salary"+salary);
        }
        



        //loops
        //Q:print numbers from 1 to 5
        for (int i = 0; i <=5; i++) {//when u know how many times to run a loop
            System.out.println("numbers are: "+i);
        }

        int j=0;
        while(j<=5){//when u dont know how many times to run a loop
            System.out.println(j);
            j++;
        }

        int k=0;
        do { 
            System.out.println(k);
        } while (k<=5);

        //Q:find the largest
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        int num3=sc.nextInt();
        if(num1>num2&&num1>num3){
            System.out.println(num1);
    
        }
        else if(num2>num1&&num2>num3){
            System.out.println(num2);
        
        }
        else{
            System.out.println(num3);
        
        }
        int max=Math.max (num3,Math.max(num1, num2));//short


        //Q:case check
        char ch=sc.next().trim().charAt(0);
        System.out.println(ch);
        if(ch<='a'&&ch<='z'){
            System.out.println("lowercase");
        }
        else{
            System.out.println("Uppercase");
        }


        //Q: find fibonacci numbers
        int no_1=0,no_2=2;
        int count=2;
        int n=6;//no. of fibonacci numbers
        while(count<=n){
            int temp=no_2;
            no_2=no_1+no_2;
            no_1=temp;
            count++;
        }
        System.out.println(no_1);

        //Q:count the same occurring numbers
        int ij=25578;
        int count1=0;
        while(ij>0){
            int rem=ij%10;
            if(rem==5){
                count1+=1;
            }
            ij=ij/10;
        }
        System.out.println(count1);



        //Q:reverse of a number
        int no=23459;
        int ans=0;
        while(no>0){
            int rem=no%10;
            no/=10;

            ans=ans*10+rem;

        }
        System.out.println(ans);

        //switch cases
        String fruit = sc.next();
        switch(fruit){
            case "orange":
            System.out.println("winter friut");break;
            case "apple":
            System.out.println("keeps doctor away");break;
            case "banana":
            System.out.println("every season fruit");break;
            default:
            System.out.println("eat ffruits");
        }


        //////functions/methods
        
        



        









        








    


       
       





    }
}
