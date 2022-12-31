package main.java.org.numeros;
//Clase para crear función que invierte palabras en una cadena
public class Cadenas {
    static String invertirCadenas(String cadena){
        String[] parts = cadena.split(" ");
        StringBuilder invertedString = new StringBuilder();
        for(int x = parts.length - 1; x > -1; x--)
            invertedString.append(parts[x]).append(" ");
        return invertedString.toString();
    }
}
