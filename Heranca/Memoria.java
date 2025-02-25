public class Memoria {
    private String marca;
    private String modelo;
    private String armazenamento;
    
    public Memoria(String marca, String modelo, String armazenamento) {
        this.marca = marca;
        this.modelo = modelo;
        this.armazenamento = armazenamento;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getArmazenamento() {
        return armazenamento;
    }

    public void setArmazenamento(String armazenamento) {
        this.armazenamento = armazenamento;
    }

    @Override
    public String toString() {
        return "Memoria [marca=" + marca + ", modelo=" + modelo + ", armazenamento=" + armazenamento + "]";
    }

}
