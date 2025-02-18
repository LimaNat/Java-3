public class mainCliente {
    public static void main(String[] args) {
        //cliente 1
        cliente cliente1 = new cliente(null, null, 0);

        cliente1.setNome("Marta");
        cliente1.setEmail("marta@gmail.com");
        cliente1.setSenha(123);

        System.out.println("Nome: " + cliente1.getNome());
        System.out.println("Email: " + cliente1.getEmail());
        System.out.println("Senha: " + cliente1.getSenha());

        //cliente 2
        cliente cliente2 = new cliente("José", "jose@gmail.com", 1234);
        System.out.println(cliente2.toString());

        //cliente 3
        cliente cliente3 = new cliente("clotilde", "clotilde@gamil.com", 12345);
        System.out.println(cliente3.toString());

    }

}
