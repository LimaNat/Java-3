public class Cliente2 {
    private String nome;
    private String email;
    private String cpf;
    private String endereco;
    private String telefone;

    public Cliente2(String nome, String email, String cpf, String endereco, String telefone) {
        this.nome = nome;
        this.email = email;
        this.cpf = cpf;
        this.endereco = endereco;
        this.telefone = telefone;
    }
    public String getNome() {
        return nome;
    }
    public String getEmail() {
        return email;
    }
    public String getCpf() {
        return cpf;
    }
    public String getEndereco() {
        return endereco;
    }
    public String getTelefone() {
        return telefone;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    @Override
    public String toString() {
        return "\nNome: " + nome + "\nE-mail: " + email + "\nCPF: " + cpf + "\nEndereço: " + endereco + "\nTel: "
                + telefone;
    }
    

}
