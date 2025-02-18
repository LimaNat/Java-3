public class Cliente3 {
    private String nome;
    private int idade;
    private Endereco endereco;
    
    public Cliente3(String nome, int idade, Endereco endereco) {
        this.nome = nome;
        this.idade = idade;
        this.endereco = endereco;
    }
    public String getNome() {
        return nome;
    }
    public int getIdade() {
        return idade;
    }
    public Endereco getEndereco() {
        return endereco;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
    @Override
    public String toString() {
        return "Cliente3 [nome=" + nome + ", idade=" + idade + ", endereco=" + endereco + "]";
    }

}
