package practice.session;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number:");
        int n= sc.nextInt();
        int original=n;
        int sum=0;
        while(n>0){
            int digit=n%10;
            int cube=digit*digit*digit;
            sum=sum+cube;
            n=n/10;
        }
     if(sum==original){
         System.out.println("armstrom number");
     }
     else{
         System.out.println("not armstrom number");
     }
    }
}
