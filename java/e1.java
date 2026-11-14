public class e1 {
    public static void main(String[] args) {
        ///1. Verificador de Número Par ou Ímpar 
        /// Escreva um método que receba um número inteiro e retorne se ele é "Par" ou "Ímpar". 
        /// 
        System.out.println("Hello, world!\n");
        System.out.println(evenOdd(2));
        System.out.println(evenOdd(3));
        System.out.println(evenOdd(12));
        System.out.println(evenOdd(13));

    }

    public static String evenOdd(int n){
        if (n % 2 ==0){
            return "Even";
        }
        else{
            return "Odd";
        }
        
    }
}
