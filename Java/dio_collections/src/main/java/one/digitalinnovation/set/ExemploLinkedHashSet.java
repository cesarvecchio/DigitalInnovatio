package one.digitalinnovation.set;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class ExemploLinkedHashSet {
    public static void main(String[] args){

        // Matem a  ordem de inserção
        LinkedHashSet<Integer> sequenciaNumerica = new LinkedHashSet<>();

        // Adiciona numeros no set
        sequenciaNumerica.add(1);
        sequenciaNumerica.add(2);
        sequenciaNumerica.add(4);
        sequenciaNumerica.add(8);
        sequenciaNumerica.add(16);
        System.out.println(sequenciaNumerica);

        // Remove o número do set
        sequenciaNumerica.remove(4);
        System.out.println(sequenciaNumerica);

        // Retorna a quantidae e itens do set
        System.out.println(sequenciaNumerica.size());

        // Navega em todos os itens do iterator
        Iterator<Integer> iterator = sequenciaNumerica.iterator();

        while(iterator.hasNext()){
            System.out.println("-->" + iterator.next());
        }

        for(Integer numero: sequenciaNumerica){
            System.out.println(numero);
        }

        // Retorna se o set está vazio ou não
        System.out.println(sequenciaNumerica.isEmpty());

    }
}
