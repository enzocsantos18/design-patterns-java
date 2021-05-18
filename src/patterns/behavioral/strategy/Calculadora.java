package patterns.behavioral.strategy;

public class Calculadora {


    public Operacao operacao;

    public Calculadora(Operacao operacao) {
        this.operacao = operacao;
    }

    public double calcular(double a, double b){
       return operacao.calcular(a, b);
    }
}


