
/**
 * Write a description of class MejoresNotas here.
 * Entrada: 50 30 20 70 90 10
 * Salida: 90 70 50
 * @author (RUN.SISTEMAS)
 * @version (v0.1)
 */
import java.util.Scanner;
public class MejoresNotas
{
    public static void main(String [] Arg){
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();
        int n4 = sc.nextInt();
        int n5 = sc.nextInt();
        for(int i=1; i<=3; i++){
            if(n1>=n2&&n1>=n3&&n1>=n4&&n1>=n5){
                System.out.println(n1);
                n1=0;
            }else if(n2>=n1&&n2>=n3&&n2>=n4&&n2>=n5){
                System.out.println(n2);
                n2=0;
            }else if(n3>=n1&&n3>=n2&&n3>=n4&&n3>=n5){
                System.out.println(n3);
                n3=0;
            }else if(n4>=n1&&n4>=n2&&n4>=n3&&n4>=n5){
                System.out.println(n4);
                n4=0;
            }else{
                System.out.println(n5);
                n5=0;
            }
        }
    }
}
