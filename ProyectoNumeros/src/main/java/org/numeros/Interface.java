package main.java.org.numeros;

import java.io.IOException;
import java.util.Scanner;

public class Interface {

    public static void main(String[] args) {
        System.out.println("Inicio de la aplicación");

        //Declaración de variables
        int selectedOptionMain, operationSelected;
        double firstNum, secondNum;
        String frase;
        Scanner input = new Scanner(System.in);
        Scanner stringInput = new Scanner(System.in);
        boolean cycle = true;
        //Variable para pausar la aplicación después de tener el resultado
        int suspended;

        //Inicio del ciclo
        while (cycle) {
            System.out.println("***************************************");
            System.out.println("**  Seleccione lo que desea realizar **");
            System.out.println("***************************************\n");
            System.out.println("1 - Operaciones sencillas");
            System.out.println("2 - Inversor de Cadenas de texto");
            System.out.println("3 - Todas las operaciones");
            System.out.println("4 - Cerrar la aplicación \n");
            //Selección de la acción a realizar
            selectedOptionMain = input.nextInt();


            switch (selectedOptionMain) {
                case (1) -> {
                    //Obtención de valores para realizar operaciones
                    System.out.println("Ingrese el primer valor");
                    firstNum = input.nextDouble();
                    System.out.println("Ingrese el segundo valor");
                    secondNum = input.nextDouble();
                    System.out.println("Indique la operación a realizar:\n");
                    System.out.println("1 - Suma");
                    System.out.println("2 - Resta");
                    System.out.println("3 - Multiplicación");
                    System.out.println("4 - Division\n");
                    operationSelected = input.nextInt();
                    switch (operationSelected) {
                        case (1) ->
                                System.out.println("La suma de " + firstNum + " y " + secondNum + " es " + Numeros.sumar(firstNum, secondNum));
                        case (2) ->
                                System.out.println("La resta de " + firstNum + " y " + secondNum + " es " + Numeros.restar(firstNum, secondNum));
                        case (3) ->
                                System.out.println("El producto de " + firstNum + " y " + secondNum + " es " + Numeros.multiplicar(firstNum, secondNum));
                        case (4) ->
                                System.out.println("El cociente de " + firstNum + " entre " + secondNum + " es " + Numeros.dividir(firstNum, secondNum));
                        default -> System.out.println("La opción elegida no es válida");
                    }
                }
                case (2) -> {
                    System.out.println("Inversion de Cadenas de Texto" +
                            "   ********************\n");
                    System.out.println("Introduzca el texto que desea invertir:");
                    frase = "";
                    frase = stringInput.nextLine();
                    System.out.println("La cadena invertida de la frase '" + frase + "' es:");
                    System.out.println(Cadenas.invertirCadenas(frase));
                }
                case (3) -> {
                    System.out.println("Ingrese el primer valor");
                    firstNum = input.nextDouble();
                    System.out.println("Ingrese el segundo valor");
                    secondNum = input.nextDouble();
                    System.out.println("La suma de " + firstNum + " y " + secondNum + " es " + Numeros.sumar(firstNum, secondNum));
                    System.out.println("La resta de " + firstNum + " y " + secondNum + " es " + Numeros.restar(firstNum, secondNum));
                    System.out.println("El producto de " + firstNum + " y " + secondNum + " es " + Numeros.multiplicar(firstNum, secondNum));
                    System.out.println("El cociente de " + firstNum + " entre " + secondNum + " es " + Numeros.dividir(firstNum, secondNum));
                    System.out.println("El mayor valor entre " + firstNum + " y " + secondNum + " es " + Numeros.numeroMayor(firstNum, secondNum));
                }
                case (4) -> cycle = false;
                default -> System.out.println("No eligió una opción válida");
            }
            if(cycle){
                System.out.println("\nPresione enter para continuar");
                try {
                    suspended = System.in.read();
                } catch(IOException e) {
                    System.out.println("Error reading from user");
                }
            }
        }
        System.out.println("Saliendo de la aplicación");
    }
}


