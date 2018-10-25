
package Interface;

public class Test {

    public static void main(String[] args) {
            Rezizable r = new Rectangle(50, 100); //Går bra, du instantierar ett interface som typ Rektangel
            Rectangle r1 = new Rectangle(50, 100); // du instantierar en rektangel som i sin tur implementerar interfacet Rezizable
     //       Rezizable r2 = new Rezizable(50, 100); //Kan aldrig instantiera ett interface själv
        
            System.out.println(r);
            System.out.println(r1);
            
            r.downSize(100);
            System.out.println(r);
            r1.downSize(100);
            System.out.println(r1);
            // Båda funkar för ex r är en rezizable med typ av rektangel & r1 är en rektangel som implementerar interfacet rezizable
    }
    
}
