public class main3 {
    public static void main(String[] args) {
        Pet pet1 = new Pet("Tubarão", 16, "pitbull");
        Cliente4 cliente1 = new Cliente4("Bené", 68, pet1);

        System.out.println(cliente1.toString());
    }
}
