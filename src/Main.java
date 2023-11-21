
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static Scanner scanner;
    public static void main(String[] args) {
	    scanner = new Scanner(System.in);
        menuOpciones();
    }

    public static void menuOpciones(){
        int opciones;
        do {
            menu();
            opciones = validaInt();

            switch (opciones){
                case 1 -> ejercicio1();
                case 2 -> ejercicio2();
                case 3 -> ejercicio3();
                case 4 -> ejercicio4();
                case 5 -> ejercicio5();
                /*case 6 -> ejercicio6();
                case 7 -> ejercicio7();
                case 8 -> ejercicio8();*/
                case 9 -> System.out.println("Saliendo");
            }
        }while(opciones != 9);
    }

    public static void menu(){
        System.out.println("Que ejercicios quieres hacer?");
        System.out.println("Ejerc. 1");
        System.out.println("Ejerc. 2");
        System.out.println("Ejerc. 3");
        System.out.println("Ejerc. 4");
        System.out.println("Ejerc. 5");
        System.out.println("Ejerc. 6");
        System.out.println("Ejerc. 7");
        System.out.println("Ejerc. 8");
        System.out.println("Salir");
    }

    public static int validaInt(){
        while (!scanner.hasNextInt()){
            System.out.println("Esto no es un numero");
            scanner.next();
        }
        return scanner.nextInt();
    }

    public static boolean validaPrimo(int valor){
        int contador = 0;
        boolean valido = false;
        for (int i = 1; i <= valor; i++) {
            if (valor%i == 0) {
                contador++;
            }
        }
        if (contador == 2) {
            valido = true;
        }
        return valido;
    }

    public static void ejercicio1(){
        int num = 0;

        do {
            System.out.println("Introduce un numero entero y comprobaremos si es primo o no");
            num = validaInt();
            while(num < 0){
                System.out.println("Porfavor introduce un numero positivo");
                num = validaInt();
            }
            System.out.println("El numero " + num + " es " + validaPrimo(num));
        }while(num != 0);
    }

    public static char letraDNI(int digitos){
        char array[] = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
        char letra = array[digitos%23];
        return letra;
    }

    public static void ejercicio2() {
        scanner.nextLine();
        System.out.println("Introduce tu DNI");
        String dni = scanner.nextLine();
        char nif;
        int digitos;

        while(dni.length() != 9){
            System.out.println("Error");
            dni = scanner.nextLine();
        }
        System.out.println("OK");
        dni = dni.toUpperCase();
        nif = (dni.charAt(8));
        digitos = Integer.parseInt(dni.substring(0,8));

        if (nif == letraDNI(digitos)) {
            System.out.println("El dni: " + digitos + " tiene el NIF de: " + letraDNI(digitos));
        }else{
            System.out.println("Hay algun error en tu sistema");
        }
    }

    public static boolean validaPitagora(int a, int b, int c){
        boolean igual = false;
        if (Math.pow(a,2)+Math.pow(b,2) == Math.pow(c,2)) {
            igual = true;
        }
        return igual;
    }

    public static void ejercicio3(){
        System.out.println("Introduce 3 numeros para hacer la ecuacion de pitagora");
        int num1 = validaInt(), num2 = validaInt(), num3 = validaInt();

        System.out.println(validaPitagora(num1,num2,num3));
    }

    public static int[] tabla(int num){
        int array [] = new int[10];

        for (int i = 0; i < array.length; i++) {
            System.out.println(num + " X " + (i+1) + " = " + (array[i] = num*(i+1)));
        }
        return array;
    }

    public static void ejercicio4(){
        System.out.println("Introduce un numero para multiplicarlo");

        int num = validaInt();

        System.out.println(Arrays.toString(tabla(num)));
    }

    public static void ejercicio5(){

    }

}