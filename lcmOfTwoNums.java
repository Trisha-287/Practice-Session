package practice.session;

import java.util.Scanner;

public class lcmOfTwoNums {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first number");
        int num1 = sc.nextInt();
        System.out.println("enter second number");
        int num2 = sc.nextInt();
        int lcm=(num1>num2)?num1:num2;//?num1 ----condition true aeithe num1 value select//:condition false ayeithe num2 select
        while(lcm%num1!=0||lcm%num2!=0){
            lcm++;
        }
        System.out.println("lcm:"+lcm);
        sc.close();
    }
}
