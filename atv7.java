package com.mycompany.atv5;

import java.util.Scanner;

public class atv7 {
public static void main(String[] args) {
        
    Scanner ler = new Scanner(System.in);
    
    System.out.println("Digite o nome do aluno: ");
    String nome = ler.nextLine();
    
    double nota1, nota2;
    do {    
    System.out.println("Digite a 1º nota: ");
    nota1 = ler.nextDouble();
    } while (nota1 < 0 || nota1 > 10 );
    
    do {
    System.out.println("Digite a 2º nota: ");
    nota2 = ler.nextDouble();
    } while (nota2 < 0 || nota2 > 10);    
    
    
    double media = (nota1 + nota2) / 2;
    
   
    
    System.out.println ("Nome do aluno: " + nome);
    System.out.println ("1º nota: " + nota1);
    System.out.println ("2º nota:" + nota2);
    System.out.println ("Média: " + media);
    
    if (media < 7) {
        System.out.println("Reprovado!");
    } else if (media > 5){
        System.out.println("Aprovado!");
    }else {
        System.out.println("Recuperação!");
    }
    }
}