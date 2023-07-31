import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
//    private static String[] args;
//
//    public static void main(String[] args) {
//
//    }
//    static {
//        Scanner in = new Scanner(System.in);
//        System.out.print("Приветствую, я LAPTOP как я могу к Вам обращаться мой госпадин?: ");
//        String name = in.nextLine();
//        System.out.println("Рад Вам служить: " + name);
//    }
//    static {
//        Scanner sc = new Scanner(System.in);
//        double a = sc.nextInt();
//        double b = sc.nextInt();
//        System.out.println(a / b);
//    }
//
//    static {
//        int num;
//        System.out.println("Введите число: ");
//        Scanner input = new Scanner(System.in);
//        num = input.nextInt();
//        if (num % 2 == 0)
//            System.out.println("true");
//        else
//            System.out.println("false");
//    }
//
//    static {
//        System.out.println("Введите число: ");
//        Scanner input = new Scanner(System.in);
//        byte b = (byte) input.nextInt();  // преобразование типов: от типа int к типу byte
//         {
//            // Возведение в 7 степень числа b
//            int a1 = b;
//            int b1 = 7;
//            System.out.printf("Число b в степени 7 равно %.0f \n", Math.pow(a1, b1));
//        }
//    }
public static void main(String[] args) {
    System.out.println("Что хотите посчитать?");
    Scanner inner = new Scanner(System.in);
    String numberTask = "";
    numberTask = inner.next();

    if (numberTask == "Куб" || numberTask == "куб") {

    }
    static void method(){
        Scanner inner = new Scanner(System.in);
        System.out.println("Введите значение для куба");
        double polzovatelVvel = inner.nextDouble();
        Kub myKubsds = new Kub(polzovatelVvel);

        System.out.println(myKubsds.s + " М2");
        System.out.println(myKubsds.v + " М3");
    }
    else if (numberTask == "Шарик" || numberTask == "шарик")
        System.out.println("Введите значение для шарика");
    double polzovatelVvel = inner.nextDouble();
    Bull myBullsds = new Bull(polzovatelVvel);

    System.out.println(myBullsds.s + " М2");
    System.out.println(myBullsds.v + " М3");
    method();
}
    static void method(){
        Scanner inner = new Scanner(System.in);
        System.out.println("Введите значение для куба");
        double polzovatelVvel = inner.nextDouble();
        Kub myKubsds = new Kub(polzovatelVvel);

        System.out.println(myKubsds.s + " М2");
        System.out.println(myKubsds.v + " М3");
    }
}
}
