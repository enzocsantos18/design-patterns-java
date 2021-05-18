package patterns.behavioral.strategy;

public class TesteStrategy {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora(new Soma());
        double soma = calculadora.calcular(1, 5);
        System.out.println("A soma é: " + soma);

        Calculadora calculadoraMultiplicacao = new Calculadora(new Multiplicacao());
        double multiplicacao = calculadoraMultiplicacao.calcular(1, 5);
        System.out.println("A multiplicacao é: " + multiplicacao);

        Calculadora calculadoraDivisao = new Calculadora(new Divisao());
        double divisao = calculadoraDivisao.calcular(1, 5);
        System.out.println("A divisão é: " + divisao);
    }
}
