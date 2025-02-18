public class CB {
    private String banco;
    private String agencia;
    private int nConta;
    private String tipoConta;
    private String saldo;
    private String limite;
    
    public CB(String banco, String agencia, int nConta, String tipoConta, String saldo, String limite) {
        this.banco = banco;
        this.agencia = agencia;
        this.nConta = nConta;
        this.tipoConta = tipoConta;
        this.saldo = saldo;
        this.limite = limite;
    }
    public String getBanco() {
        return banco;
    }
    public void setBanco(String banco) {
        this.banco = banco;
    }
    public String getAgencia() {
        return agencia;
    }
    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }
    public int getnConta() {
        return nConta;
    }
    public void setnConta(int nConta) {
        this.nConta = nConta;
    }
    public String getTipoConta() {
        return tipoConta;
    }
    public void setTipoConta(String tipoConta) {
        this.tipoConta = tipoConta;
    }
    public String getSaldo() {
        return saldo;
    }
    public void setSaldo(String saldo) {
        this.saldo = saldo;
    }
    public String getLimite() {
        return limite;
    }
    public void setLimite(String limite) {
        this.limite = limite;
    }
    @Override
    public String toString() {
        return "CB [banco=" + banco + ", agencia=" + agencia + ", nConta=" + nConta + ", tipoConta=" + tipoConta
                + ", saldo=" + saldo + ", limite=" + limite + "]";
    }
    

}