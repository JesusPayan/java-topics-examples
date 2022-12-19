package Ejercicios;

public class VoltearString {

    private String textoInicial;
    private String textoResultado;

    public VoltearString() {

    }

    public void setTextoInicial(String textoInicial) {
        this.textoInicial = textoInicial;
    }

    public String getTextoResultado() {
        return textoResultado;
    }

    public void voltearString(){

        String []textoSplit = this.textoInicial.split("-");
        StringBuilder strBuilder = new StringBuilder();

        for (int i = textoSplit.length - 1; i >= 0; i--) {
            strBuilder.append(textoSplit[i]);
            strBuilder.append(" ");
        }
        this.textoResultado = strBuilder.toString().trim();

    }

}
