/**
 * Convertir números en sistema decimal a sistema binario
 * @author (RUN.SISTEMAS)
 * @version (0.1)
 */
import java.util.Scanner;
public class DaB{
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un número en el sistema decimal");
        int n = scanner.nextInt();
        DaB a = new DaB();
        String nbinario = a.binario(n);
        System.out.println("El número convertido a binario es: " + nbinario);
    }
    public String binario(int n){
        String nbinario = "";
        if (n > 0) {
            while (n > 0) {
                if (n % 2 == 0) {
                    nbinario = "0" + nbinario;
                } else {
                    nbinario = "1" + nbinario;
                }
                n = n / 2;
            }
        } else if (n == 0) {
            nbinario = "0";
        } else {
            nbinario = "Ingrese solo números positivos";
        }
        return nbinario;
    }
}
