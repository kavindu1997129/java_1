package kavindu_java_v1;

import java.time.Period;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) 
    {
        int income = 100_000;
        String className = income<100_000? "Economy":"First";
        System.out.println(className);

        String role = "admin";
        
        switch(role){
            case "admin":
                System.out.println("AdminABC");
                break;
            case "user":
                System.out.println("userABC");
                break;
            default:
            System.out.println("External");
        }

        Scanner scanner = new Scanner(System.in);
        String input = "";
        while(!input.equals("quit")){
            System.out.print("Input: ");
            input = scanner.next().toLowerCase();
            System.out.println(input);
        }

        String[] fruits = {"Apple", "Mango", "Orange"};
        for(int i = 0; i<fruits.length;i++){
            System.out.println(fruits[i]);
        }
        for(String fruit: fruits)
            System.out.println(fruit);
    }
}
