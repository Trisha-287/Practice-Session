package practice.session;

import java.util.Scanner;

public class primenumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number:");
        int n=sc.nextInt();
        boolean prime=true;
        if(n<=1){
            prime=false;
        }
        else{
            for(int i=2;i<n;i++){
                if(n%i==0){
                    prime =false;
                    break;
                }
            }
        }
            if(prime){
                System.out.println("Number is prime")  ;
            }
            else{
                System.out.println("number is not prime")  ;
            }

    }
}
