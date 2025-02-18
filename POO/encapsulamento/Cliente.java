public class cliente {
    // nome, email e senha
    private String nome;
    private String email;
    private int senha;
    
    public Cliente(String nome, String email, int senha) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public int getSenha() {
        return senha;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setSenha(int senha) {
        this.senha = senha;
        
    }

    @Override
    public String toString() {
        return "cliente [nome=" + nome + ", email=" + email + ", senha=" + senha + "]";
    }
}
