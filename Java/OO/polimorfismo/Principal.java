package exercicio.polimorfismo;

public class Principal {

    public static void calculaOperacao(OperacaoMatematica o, double x, double y){
        System.out.println(o.calcular(x,y));
    }

    public static void main(String[] args) {
        calculaOperacao(new Soma(), 10, 1000);
        calculaOperacao(new Multiplicacao(), 5, 25);
        calculaOperacao(new Divisao(), 100, 25);
        calculaOperacao(new Subtracao(), 40, 25);
    }
}
