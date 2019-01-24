/*
This program prompts the user to enter their name. 
The program ends by displaying the name of the user running the program.
*/
package softengRepo;
import java.util.Scanner; 

public class Hello {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //declared and initilialized the scanner
        String name = sc.nextLine(); //name = the user input
	System.out.print("NAME: "); 
        System.out.print(name);  //printing out the name of the user 

	}

}
