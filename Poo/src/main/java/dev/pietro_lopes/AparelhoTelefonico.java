package dev.pietro_lopes;

public interface AparelhoTelefonico {
    default void ligar(){
        System.out.println("Fazendo uma ligação...");
    }
    default void atender(){
        System.out.println("Atendendo uma ligação...");
    }
    default void iniciarCorreioVoz(){
        System.out.println("Iniciando correio de voz...");
    }
}
