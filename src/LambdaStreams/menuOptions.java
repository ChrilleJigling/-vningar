
package LambdaStreams;

import java.util.function.BiConsumer;

public class menuOptions {
    String alt;
    BiConsumer<Double, Double> cal;
    
   public menuOptions(String alt, BiConsumer<Double,Double> cal) {
        this.alt = alt;
        this.cal = cal;
    } 
}
