public class e4{
    public static void main(String[] args) {
        /* 4. Fatorial de um Número
         Implemente um método que calcule o fatorial de um número inteiro não negativo $n$. 
         */

         System.out.println(factorial(3)); //6
         System.out.println(factorial(5)); //120
         System.out.println(factorial(7)); //5040
         System.out.println(factorial(8)); //40320
         System.out.println(factorial(4)); //24
    }


    /*
    Returns the product from 1 x 2, and so on, until reaching n */
    public static int factorial(int n){
        int result = 1;

        for (int i=0; i<n; i++){
            result *= i+1;
        }
        return result;
    }
}