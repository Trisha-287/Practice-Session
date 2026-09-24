package practice.session;

import java.util.Scanner;

public class reverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter string:");
        String str = sc.nextLine();
        String revere = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            revere += str.charAt(i);
        }
        System.out.println(revere);
    }
}
