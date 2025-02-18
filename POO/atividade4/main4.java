public class main4 {
    public static void main(String[] args) {

        CB contaBanco1 = new CB("Bradesco", "Lapa", 1645, "fisica", "5000", "9000");
        // CB contaBanco1 = new CB("Bradesco", "Lapa", "9876", "fisica", "5000", "9000");
        Funcionario funcionario1 = new Funcionario("1543", "Cristina", "salvador", "716548952", "cristina@gmail.com", contaBanco1);

        System.out.println(funcionario1.toString());
    }

}
