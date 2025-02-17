package com.mycompany.aula3;

public class atv11 {
    public static void main(String[] args) {
        
        String nome = "Marta";
        String sobrenome = "Silveira";
        
        // Exibindo a quantidade de caracteres
        System.out.println("Tamanho do nome: " + nome.length());
        System.out.println("Tamanho do sobrenome: " + sobrenome.length());
        
        // Concatenando nome + sobrenome
        String nomeCompleto = nome.concat(" ").concat(sobrenome);
        
        // Exibindo nome completo usando metodos Strings - Maiusculas
        System.out.println("Concatenação Maiuscula: " + nomeCompleto.toUpperCase());
        
        // Exibindo nome completo usando metodos Strings - Minusculas
        System.out.println("Concatenação Minuscula: " + nomeCompleto.toLowerCase());
    }
}
