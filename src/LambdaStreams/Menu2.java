
package LambdaStreams;

import java.util.ArrayList;
import java.util.Scanner;


public class Menu2 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);   
    
    ArrayList<MenuOption2> myList = new ArrayList<>();
    myList.add(new MenuOption2("1. Add", (a,b)-> System.out.println(a+b)));
    myList.add(new MenuOption2("2. Subtract", (a,b)-> System.out.println(a-b)));
    myList.add(new MenuOption2("3. Divide", (a,b)-> System.out.println(a/b)));
    
        for (MenuOption2 menuOption2 : myList) {
            System.out.println(menuOption2.alt);
        }
        System.out.println("Make a choice");
        int choice = sc.nextInt()-1;
        System.out.println("---------");
        System.out.println("Enter first number please");
        Double numb1 = sc.nextDouble();
        System.out.println("Enter second number please");
        Double numb2 = sc.nextDouble();
        myList.get(choice).cal.accept(numb1,numb2);
       
    
    }
}
