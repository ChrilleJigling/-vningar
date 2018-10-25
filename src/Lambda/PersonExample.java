
package Lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PersonExample {
    public static void main(String[] args) {
        ArrayList<Person> persons = new ArrayList<>();
        
        persons.add(new Person("Chrille",15));
        persons.add(new Person("Nicke",13));
        persons.add(new Person("Aspen",21));
        persons.add(new Person("Kimpen",26));
        persons.add(new Person("Simpen",23));
        persons.add(new Person("Anton",26));
        persons.add(new Person("Janne",18));
        persons.add(new Person("Tarzan",4));
        persons.sort((t1,t2)-> t2.getAge()-t1.getAge());
        persons.sort((t1,t2)-> t1.getName().compareTo(t2.getName()));
        
        print(persons, s-> s.getAge()<=18);
        System.out.println("-------");
        print(persons, s-> s.getName().startsWith("A"));
        System.out.println("-------");
        print(persons, s-> s.getName().endsWith("n"));
        System.out.println("-------");
        
        persons.stream()
                .sorted((t1,t2)-> t1.getAge()-t2.getAge())
                .map(s-> s.getAge() +5)
                
                .forEach(System.out::println);
                
        
        
        
        
        
    }
    public static void print(List<Person> persons, PersonCondition condition) {
        for (Person person : persons) {
            if(condition.test(person)) {
                System.out.println(person.toString());
            }
        }
    }
    
}
