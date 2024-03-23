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
        
        if(n <= 1){
            return false;
        }

        if ( (n != 2) && (n % 2 == 0) ){

            return false; 
        }

        for(int i = 3; i < n; i+=2){
            if(n % i == 0){
                return false; 
            }
        }

        return true;

    }
}