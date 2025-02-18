public class veiculo {
    private String placa;
    private String cor;
    private int Npassageiros;
    private int velocidadeMx;
    private float consumo;
    public veiculo(String placa, String cor, int npassageiros, int velocidadeMx) {
        this.placa = placa;
        this.cor = cor;
        Npassageiros = npassageiros;
        this.velocidadeMx = velocidadeMx;
    }
    public String getPlaca() {
        return placa;
    }
    public String getCor() {
        return cor;
    }
    public int getNpassageiros() {
        return Npassageiros;
    }
    public int getVelocidadeMx() {
        return velocidadeMx;
    }
    public float getConsumo() {
        return consumo;
    }
    public void setPlaca(String placa) {
        this.placa = placa;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }
    public void setNpassageiros(int npassageiros) {
        Npassageiros = npassageiros;
    }
    public void setVelocidadeMx(int velocidadeMx) {
        this.velocidadeMx = velocidadeMx;
    }
    public void setConsumo(float consumo) {
        this.consumo = consumo;
    }
    @Override
    public String toString() {
        return "\nPlaca: " + placa + "\nCor: " + cor + "\nNumero de passageiros: " + Npassageiros + "\nVelocidade Máxima: "
                + velocidadeMx + "\nConsumo: " + consumo;
    }

}
