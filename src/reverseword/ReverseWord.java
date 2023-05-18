/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package reverseword;
import java.util.*;

/**
 *
 * @author ppart
 */
public class ReverseWord {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
     // TODO code application logic here
        
        System.out.println("Enter a string");
        Scanner sc=  new Scanner(System.in);
        String  str = sc.next();
        
        System.out.println(str);
        char str1[] = new char[10];
        System.out.println("\nPrinting the line reversing with it below\n");
        for(int i = 0,j = str.length()-1 ;i<str.length(); i++,j--){
            
            str1[i] = str.charAt(j);
            
        }
        for(char j:str1){
            System.out.print(j);
        }

        // PRinting using the reverse string;
        System.out.println("\n\nPrinting the reverse String: \t");
        for(int i = str.length()-1; i>=0;i--){
            System.out.print(str.charAt(i));
        }
    }
}
    
    

