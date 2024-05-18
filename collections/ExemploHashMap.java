package collections;

import java.util.HashMap;

public class ExemploHashMap {

    public static void main(String[] args) {

        HashMap<String, String> capitais = new HashMap<>();

        capitais.put("SP", "São Paulo");
        capitais.put("RJ", "Rio de Janeiro");
        capitais.put("MG", "Belo Horizonte");
        capitais.put("RS", "Porto Alegre");
        capitais.put("PR", "Curitiba");
        capitais.put("SC", "Florianópolis");
        capitais.put("BA", "Salvador");
        capitais.put("PE", "Recife");
        capitais.put("CE", "Fortaleza");
        capitais.put("PB", "João Pessoa");
        capitais.put("RN", "Natal");
        capitais.put("MA", "São Luís");
        capitais.put("PI", "Teresina");

        System.out.println(capitais.get("CE"));

        if (capitais.containsKey("MG")) {
            System.out.println("Minas Gerais está no HashMap");
        }

        for (String chave : capitais.keySet()) {
            System.out.println(chave + " - " + capitais.get(chave));
        }

    }

}
