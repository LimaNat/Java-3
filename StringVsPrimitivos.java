package com.mycompany.aula3;

public class StringVsPrimitivos {
    public static void main(String[] args) {
        // Declaração de variaveis
        String nomeUsuario = "Marta";
        int senha = 123;
        
        // Comparação de Strings e inteiros
        boolean resultadoNome = nomeUsuario.equals("Marta");
        boolean resultadoSenha = (senha ==123);
        
        // Exibindo resultados
        System.out.println("O nome do usuario está correto? " + resultadoNome);
        System.out.println("A senha está correta? " + resultadoSenha);
    }
}
