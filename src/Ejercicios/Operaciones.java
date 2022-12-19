package Ejercicios;

public class Operaciones {

    protected double numero1;
    protected double numero2;
    protected double resultado;

    public Operaciones() {

    }

    public double getResultado() {
        return resultado;
    }

    public double getNumero1() {
        return numero1;
    }

    public void setNumero1(double numero1) {
        this.numero1 = numero1;
    }

    public double getNumero2() {
        return numero2;
    }

    public void setNumero2(double numero2) {
        this.numero2 = numero2;
    }

    public void sumar(){
        this.resultado = numero1 + numero2;
    }

    public void restar(){
        this.resultado = numero1 - numero2;
    }

    public void multiplicar(){
        this.resultado = numero1 * numero2;
    }

    public void dividir(){
        if(numero2 == 0){
            this.resultado = 0;
        } else{
            this.resultado = numero1 / numero2;
        }
    }

}
