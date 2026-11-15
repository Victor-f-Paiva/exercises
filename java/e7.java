import java.util.ArrayList;
import java.util.List;

public class e7 {
    public static void main(String[] args) {
        /*7. Sequência de Fibonacci 
        Crie um método que retorne um array ou lista com os primeiros $n$ termos da sequência de Fibonacci.
        */
       System.out.println(fiboList(0));
       System.out.println(fiboList(-3));
       System.out.println(fiboList(1));
       System.out.println(fiboList(2));
       System.out.println(fiboList(3));
       System.out.println(fiboList(4));
       System.out.println(fiboList(5));
       System.out.println(fiboList(10));
    }


    /*
    Returns a List of 'n' fibonacci's sequence
    if n < 1, returns -1
    */
   public static List<Integer> fiboList(int n){
    List<Integer> fibo = new ArrayList<>();
    int last, secondToLast;

    if (n<1){
        fibo.add(-1); //adding -1 because n<1
    }

    for (int i=0; i<n; i++){
        if (i==0) {
            fibo.add(1);
        } 
        else if (i <=3){
            fibo.add(i);
        } else {
            last = fibo.get(i-1);
            secondToLast = fibo.get(i-2);
            fibo.add(last + secondToLast);
        }
    }

    return fibo;
   }

}
