import java.util.Scanner;

public class e3 {

    public static void main(String[] args) {
        /* 3. Verificar Palíndromo
        Escreva um método que retorne `true` se a palavra for um palíndromo 
        (lê-se igual de trás para frente) e `false` caso contrário
         */

        Scanner sc = new Scanner(System.in);

        System.out.println("Type a word to verify if it is palindrome: ");
        String word = sc.nextLine();

        System.out.println(isPalindrome(word));

        sc.close();
    }


    /*
    Invert the string putting the first letter before the second, and so on.
    returns true if comparison between the original and the inverted word matches, else false
     */
    public static Boolean isPalindrome(String text){
        String inverted = "";
        text = text.toLowerCase().trim();

        for (int i=0; i<text.length(); i++){
            inverted = text.charAt(i) + inverted;
        }

        // comparing
        return text.equals(inverted);
    }

}