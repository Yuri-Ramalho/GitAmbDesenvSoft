import java.util.Random;

public class RaizQuadradaNumeroAleatorio {
    Calculadora calc = new Calculadora();
    Random gerador = new Random();
    double numero1 = gerador.nextInt(100);

    public void imprimirRaizQuadrada(double numero1) {
        System.out.println(
                "O resultado da raiz quadrada de " + numero1 + "é: "
                        + calc.RaizQuadrada(numero1));
    }
}