import java.util.Random;

public class SubtracaoNumeroAleatorio {
    Calculadora calc = new Calculadora();
    Random gerador = new Random();
    double numero1 = gerador.nextInt(100);
    double numero2 = gerador.nextInt(100);

    public void imprimirSubtracao(double numero1, double numero2) {
        System.out.println(
                "O resultado da subtracao de " + numero1 + " e " + numero2 + "é: " + calc.Subtracao(numero1, numero2));
    }
}
