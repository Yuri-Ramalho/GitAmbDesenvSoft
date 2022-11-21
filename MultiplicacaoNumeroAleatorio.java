import java.util.Random;

public class MultiplicacaoNumeroAleatorio {
    Calculadora calc = new Calculadora();
    Random gerador = new Random();
    double numero1 = gerador.nextInt(100);
    double numero2 = gerador.nextInt(100);

    public void imprimirMultiplicacao(double numero1, double numero2) {
        System.out.println(
                "O resultado da multiplicação de " + numero1 + " e " + numero2 + "é: "
                        + calc.Multiplicacao(numero1, numero2));
    }
}
