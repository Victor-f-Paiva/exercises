import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class e9 {
    public static void main(String[] args) {
        /* 9. Remover Duplicatas de uma Lista 
        Dada uma lista de elementos, crie um método que retorne uma nova lista 
        contendo apenas os elementos únicos.
         */

        List<Integer> array1 = List.of(1,2,3,4,5,1,2,3,6,7,8,9,7,8,9);
        List<Integer> array2 = List.of(10, 2, 2, 3, 4, 5, 10);
        List<Integer> array3 = List.of(1, 1, 2, 3, 3, 4, 5, 5, 6, 7, 7, 8, 9, 10, 11, 11);


        System.out.println("Original List: " + array1);
        System.out.println(uniqueList(array1));
        System.out.println("\nOriginal List: " + array2);
        System.out.println(uniqueList(array2));
        System.out.println("\nOriginal List: " + array3);
        System.out.println(uniqueList(array3));
    }


    /*
    Returns a new list with the unique elements.
    The resolution remains in create a set and then convert into a list
    */
    public  static List<Integer> uniqueList(List<Integer> array){
        Set<Integer> setOfInt = new  HashSet<>(array);
        List<Integer> newList = new  ArrayList<>(setOfInt);


        return newList;
    }
}
