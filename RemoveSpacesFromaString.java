package practice.session;

import java.util.Scanner;

public class RemoveSpacesFromaString {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("enter a sentence");
            String name=sc.nextLine();
            for(int i=0;i<name.length();i++){
                if(name.charAt(i)!=' '){
                    System.out.print(name.charAt(i));
                }
            }
            sc.close();
        }
}
