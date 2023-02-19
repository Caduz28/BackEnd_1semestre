public class Pessoa {
    //atributo encapsulados
    private int idade;
    private String nome;
    //construtores sobrecarregados
    public Pessoa () {}
    public Pessoa(String nome){
        this.setNome(nome);
    }
    public Pessoa (int idade, String nome) {
        this.setIdade (idade);
        this.setNome (nome);
    }
    //modificadores
    public void setIdade (int idade) {
        this.idade = idade;
    }
    public void setNome (String nome) {
        this.nome = nome;
    }
    //metodo de acesso
    public int getIdade() {
        return this.idade;
    }
    public String getNome() {
        return this.nome; 
    }
    //sobrescrever (redefinir) o método toString
    @Override
    public String toString () {
        return "nome: " + this.nome + "\nidade: " + this.idade;
    }
}