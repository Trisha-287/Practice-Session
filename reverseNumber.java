package practice.session;

import java.util.Scanner;

public class reverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first number");
        int num= sc.nextInt();
        int reverse=0;
        while(num!=0){
            int digit=num%10;//take the last digit
            reverse=reverse*10+digit;
            num=num/10;//removre the last digit
        }
        System.out.println("reverse number is:"+reverse);
        sc.close();
    }
}
