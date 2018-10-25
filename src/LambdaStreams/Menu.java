
package LambdaStreams;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.function.BiConsumer;

public class Menu {
    public static void main(String[] args) {
        ArrayList<menuOptions> myList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        
        myList.add(new menuOptions("1. Add", (a,b)-> System.out.println(a+b)));
        myList.add(new menuOptions("2. Substract", (a, b) -> System.out.println(a - b)));
        myList.add(new menuOptions("3. Multiply", (a, b) -> System.out.println(a * b)));
        myList.add(new menuOptions("4. Divide", (a, b) -> System.out.println(a / b)));
        
        for (menuOptions options : myList) {
            System.out.println(options.alt);
        }
        System.out.print("\nMake your choice:");
        int choice = sc.nextInt() - 1;

        System.out.println("\nNumber 1:");
        Double numb1 = sc.nextDouble();

        System.out.println("\nNumber 2:");
        Double numb2 = sc.nextDouble();
  
        myList.get(choice).cal.accept(numb1, numb2);
    
    }
}
