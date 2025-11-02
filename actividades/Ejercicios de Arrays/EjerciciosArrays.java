import java.util.Scanner;

public class EjerciciosArrays {
    public static final Scanner sc = new Scanner(System.in);

    /*
     * 1) Realiza un programa que pida al usuario un número natural n,
     * a partir de ese número le pediremos n veces que nos
     * introduzca otros números que almacenaremos en un array a y
     * mostraremos por pantalla.
     */
    public static void ejercicio1() {
        System.out.println("Introduzca el numero de elementos del array");
        int n = sc.nextInt();// n es el numero de elementos

        // le ponemos de limte n al array valores
        int valores[] = new int[n];

        // usamos a n como numero de iteraciones ya que es el mismo numero de valores
        for (int i = 0; i < n; i++) {
            System.out.println("Introduzca el valor numero: " + (i + 1) + "º");
            // el valor de i va marcando la posicion desde 0 hasta n
            valores[i] = sc.nextInt();
        }

        // bucle para mostrar los valores
        System.out.println("Los valores que ha introducido usted son: ");
        for (int a : valores) {
            System.out.print(a + " / ");
        }

    }

    /*
     * 2) Realiza un programa que teniendo un array relleno con
     * valores a de tamaño 5 (no es necesario que los valores los
     * introduzca el usuario) realice una copia del mismo en otra
     * variable array b y lo muestre por pantalla.
     */
    public static void ejercicio2() {

        int a[] = { 1, 2, 3, 4, 5 };

        // declaramos array b con limite 5
        int b[] = new int[5];

        System.out.println(" Copiando los valores de a -> b ....");

        // asignamos los valores de a -> b recorriendo el array
        for (int i = 0; i < a.length; i++) {
            b[i] = a[i];
        }

        System.out.print("los valores de b ahora son: ");
        // bucle para mostrar los valores del array b
        for (int c : b) {
            System.out.print(c + " / ");
        }

    }

    public static void ejercicio3() {
        /*
         * 3) Realiza un programa que pida números enteros positivos al
         * usuario y los vaya almacenando en un array a, cuando el
         * usuario introduzca -1 se dejará de pedir números y se
         * mostrará el array a de los números que ha introducido
         * (exceptuando el -1).
         */

        System.out.println("introduzca numeros en el array. PULSE -1 PARA SALIR.");
        int num = 0;
        int contador = 0;
        int array[] = new int[100];// le pongo de valor 100 por q no puedo declararlo dentro del bucle

        while (num != -1) {
            num = sc.nextInt();
            if (num != -1) {// condicion para salir del bucle

                array[contador] = num;
                contador++;
            }
        }
        System.out.println("Los valores introducidos en el array son:");
        for (int i = 0; i < contador; i++) {
            System.out.print(array[i] + "/ ");

        }
    }

    public static void ejercicio4() {
        /*
         * 4) Realiza un programa que pida al usuario un array a de 10
         * elementos y muestre por pantalla un array b que contenga los
         * elementos al revés, finalmente muestra por pantalla el array b.
         */

        // array a introducido por el usuario
        System.out.println("introduzca 10 numeros para el array a");
        int a[] = new int[10];

        int b[] = new int[10];

        for (int i = 0; i < 10; i++) {
            a[i] = sc.nextInt();
        }

        // asignar valores al reves
        for (int i = 0; i < a.length; i++) {
            b[i] = a[a.length - 1 - i];
        }

        System.out.print("array a:  ");
        for (int elementosA : a) {
            System.out.print(elementosA + "/ ");

        }

        System.out.println();

        System.out.print("array b:  ");
        for (int elementosB : b) {
            System.out.print(elementosB + "/ ");
        }

    }

    public static void ejercicio5() {
        /*
         * 5) Realiza un programa que pida al usuario un conjunto de
         * números para un array a de 8 elementos y muestre por
         * pantalla un array b que solo contenga los elementos impares.
         */
        System.out.println("introduzca 8 numeros para el array a");
        int a[] = new int[8];

        int b[] = new int[8];

        for (int i = 0; i < 8; i++) {
            a[i] = sc.nextInt();
        }
        for (int j = 0; j < a.length; j++) { // asignar valores al reves
            if (a[j] % 2 == 0) {
                b[j] = a[j];
            }
        }
        System.out.println("imprimir array b");
        for (int x : b) {
            System.out.print(x + "/ ");
        }

    }

    public static void ejercicio6() {
        /*
         * 6) Realiza un programa que pida al usuario 9 números naturales
         * y los almacene en un array a, tras ello, introducir todos los
         * números que sean pares en un array b y los que sean
         * impares en un array c, tanto el array b como el array c se
         * tendrán que mostrar por pantalla.
         */

        int a[] = new int[9];
        int b[] = new int[9];
        int c[] = new int[9];

        System.out.println("Introduzca los " + a.length + " elementos del array a");
        // pedir elementos del array a al usuario
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }

        // asignar pares a b y impares a c
        for (int j = 0; j < a.length; j++) {
            if (a[j] % 2 == 0) {
                b[j] = a[j];
            } else {
                c[j] = a[j];
            }
        }

        // imprimir b y c
        System.out.print("imprimir array b:  ");
        for (int l : b) {
            System.out.print(l + "/ ");

        }
        System.out.println();

        System.out.print("imprimir array c:  ");
        for (int o : c) {
            System.out.print(o + "/ ");
        }
    }

    public static void ejercicio7() {
        /*
         * 7) Escribe un programa que pida 10 números por teclado, los
         * almacene en un array y que luego muestre el máximo valor, el
         * mínimo y las posiciones que ocupan en el array.
         */
        int mayor = 0;
        int menor = 999999999;
        int mayorpos = 0;
        int menorpos = 0;

        int a[] = new int[10];
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();

            if (a[i] > mayor) {
                mayor = a[i];
                mayorpos = i + 1;
            }
            if (a[i] < menor) {
                menor = a[i];
                menorpos = i + 1;
            }

        }
        System.out.println("el elemento mayor es: " + mayor + " en la posición " + mayorpos);

        System.out.println("el elemento menor es: " + menor + " en la posición " + menorpos);

    }

    public static void ejercicio8() {
        /*
         * 8) Escribe un programa que genere 20 números enteros
         * aleatorios entre 0 y 99 y los almacene en un array. El programa
         * debe crear un nuevo array con los números pares que haya
         * entre esos 20 números. Luego debe mostrar los dos arrays.
         */
        int array[] = new int[20];
        int arrayPar[] = new int[20];
        int arrayImpar[] = new int[20];
        // array random del 0 al 99
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
        }
        System.out.print("imprimiendo array completo....");
        for (int each : array) {
            System.out.print(each + "/ ");
        }
        System.out.println();

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                arrayPar[i] = array[i];
            } else {
                arrayImpar[i] = array[i];
            }
        }

        System.out.print("imprimiendo array de pares....");
        for (int each : arrayPar) {
            System.out.print(each + "/");
        }

        System.out.println();

        System.out.print("imprimiendo array de impares....");
        for (int each : arrayImpar) {
            System.out.print(each + "/");
        }

    }

    public static void ejercicio9() {
        /*
         * 9) Realiza un programa que dado un array desordenado lo
         * ordene y lo muestre por consola siguiendo el algoritmo que
         * desees.
         */
        int array[] = { 8, 9, 5, 3, 4 };
        System.out.print("el array desordenado: ");

        for (int each : array) {
            System.out.print(each + "/");
        }
        System.out.println();

        boolean intercambiado;

        for (int i = 0; i < array.length - 1; i++) {
            intercambiado = false;
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    // Intercambiamos los elementos
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    intercambiado = true;
                }
            }
            // Si no hubo intercambios, el array ya está ordenado
            if (!intercambiado)
                break;
        }

        System.out.print("el array ordenado: ");

        for (int each : array) {
            System.out.print(each + "/");
        }

        System.out.println();

    }

    public static void ejercicio10() {
        /*
         * 10) Haz un programa que genere 20 números enteros del 1 al
         * 50 ambos inclusive y los almacene en un array,
         * posteriormente almacenará en un nuevo array solo los
         * números primos que haya en ese array. Ambos arrays
         * finalmente serán mostrados por consola.
         */
        int array[] = new int[20];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 50) + 1;
        }

        System.out.print("imprimiendo array completo....");
        for (int each : array) {
            System.out.print(each + "/ ");
        }
        System.out.println();

        int arrayPremoh[] = new int[20];
        for (int i = 0; i < array.length; i++) {
            boolean esPrimo = true;

            if (array[i] <= 1) {
                esPrimo = false;
            } else {
                for (int j = 2; j < array[i]; j++) {
                    if (array[i] % j == 0) {
                        esPrimo = false;
                        break;
                    }
                }
            }

            if (esPrimo) {
                arrayPremoh[i] = array[i];
            }
        }

        System.out.print("imprimiendo array de primos....");
        for (int each : arrayPremoh) {
            System.out.print(each + "/ ");
        }
        System.out.println();

    }

    public static void main(String[] args) {
        // ejercicio1();
        // ejercicio2();
        // ejercicio3();
        // ejercicio4();
        // ejercicio5();
        // ejercicio6();
        // ejercicio7();
        // ejercicio8();
        // ejercicio9();
        // ejercicio10();
        sc.close();

    }
}