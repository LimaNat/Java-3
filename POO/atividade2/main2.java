public class main2 {
    public static void main(String[] args) {
        Endereco endereco1 = new Endereco("Rua B", 6, "Salvador");
        Cliente3 cliente1 = new Cliente3("Livia", 28, endereco1);

        System.out.println(cliente1.toString());
    }

}  
