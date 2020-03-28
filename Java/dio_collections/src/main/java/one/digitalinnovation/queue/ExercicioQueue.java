package one.digitalinnovation.queue;

import java.util.LinkedList;
import java.util.Queue;

public class ExercicioQueue {
    public static void main(String[] args){
        Queue<String> listaClientes = new LinkedList<>();

        listaClientes.add("Juliana");
        listaClientes.add("Pedro");
        listaClientes.add("Carlos");
        listaClientes.add("Larissa");
        listaClientes.add("João");

        for(String cliente: listaClientes){
            System.out.println("-->" + cliente);
        }

        System.out.println(listaClientes.peek());

        System.out.println(listaClientes.poll());

        listaClientes.add("Daniel");
        System.out.println(listaClientes);

        System.out.println(listaClientes.size());

        System.out.println(listaClientes.isEmpty());

        System.out.println(listaClientes.contains("Carlos"));


    }
}
