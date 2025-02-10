
import java.util.Scanner;

public class atv2 {
public static void main(String[] args) {
        
    Scanner scanner = new Scanner(System.in);
    
    System.out.println("Digite o nome do aluno: ");
    String nome = scanner.nextLine();
    
    System.out.println("Digite a 1º nota: ");
    double nota1 = scanner.nextDouble();
    
    System.out.println("Digite a 2º nota: ");
    double nota2 = scanner.nextDouble();
    
    double media = (nota1 + nota2) / 2;
    
   
    
    System.out.println ("Nome do aluno: " + nome);
    System.out.println ("1º nota: " + nota1);
    System.out.println ("2º nota:" + nota2);
    System.out.println ("Média: " + media);
   
    
    if (media < 7) {
        System.out.println("Reprovado!");
    } else {
        System.out.println("Aprovado!");
    }
    }
}
