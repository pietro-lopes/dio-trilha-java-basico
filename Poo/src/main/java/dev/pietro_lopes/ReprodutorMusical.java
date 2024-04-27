package dev.pietro_lopes;

public interface ReprodutorMusical {
    default void tocar(){
        System.out.println("Tocando uma música...");
    }
    default void pausar(){
        System.out.println("Pausando música...");
    }
    default void selecionarMusica(){
        System.out.println("Selecionando música...");
    }
}
