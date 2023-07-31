import java.util.Random;
import java.util.Scanner;

public class MAXIMINDWUMERImpl extends MAXIMINDWUMER {
}
class MAXIMINDWUMER {
    public static void main (String[] args){
        int[][] a = new int[3][3];
        int max, min;
        Random rnd = new Random();
        for (int i=0;i < a.length;i++) {
            for (int j=0;j < a[i].length;j++) {
                a[i][j]=rnd.nextInt(6) + 1;
            }
        }
        for (int i=0;i < a.length;i++,System.out.println()) {
            for (int j=0;j < a[i].length;j++) {
                System.out.print(a[i][j]+" ");
            }
        }
    }
}
