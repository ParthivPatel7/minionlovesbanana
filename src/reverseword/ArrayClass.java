/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reverseword;
import java.util.*;
/**
 *
 * @author ppart
 */
public class ArrayClass {
    public static void main(String args[]){
    System.out.println("Hello To my School");
    Student arr[] = new Student[3];
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the following values");
    for(int i= 0;i<3;i++){
        System.out.println("Enter the name");
        String str = sc.next();
        arr[i].setName(str);
        System.out.println("Enter the age");
        int age = sc.nextInt();
        arr[i].setAge(age);
        
    }
    for(int i = 0;i<3;i++){
        System.out.println("\nDisplaying the information for Student "+(i+1));
        System.out.println("Name ="+arr[i].getName());
        System.out.println("Age ="+arr[i].getAge());
        
        
    }
    
}
}
