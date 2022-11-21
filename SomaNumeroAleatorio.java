import java.util.Random;

public class SomaNumeroAleatorio {
    Calculadora calc = new Calculadora();
    Random gerador = new Random();
    double numero1 = gerador.nextInt(100);
    double numero2 = gerador.nextInt(100);

    public void imprimirSoma(double numero1, double numero2) {
        System.out.println("O resultado da soma de " + numero1 + " e " + numero2 + "é: " + calc.Soma(numero1, numero2));
    }
}