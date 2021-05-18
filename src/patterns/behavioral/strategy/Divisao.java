package patterns.behavioral.strategy;

public class Divisao implements Operacao{
    @Override
    public double calcular(double a, double b) {
        return a / b;
    }
}
