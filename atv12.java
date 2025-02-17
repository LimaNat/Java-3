package com.mycompany.aula3;

import java.util.Scanner;

public class atv12 {
    public static void main(String[] args) {   
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Digite o login: ");
        String login = ler.nextLine();
        
        System.out.println("Digte a senha: ");
        int senha = ler.nextInt();
        
        boolean resultadoLogin = login.equals("Marta");
        boolean resultadoSenha = (senha ==123);
        
        if (resultadoLogin && resultadoSenha) {
            System.out.println("Bem-vindo, usuario logado!");
        } else {
            System.out.println("Usuario ou senha invalidos!");
        }
    }
}