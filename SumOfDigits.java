package practice.session;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number");
        int n = sc.nextInt();
        int sum = 0;
        while(n>0){
            int digit=n%10;//take last digit
            sum=sum+digit;
            n=n/10;//remove last Digit
        }
            System.out.println("sum:"+sum);
    }
}
