package Practice;
import java.util.*;

public class genericPractice {
    public static void main(String[] args) {
        List<Integer> ints = Arrays.asList(1,2,3);
        List<Double> doubles = Arrays.asList(1.5,2.5);

        List<Number> numbers = new ArrayList<>();
        List<Object> objects = new ArrayList<>();

        printNumbers(ints);
        printNumbers(doubles);
        addInts(numbers);
        addInts(objects);


    }

    public static void printNumbers(List<? extends Number> list) {
        // Loop and print each number
        for (Number n : list) {
            System.out.println("Here is your number: " + n);
        }
    }
    
    public static void addInts(List<? super Integer> list) {
        // add 10 and 20
        list.add(10);
        list.add(20);
        // Loop and print each element
        for (Object n : list) {
            System.out.println(n);
        }

    }
  
   
}
