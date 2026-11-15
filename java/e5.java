import java.util.ArrayList;
import java.util.List;

public class e5 {
    public static void main(String[] args) {
        /* 5. Maior Elemento de um Array 
        Dado um array de números inteiros, escreva um método que retorne o maior valor presente, 
        sem utilizar funções prontas de bibliotecas de utilidade. 
         */

        
        ArrayList<Integer> array = new ArrayList<>(List.of(1,2,3,4,5,6));
        ArrayList<Integer> arr2 = new ArrayList<>(List.of(12, 2, 34, 56, 3));
        ArrayList<Integer> arr3 = new ArrayList<>(List.of(12, 23, 34, 76, 23));
        ArrayList<Integer> arr4 = new ArrayList<>(List.of(78, 34, 23, 12, 34));

        System.out.println(biggerValue(array)); //6
        System.out.println(biggerValue(arr2)); //56
        System.out.println(biggerValue(arr3)); //76
        System.out.println(biggerValue(arr4)); //78
    

    }


    /*
    Creates the variable 'bigger' with the first element of the list as the value, then compare 'bigger' with the next element fros the list and change it if the element where bigger then 'bigger'.
    Returns the bigger element*/
    public static int biggerValue(ArrayList<Integer> array){
        int bigger = array.get(0);

        for (int i = 0; i < array.size(); i++) {
            if (array.get(i) > bigger){
                bigger = array.get(i);
            }
        }

        return bigger;
    }
}
