import java.util.Random;

public class TetoNumeroAleatorio {
    Calculadora calc = new Calculadora();
    Random gerador = new Random();
    double numero1 = gerador.nextFloat(100);

    public void imprimirTeto(double numero1) {
        System.out.println(
                "O resultado da multiplicação de " + numero1 + "é: "
                        + calc.Teto(numero1));
    }
}