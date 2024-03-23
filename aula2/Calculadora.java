package aula2;

public class Calculadora {
    Double numA;
    Double numB;

    Double sum(){
        return numA + numB;
    }

    Double sub(){
        return numA - numB;
    }

    Double mult(){
        return numA * numB;
    }

    Double div(){
        return numA / numB;
    }

    boolean verificarNumPrimo(int n){
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i < Math.sqrt(n) + 1; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
