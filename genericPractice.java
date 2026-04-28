
import java.util.*;

public class genericPractice {
    public static void main(String[] args) {

        List<Number> numbers = new ArrayList<>();
        List<Object> objects = new ArrayList<>();

        // This is a test to push to github

        addInts(numbers);
        addInts(objects);
        



    }
    
    public static void addInts(List<? super Integer> list) {
        
            list.add(10);
            list.add(20);
        
        
        for (Object n : list) {
            System.out.println("Item: " + n);
        }
    }
}
