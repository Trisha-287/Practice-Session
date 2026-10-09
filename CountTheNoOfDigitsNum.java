package practice.session;

import java.util.Scanner;

public class CountTheNoOfDigitsNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter numbers");
        int num=sc.nextInt();
        int Count=0;
       /* for(;num>0;num=num/10){
            count++;
        }*/
        while(num>0){
            Count++;
            num=num/10;
        }
        System.out.println("number of digits:"+Count);
        sc.close();
    }
}
