package Practice.Generics;
import java.util.*;

public class genericPractice {
    public static void main(String[] args) {
        List<Integer> ints = Arrays.asList(-9,-5,-20);
        List<Number> numbers = new ArrayList<>();

        copy(ints, numbers); // this takes in ints for the input source and the destination here is numbers

        System.out.println(numbers);

        System.out.println(max(numbers)); // This prints out the largest number in the list

    }

    public static <T> void copy(List<? extends T> src, List<? super T> dest) {
        for (T item : src) {
            dest.add(item); // this adds numbers or items to the destination which is numbers. look above at copy in main for reference
        }
    }
    
    // src uses extends because we read from it.
    // dest uses super because we write into it.
    public static double max(List<? extends Number> list) {
        double largestNum = Double.NEGATIVE_INFINITY; // This sets largestNum to the lowest initial value
        for (Number n : list) { // This iterates through each element in the list
            if (n.doubleValue() > largestNum) {
                largestNum = n.doubleValue(); // .doubleValue() converts numbers into a double
            }
        }
        return largestNum;
    }
    
  
   
}
