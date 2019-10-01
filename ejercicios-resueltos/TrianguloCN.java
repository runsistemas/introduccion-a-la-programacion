/**
 * Si n=4 entonces elresultado será:
 * 1
 * 121
 * 12321
 * 1234321
 *
 * @author (RUN.SISTEMAS)
 * @version (0.1)
 */
import java.util.*;
public class TrianguloCN
{
    public static void main(String Arg[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int lim = 1;
        for(int i=1; i<=n; i++){
            int cp = i;
            for(int j=1; j<=lim; j++){
                if(j<=i){
                    System.out.print(j);
                }else{
                    cp--;
                    System.out.print(cp);
                    
                }
            }
            System.out.println();
            lim = lim+2;
        }
    }
}
