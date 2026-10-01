package practice.session;

import java.util.Scanner;

public class FindNumThatAppearsAnOddNumOfTimes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);//array size
        System.out.println("enter array size");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("enter numbers");
        for(int i=0;i<size;i++) {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<size;i++) {
            int count=0;
            for(int j=0;j<size;j++) {
               if(arr[i]==arr[j]){
                    count++;
                }
            }
            if(count%2!=0){
                System.out.println("number appering odd times:"+arr[i])  ;
                break;
            }
        }
    }
}
