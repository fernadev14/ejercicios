import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("*************** EJERCICIO 1 ***********************");
        ejercicio1();
        System.out.println("*************** EJERCICIO 2 ***********************");
        ejercicio2();
        System.out.println("*************** EJERCICIO 3 ***********************");
        ejercicio3();
        System.out.println("*************** EJERCICIO 4 ***********************");
        ejercicio4();
    }

    public static void ejercicio1() {
        var saludo = "Fernando";
        System.out.printf("%s, bienvenido al curso de programación en java!!! %n", saludo);
    }

    public static void ejercicio2() {
        System.err.println(" @@@@@@@ ");
        System.err.println("@| O O |@");
        System.err.println("(|  ^  |)");
        System.err.println(" | [_] | ");
        System.err.println(" +-----+ ");
    }

    public static void ejercicio3() {
        System.out.println("    *    ");
        System.out.println("   ***   ");
        System.out.println("  *****  ");
        System.out.println(" ******* ");
        System.out.println("  *****  ");
        System.out.println("   ***   ");
        System.out.println("    *    ");
    }

    public static void ejercicio4() {

        System.out.println("Ingresa 3 palabras solamente, y completa una frase, se valen signos eje: ?");
        Scanner palabra = new Scanner(System.in);

        System.out.print("Ingresa palabra 1: ");
        var palabra1 = palabra.nextLine();
        System.out.print("Ingresa palabra 2: ");
        var palabra2 = palabra.nextLine();
        System.out.print("Ingresa palabra 3: ");
        var palabra3 = palabra.nextLine();

        palabra.close();

        System.out.printf("frase final: %s %s %s%n", palabra1, palabra2, palabra3);
    }

}
