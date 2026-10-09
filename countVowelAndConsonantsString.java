package practice.session;

import java.util.Scanner;

public class countVowelAndConsonantsString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a string");
        String name=sc.nextLine();
        int vowel=0;
        int consonats=0;
        for(int i=0;i<name.length();i++) {
            char ch = name.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                    vowel++;
                }
                else{
                    consonats++;
                }
            }
        }
        System.out.println("vowel is:"+vowel);
        System.out.println("consonats is:"+consonats);
    }
}
