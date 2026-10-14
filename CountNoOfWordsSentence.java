package practice.session;

import java.util.Scanner;

public class CountNoOfWordsSentence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a sentence");
        String name = sc.nextLine();
int count=0;
for(int i=0;i<name.length();i++){
    if(name.charAt(i)!=' '&& (i==0||name.charAt(i-1)==' ')){//current character  ki mundhu una character
      count++;
    }
}
        System.out.println("number of words:"+count);
    }
}
