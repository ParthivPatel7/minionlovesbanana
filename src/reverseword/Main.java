/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reverseword;

/**
 *
 * @author ppart
 */
import java.util.*;


/*Creating a local repository in Laptop
1)Intialize versioning git      --> Blue jevu aave main package par and name badi file green thai jay to repository create thai gai che,.
Note-> Jyare repo banaiye tyare ae hamesha khlai j hoy pan ema apde files nakhvani using commit/ push/pull.

2) .gitconfig file   -> package ne right click karine, git ma jaine, repostiory ma jaine open global config select karvanu and and yes select karvanu
3) .gitignore file ---> aa ek evi file che jema evi file nu naam hoy jene ignore karvani che while committing
4) commit

*/
public class Main {
    
    public static void main(String[] args){
        
          int n;
        System.out.println("Enter the number of students whose data is to be entered\n");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        Student arr[] = new Student[n];
        String s = sc.nextLine();
        for(int i = 0;i<n;i++){
                 System.out.println("Enter the name of the student" + (i+1));
                 String str = sc.nextLine();
                 
                 System.out.println("Enter the age of the student" + (i+1));
                 int age = sc.nextInt();
                 
                 Student a = new Student(age,str);
                 arr[i] = a;
                 String s2 = sc.nextLine();
                 
        }
        for(int i = 0; i<n;i++){
            System.out.println("Displaying the details of the Student "+(i+1)+"\n");
            System.out.println("Name = "+arr[i].getName());
            System.out.println("Age = "+arr[i].getAge());
            System.out.println();
            
            
        }
        sc.close();
        
        
        
    }
    
    
    
}
