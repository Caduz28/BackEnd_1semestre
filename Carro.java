public class Carro {
    //variaveis de instancia = atributos
    private String placa;
    private String modelo;
    private int anoFabricacao;

    //contruções com sobrecarga
    public Carro (String placa, String modelo, int anoFabricacao) {
        this.placa = placa;
        this.modelo = modelo;
        this.anoFabricacao = anoFabricacao;
    }
    public Carro (String placa, int anoFabricacao){
        this.placa = placa;
        this.anoFabricacao = anoFabricacao;

    }
    public Carro (String placa, String modelo){
        this.placa = placa;
        this.modelo = modelo;
    }
    public Carro (String placa){
        this.placa = placa;
    }

    //métodos de acesso = getters
    public String getPlaca () {
        return this.placa;
    }
    public String getModelo () {
        return this.modelo;
    }
    public int getAnoFabricacao () {
        return this.anoFabricacao;
    }
    //redefinir o construtor padrão:
    public Carro(){}

    //métodos modificadores = setters
    public void setPlaca (String placa) {
        this.placa = placa;
    }
    public  void setModelo (String modelo){
        this.modelo = modelo;
    }
    public void setAnoFabricacao (int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }
}