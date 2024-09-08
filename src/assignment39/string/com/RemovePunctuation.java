package assignment39.string.com;

import java.util.Scanner;

public class RemovePunctuation 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = scanner.nextLine();
        
        String result = removePunctuation(input);
        System.out.println("String without punctuation: " + result);
    }
    
    public static String removePunctuation(String str) 
    {
        return str.replaceAll("[\\p{Punct}]","");
    }
}
