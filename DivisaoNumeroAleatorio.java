import java.util.Random;

public class DivisaoNumeroAleatorio {
    Calculadora calc = new Calculadora();
    Random gerador = new Random();
    double numero1 = gerador.nextInt(100);
    double numero2 = gerador.nextInt(100);

    public void imprimirDivisao(double numero1, double numero2) {
        System.out.println(
                "O resultado da divisão de " + numero1 + " e " + numero2 + "é: "
                        + calc.Divisao(numero1, numero2));
    }
}
