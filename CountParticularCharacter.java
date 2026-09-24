package practice.session;

import java.util.Scanner;

public class CountParticularCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter string:");
        String str = sc.nextLine();
        System.out.print(
                "enter character");
        char ch = sc.next().charAt(0);
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                count++;
            }
        }
        System.out.println(ch+"occured"+count+"times");
    }
}
