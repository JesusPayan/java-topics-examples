package Ejercicios;

import java.util.Scanner;

public class Ejercicios {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);
        int opcionEjercicio;
        int opcionOperacion;

        System.out.println("1. Ejercicio 1");
        System.out.println("2. Ejercicio 2");
        System.out.println("3. Ejercicio 3");
        opcionEjercicio = read.nextInt();

        switch (opcionEjercicio){
            case 1:
                System.out.println("\n1. Suma");
                System.out.println("2. Resta");
                System.out.println("3. Multiplicacion");
                System.out.println("4. Division");
                opcionOperacion = read.nextInt();
                Operaciones ejercicio1 = new Operaciones();

                System.out.print("Ingresa el primer numero: ");
                ejercicio1.setNumero1(read.nextDouble());

                System.out.print("Ingresa el segundo numero: ");
                ejercicio1.setNumero2(read.nextDouble());

                switch (opcionOperacion){
                    case 1:
                        ejercicio1.sumar();
                        break;
                    case 2:
                        ejercicio1.restar();
                        break;
                    case 3:
                        ejercicio1.multiplicar();
                        break;
                    case 4:
                        ejercicio1.dividir();
                        break;
                }

                System.out.println("\nEl resultado es: " + ejercicio1.getResultado());

                break;
            case 2:
                VoltearString ejercicio2 = new VoltearString();

                System.out.print("Ingresa el texto inicial (Separado por -): ");
                ejercicio2.setTextoInicial(read.next());

                ejercicio2.voltearString();

                System.out.println(ejercicio2.getTextoResultado());

                break;
            case 3:
                MayorMenor ejercicio3 = new MayorMenor();

                System.out.print("Ingresa el primer numero: ");
                ejercicio3.setNumero1(read.nextDouble());

                System.out.print("Ingresa el segundo numero: ");
                ejercicio3.setNumero2(read.nextDouble());

                System.out.println("El mayor es: " + ejercicio3.getMayor());

                ejercicio3.sumar();
                System.out.println("Suma: " + ejercicio3.getResultado());

                ejercicio3.restar();
                System.out.println("Resta: " + ejercicio3.getResultado());

                ejercicio3.multiplicar();
                System.out.println("Multiplicacion: " + ejercicio3.getResultado());

                ejercicio3.dividir();
                System.out.println("Division: " + ejercicio3.getResultado());

                break;
            default:
                System.out.println("Opcion no valida...");
        }

    }

}
