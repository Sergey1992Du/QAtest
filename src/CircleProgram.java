import java.util.Scanner;

public class CircleProgram {
    static Scanner sc = new Scanner(System.in);

    public static void main(String args[]) {
        System.out.print("Введите радиус в мм: ");
      /* Мы сохраняем введенный радиус в double
         потому что пользователь может ввести радиус дробным числом
       */
        double radius = sc.nextDouble();
        //Площадь круга вычисляется по формуле = PI*radius*radius
        double area = Math.PI * (radius * radius);
        double r = 1000;
        System.out.println("Площадь круга равна: " + area / r + " m2");
        //Длины окружности вычисляется по формуле = 2*PI*radius
        double circumference = Math.PI * 2 * radius;
        double c = 1000;
        System.out.println("Длины окружности равна: " + circumference / c + " m");
    }
}

class MAXIMINDWUMER1 {
    public static void main (String[] args){
        int[][] a=new int[3][3];
        int max,min;
        for (int i=0;i < a.length;i++){
            for (int j=0;j < a[i].length;j++){
                a[i][j]=(int)(Math.random()*10);
            }
        }
        for (int i=0;i < a.length;i++,System.out.println()){
            for (int j=0;j < a[i].length;j++){
                System.out.print(a[i][j]+" ");
            }
        }
    }
}

