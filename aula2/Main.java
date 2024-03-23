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
        System.out.println("2: " + calc.verificarNumPrimo(2));
        System.out.println("3: " + calc.verificarNumPrimo(3));
        System.out.println("7: " + calc.verificarNumPrimo(7));
        System.out.println("83: " + calc.verificarNumPrimo(83));
        System.out.println("100: " + calc.verificarNumPrimo(100));
        System.out.println("991: " + calc.verificarNumPrimo(991));
        System.out.println("104729: " + calc.verificarNumPrimo(104729));
        System.out.println("14348907: " + calc.verificarNumPrimo(14348907));
    
    }
}