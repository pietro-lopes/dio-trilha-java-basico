package dev.pietro_lopes;

public interface NavegadorDeInternet {
    default void exibirPagina(){
        System.out.println("Exibindo uma página...");
    }
    default void adicionarNovaAba(){
        System.out.println("Adicionando nova aba...");
    }
    default void atualizarPagina(){
        System.out.println("Atualizando página...");
    }
}
