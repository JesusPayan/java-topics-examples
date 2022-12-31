package main.java.org.numeros;

public class Numeros {


    static Double sumar(Double primerNumero, Double segundoNumero) { return primerNumero + segundoNumero; }
    public static Double restar(Double primerNumero, Double segundoNumero){
        return primerNumero - segundoNumero;
    }

    public static Double multiplicar(Double primerNumero, Double segundoNumero){
        return primerNumero * segundoNumero;
    }

    public static Double dividir(Double primerNumero, Double segundoNumero){
        return primerNumero / segundoNumero;
    }

    public static Double numeroMayor(Double primerNumero, Double segundoNumero){
        return primerNumero > segundoNumero ? primerNumero : segundoNumero;
    }

}
