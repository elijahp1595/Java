package Notes;
import java.util.*;

public class genericNotes {
    public static void main(String[] args) {
        List<Integer> ints = Arrays.asList(5,10,3);
        List<Double> doubles = Arrays.asList(1.5,9.2,4.1);

        System.out.println(max(ints));
        System.out.println(max(doubles));
        

    }

    /* This public static <T extends Number> means
    “I am creating a type variable called T”
    “T must be a Number or subclass of Number” 
    
    <T extends Number> = define type T
    extends is used to RESTRICT the type AND allow access to methods
    T = use that type               */
    public static <T extends Number> T max(List<T> list) {
        T max = list.get(0);
        for (T n : list) {
            if (n.doubleValue() > max.doubleValue()) {
                max = n;
            }
        }
        return max;
    }
  
   
}
