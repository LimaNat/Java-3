package com.mycompany.atv5;

import java.util.ArrayList;
import java.util.Scanner;

public class atv10 {
    public static void main(String[] args) {
        
        Scanner ler = new Scanner (System.in);
        ArrayList<Double> notas = new ArrayList<> ();
        String resposta;
        
        do {
            System.out.println("Digite uma nota: ");
            notas.add(ler.nextDouble());
            
            System.out.println("Deseja inserir mais uma nota? ");
            System.out.println("\nPressione a tecla N para sair.");
            resposta = ler.next();
        } while(!resposta.equalsIgnoreCase("n"));
        
            System.out.println("Exibindo as notas: ");
            for (double nota: notas) {
                System.out.println("Notas: " + nota);
            }
    }
    
}
