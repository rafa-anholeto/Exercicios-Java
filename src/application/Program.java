package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {
    public static void main(String[] args){
        //Meu tipo é interface, é necessario implementar uma classe que implementa a interface, no caso o ArrayList, por ser
        //muito otimizada, pega caracteristicas do vetor e da lista
        List<String> list = new ArrayList<>();
        list.add("Maria");
        list.add("Jorge");
        list.add("Nathan");
        list.add("Alex");
        list.add("Anna");
        //Adicionar um elemento na lista
        list.add(2, "Marco");

        System.out.println(list.size());


        for(String x: list){
            System.out.println(x);
        }
        System.out.println("--------------------------------------");

        //Remover um elemento na lista
        //list.remove(1);

        //Predicado(vai me retornar em verdadeiro ou falso) -> Função lambda.
        list.removeIf(x ->x.charAt(0) == 'M');

        for(String x: list){
            System.out.println(x);
        }
        System.out.println("--------------------------------------");
        System.out.println("Index of Nathan "+ list.indexOf("Nathan"));
        //Quando não tem na lista, ele retorna -1
        System.out.println("Index of Marco "+ list.indexOf("Marco"));

        System.out.println("--------------------------------------");
        //Primeiro digito um nome novo para a list(result),depois converto a list para stream, coloco a operação lambda que eu quero.
        // Após operação lambda tem que voltar a função para list, usando o .collect(Collectors.toList());
        List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());

        for(String x: result){
            System.out.println(x);
        }

        System.out.println("--------------------------------------");
        //Essa operação retorna o primeiro nome a começar com a letra desejada
        String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
        System.out.println(name);

    }
}
