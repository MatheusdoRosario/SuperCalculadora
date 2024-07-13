public class Operacoes {

    private double n1 = 0;
    private double n2 = 0;
    private double resultado = 0;
    private char operador = ' ';

    public void setValor(String v1, String v2, char op) {
        n1 = Double.parseDouble(v1);
        n2 = Double.parseDouble(v2);
        operador = op;

        if (operador == '+') {
            setResultado(n1 + n2);
        } else if (operador == '-') {
            setResultado(n1 - n2);
        } else if (operador == '*') {
            setResultado(n1 * n2);
        } else if (operador == '/') {
            setResultado(n1 / n2);
        } else if (operador == '%') {
            setResultado((n1 * n2) / 100);
        }
    }

    public void setResultado(double resultado) {
        this.resultado = resultado;
    }

    public double getResultado() {
        return resultado;
        
    }

}
