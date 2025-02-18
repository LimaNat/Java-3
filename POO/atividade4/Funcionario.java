public class Funcionario {
    private String codigo;
    private String nome;
    private String endereco;
    private String telefone;
    private String email;
    private CB contaBanco;
    
    public Funcionario(String codigo, String nome, String endereco, String telefone, String email, CB contaBanco) {
        this.codigo = codigo;
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.email = email;
        this.contaBanco = contaBanco;
    }
    public String getCodigo() {
        return codigo;
    }
    public String getNome() {
        return nome;
    }
    public String getEndereco() {
        return endereco;
    }
    public String getTelefone() {
        return telefone;
    }
    public String getEmail() {
        return email;
    }
    public CB getContaBanco() {
        return contaBanco;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setContaBanco(CB contaBanco) {
        this.contaBanco = contaBanco;
    }
    @Override
    public String toString() {
        return "Funcionario [codigo=" + codigo + ", nome=" + nome + ", endereco=" + endereco + ", telefone=" + telefone
                + ", email=" + email + ", contaBanco=" + contaBanco + "]";
    }


}