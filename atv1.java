import java.util.Scanner;

public class atv1 {

public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
        
    System.out.println("Digite o valor do produto: ");
    double valor = scanner.nextDouble();
        
    double parcela = valor / 5;
        
    System.out.println("Mamão com açucar");
    System.out.println("Valor total da compra: " + valor);
    System.out.println("Prestações: " + parcela);
        
        
    }
}
