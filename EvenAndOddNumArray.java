package practice.session;

import java.util.Scanner;

public class EvenAndOddNumArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter array size");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("enter numbers");
        for(int i=0;i<size;i++) {
            arr[i] = sc.nextInt();
        }int even= 0;
         int odd=0;
        for(int i=0;i<size;i++) {
            if(arr[i]%2==0){
                even++;
            }
            else{
                odd++;
            }
        }
        System.out.println("even number is:"+even);
        System.out.println("odd number is:"+odd);
    }
}

