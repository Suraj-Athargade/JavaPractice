package JavaBasicProgramming;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String args[]){
        int flag=0;
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();//5
        int m=n/2;

       if(n==0||n==1){
            System.out.println("this is not prime number");
       }else{
           for(int i=2;i<=m;i++){
                if(n%i==0){
                    System.out.println("this is NOT prime no");
                    flag=1;
                    break;
                }
        }if(flag==0){
               System.out.println("this is prime no");
           }
}}}

