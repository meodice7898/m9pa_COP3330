// ConceptDemo.java
// Michael Eodice
// November 1, 2026

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// Converts array into a list.
class ArrayAdapter {
   private Integer[] numbers;

   public ArrayAdapter(Integer[] numbers) {
      this.numbers = numbers;
   }

   public List<Integer> toList() {
      List<Integer> list = new ArrayList<>();
      Collections.addAll(list, numbers);
      return list;
   }
}

public class ConceptDemo {
   public static void main(String[] args) {
      // Created the array and convert it to a list.
      Integer[] numbers = {5, 2, 9, 1, 4, 7};
      ArrayAdapter adapter = new ArrayAdapter(numbers);
      List<Integer> list = adapter.toList();

      // Print the original list, then sort it.
      System.out.println("Before sorting: " + list);
      Collections.sort(list);
      System.out.println("After sorting: " + list);

      // Remove the number 4 by value
      list.remove(Integer.valueOf(4));
      System.out.println("After removing 4: " + list);

      // Print the list using an unbounded wildcard method.
      printList(list);
   }

   public static void printList(List<?> list) {
      System.out.println("Printing list using unbounded wildcard: " + list);
   }
}
