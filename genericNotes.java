import java.util.*;

public class genericNotes {
    public static void main(String[] args) {
        List<Integer> ints = Arrays.asList(1,2,3);
        List<Double> doubles = Arrays.asList(1.5,2.5,3.5);
        List<String> Strings = Arrays.asList("Hello World!", "Hello Elijah", "Hello Ada Wong");

        
        printList(ints);
        printList(doubles);
        printList(Strings);
      
    }

    public static <T> void printList(List<? extends T> list) {
        for (T n : list) {
            System.out.print(n + " ");
        }
        System.out.println();
    }
}