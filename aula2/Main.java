package aula2;

public class Main {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        calc.numA = 2.0;
        calc.numB = 3.0;
        System.out.println("Soma: " + calc.sum());
        System.out.println("Subtração: " + calc.sub());
        System.out.println("Multiplicação: " + calc.mult());
        System.out.println("Divisão: " + calc.div());
        System.out.println("0: " + calc.verificarNumPrimo(0));
        System.out.println("1: " + calc.verificarNumPrimo(1));
    
    }
}