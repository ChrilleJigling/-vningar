
package LambdaStreams;

import java.util.function.BiConsumer;

public class MenuOption2 {
    String alt;
    BiConsumer<Double,Double> cal;
    
    public MenuOption2(String alt, BiConsumer<Double, Double> cal) {
        this.alt = alt;
        this.cal = cal;
    }
}
