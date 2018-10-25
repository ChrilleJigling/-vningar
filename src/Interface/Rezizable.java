
package Interface;


public interface Rezizable {
    // Övning 1: Vad innebär det att en klass implementerar ett interface?
    // svar: betyder att klassen ärver från det interfacet & måste overrida de/den abstrakta metoderna som finns i det interfacet.
    
    //Övning 2: Beskriv likheter och skillnader mellan ett interface & en abstrakt klass
    //Svar: likheter är att båda är abstrakta & kan ärvas ifrån. Men i ett interface får du inte implementera någon kod i om du inte 
    // skapar en default metod. Ska det vara ett funktionellt interface får det dessutom bara finnas en abstrakt metod i.
    // I en abstrakt klass kan du ha metoder som både är abstrakta & vanliga. Kan även skapa konstruktorer / olika fält
    
    void downSize(int scaleFactor);
    
    
    
}
