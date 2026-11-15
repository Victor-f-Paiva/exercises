import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class e2 {
    public static void main(String[] args) {

        /*
        2. Inverter uma String 
        Crie um método que receba uma string e retorne essa string invertida 
        utilizando lógica iterativa. 
        */
        Scanner sc = new Scanner(System.in);

        System.out.println("Type a word to invert: ");
        String word = sc.nextLine();
        System.out.println("\n The inverted word is:");

        List<String> inverted = invertString(word);

        for (int i=0; i< inverted.size(); i++){
            System.out.print(inverted.get(i));
        }

        sc.close();
    }
    

    /*
    Convert the text into a list, and return the array list
    */
   public static List<String> invertString(String txt){
       List<String> invertedList = new ArrayList<String>();
       txt = txt.toLowerCase().trim();
       
       for (int i=0; i< txt.length(); i++){
           if (i==0){
               invertedList.add(txt.substring(txt.length()-i-1));
           }
           else {
               invertedList.add(txt.substring(txt.length()-i-1, txt.length()-i));
           }
       }
        return invertedList;
    }


}