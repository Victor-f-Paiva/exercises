public class e8 {
    public static void main(String[] args) {
        /*Contador de Vogais
         Escreva um método que conte o número de vogais (a, e, i, o, u) em uma string fornecida. 
        */
       System.out.println(vowelsCounter("abcde")); //2
       System.out.println(vowelsCounter("aass")); //2
       System.out.println(vowelsCounter("aeiou")); //5
       System.out.println(vowelsCounter("dfghj")); //0
    }


    /*
    Returns the quantity of vowls within the 'word'
    */
    public static int vowelsCounter(String word){
        int counter=0;
        word = word.toLowerCase();

        for (char letter : word.toCharArray()){
            if (letter == 'a' ||letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u'){
                counter +=1;
            }
        }
        return counter;
    }
}
