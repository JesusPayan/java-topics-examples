package Ejercicios;

public class MayorMenor extends Operaciones {

    public double getMayor(){
        if(this.numero1 > this.numero2){
            return numero1;
        } else{
            return numero2;
        }
    }

}
