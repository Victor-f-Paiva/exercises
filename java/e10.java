import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class e10 {
    public static void main(String[] args) {
        /* 10. FizzBuzz Clássico 
        Escreva um programa que imprima os números de 1 a 20. 
        Para múltiplos de 3 imprima "Fizz", 
        para múltiplos de 5 imprima "Buzz", e 
        para múltiplos de ambos imprima "FizzBuzz". 
         */

        int[] array = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};

        System.out.println("Original List: ");
        System.out.println(Arrays.toString(array));
        
        System.out.println("\nFizzBuzz List: ");
        System.out.println(fizzBuzz(array));
    }


    /*
    Return a list with "Fizz" for multiples of 3, "Buzz" for mutiples of 5 and "FzzBuzz" for multiples of 3 and 5
    */
   public static List<Object> fizzBuzz (int[] array){
    List<Object> fizzBuzzList = new ArrayList<>();

    for (int n : array){
        if ( n%3 == 0 && n%5 == 0){
            fizzBuzzList.add("FizzBuzz");
        }
        else if ( n%3 ==0){
            fizzBuzzList.add("Fizz");
        }
        else if ( n%5 ==0){
            fizzBuzzList.add("Buzz");
        }
        else {
            fizzBuzzList.add(n);
        }
    }

    return fizzBuzzList;
   }
}
