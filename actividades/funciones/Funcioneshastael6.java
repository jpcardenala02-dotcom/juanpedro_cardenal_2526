import java.util.Scanner;

public class Funcioneshastael6 {

    static Scanner sc = new Scanner(System.in);

    /*
     * 1. Realiza una función llamada suma que sume dos números enteros
     * y te devuelva el resultado, posteriormente llámala desde el main y
     * muestra su resultado.
     */
    // 1
    public static int suma(int num1, int num2) {
       
        return num1 + num2;

    }

    public static void ejercicio1() {
        System.out.println("Introduzca dos numeros para sumar: ");
        int resultado = suma(2, 2);
        System.out.println("El resultado de la suma es: " + resultado);

    }

    /*
     * 2. Realiza un método llamado holaMundo que al ser llamada
     * muestre por consola el mensaje “Hola Mundo!”
     */
    // 2
    public static void Holamundo() {
        String hola = "Hola mundo!";
        System.out.println(hola);
    }

    public static void ejercicio2() {
        Holamundo();
    }

    /*
     * 3. Realiza un método llamado eco con un parámetro de entrada n,
     * que al ser llamada muestre por consola el mensaje “ECO” un
     * número n de veces.
     */
    // 3
    public static void eco() {
        System.out.println("ECO");
    }

    public static void ejercicio3() {
        System.out.println("Introduzca cuantas veces quieres que se repita la palabra ECO");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            eco();

        }

    }

    /*
     * 4. Escribe un método llamado mostrarIntermedios que tenga dos
     * parámetros de entrada a y b (números enteros) y muestre todos
     * los números pares entre ambos números (a y b inclusive).
     */
    public static void mostrarIntermedios() {
        System.out.println("introduzca dos numeros para mostrar los pares entre ellos");
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a <= b) {
            for (; a <= b; a++) {
                if (a % 2 == 0) {
                    System.out.print(a + ",");
                }

            }
        } else {
            for (; b <= a; b++) {
                if (b % 2 == 0) {
                    System.out.print(b + ",");
                }

            }
        }

    }

    public static void ejercicio4() {
        mostrarIntermedios();

    }

    /*
     * 5. Realiza una función areaCirculo que reciba un parámetro r y te
     * devuelva el área de un círculo de radio r.
     * Nota: En un circulo: area = pi * r * 2
     * Nota: en Java podemos usar el número pi con la constante de la
     * clase Math PI ( se accede con Math.PI )
     */
    public static double areaCirculo(double r) {
        System.out.println("Introduzca los cm del radio del circulo para calcular su area");
        r = sc.nextDouble();

        double area = Math.PI * r * 2;
        return area;

    }

    public static void ejercicio5() {
        double areacirculo = areaCirculo(0);
        System.out.println(areacirculo + " cm²");

    }

    /*
     * 6. Realiza una función que reciba dos números enteros y devuelva el
     * mayor de los dos, si son iguales devuelve cualquiera de los dos.
     */
    public static int mayor(int num1, int num2) {
        System.out.println("Introduzca dos numeros para ver cual es el mayor");
        num1 = sc.nextInt();
        num2 = sc.nextInt();
        int mayor;
        if (num1 >= num2) {
            mayor = num1;
        } else {
            mayor = num2;
        }
        return mayor;
    }

    public static void ejercicio6() {
        int a = mayor(0, 0);
        System.out.println("el mayor es el: " + a);
    }

    public static void main(String[] args) {
        // ejercicio1();
        // ejercicio2();
        // ejercicio3();
        // ejercicio4();
        // ejercicio5();
        // ejercicio6();

    }
}
