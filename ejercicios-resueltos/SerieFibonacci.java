/**
 * Dado un número n, mostrar los n primeros números de fibonacci.
 * 0, 1, 1, 2, 3, 5
 * @author (RUN.SISTEMAS)
 * @version (v0.1)
 */
import java.util.Scanner;
public class SerieFibonacci
{
    public static void main(String Arg[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int fibo1 = 0;
        int fibo2 = 1;
        int cont=0;
        while(cont<=n){
            if(cont==0){
                System.out.print(fibo1+" ");
            }else{
                System.out.print(fibo2 + " ");
                fibo2 = fibo1 + fibo2;
                fibo1 = fibo2 - fibo1;
            }
            cont++;
        }
        
    }
}
