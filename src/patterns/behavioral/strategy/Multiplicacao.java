package patterns.behavioral.strategy;

public class Multiplicacao implements Operacao {
    @Override
    public double calcular(double a, double b) {
        return a * b;
    }
}
