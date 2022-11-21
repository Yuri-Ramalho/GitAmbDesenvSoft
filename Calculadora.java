public class Calculadora {

    public double Soma(double n1, double n2) {
        return n1 + n2;
    }

    public double Subtracao(double n1, double n2) {
        return n1 - n2;
    }

    public double Multiplicacao(double n1, double n2) {
        return n1 * n2;
    }

    public double Divisao(double n1, double n2) {
        return n1 / n2;
    }

    public double RaizQuadrada(double n1) {
        return Math.sqrt(n1);
    }

    public double Exponencial(double n1, double n2) {
        return Math.pow(n1, n2);
    }

    public double Teto(double n1) {
        return Math.ceil(n1);
    }

    public double Piso(double n1) {
        return Math.floor(n1);
    }
}
