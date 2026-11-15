public class e6 {
    public static void main(String[] args) {
        /* 6. Validação de Número Primo 
        Escreva um método que verifique se um número inteiro positivo é primo.
        Retorne `true` ou `false`.
         */
        System.out.println(isPrime(1)); //false
        System.out.println(isPrime(2)); //true
        System.out.println(isPrime(3)); //true
        System.out.println(isPrime(4)); //false
        System.out.println(isPrime(5)); //true
        System.out.println(isPrime(11)); //true
        System.out.println(isPrime(16)); //false
    }


    /*
    Returns true if it's prime, else returns false.
    First, checks if 'n' is less than 1, then if it's 1, 2 or 3; afterwards if 'n' is even and for last a for loop to test if odd numbers, up to the limit divisible, are divisible by n
    */
    public static Boolean isPrime(int n){
        if (n <= 1){ 
            return false;
        }
        if (n == 2 || n==3){
            return true;
        }
        if ( n%2 ==0){
            return false;
        }
        
        for (int i=3; i< Math.sqrt(n)+1 ; i+= 2){
            if (n%i ==0){
                return false;
            }
        }
        return true;
    }
}
