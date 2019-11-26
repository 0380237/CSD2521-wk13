/*
Chapter 13 Exercise 1 Assignment
Editor: Nathan Mackie
Date: 11/19/2019
*/

import java.util.Scanner;

public class NameParserApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a name: ");
        String name = sc.nextLine();
        System.out.println();
        
        name = name.trim();
        int index1 = name.indexOf(" ");
        if (index1 == -1) {
            System.out.println("Name not in valid format");
        } 
        else {
            int index2 = name.indexOf(" ", index1 + 1);
            if (index2 == -1) {
                String firstname = name.substring(0, index1);
                String lastname = name.substring(index1 + 1);
                
                System.out.println("First name: " + firstname);
                System.out.println("Last name: " + lastname);
            }
            else {
                int index3 = name.indexOf(" ", index2 + 1);
                if (index3 == -1) {
                    String firstname = name.substring(0, index1);
                    String middlename = name.substring(index1 +1, index2);
                    String lastname = name.substring(index2 + 1);
                    
                    System.out.println("First name: " + firstname);
                    System.out.println("Middle name: " + middlename);
                    System.out.println("Last name: " + lastname);
                }
                else {
                    System.out.println("Name not in valid format");
                }
            }
        }
    }
}
