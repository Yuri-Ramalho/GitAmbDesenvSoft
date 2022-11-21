import java.util.Random;

public class ExponencialNumeroAleatorio {
    Calculadora calc = new Calculadora();
    Random gerador = new Random();
    double numero1 = gerador.nextInt(100);
    double numero2 = gerador.nextInt(100);

    public void imprimirMultiplicacao(double numero1, double numero2) {
        System.out.println(
                "O resultado do exponencial de " + numero1 + " por " + numero2 + "é: "
                        + calc.Exponencial(numero1, numero2));
    }
}