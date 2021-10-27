package aula010a;
public class Pessoa {
    //Atributos 
    private String nome;
    private int idade;
    private String sexo;
    
    //Metodo construtor
    public Pessoa(){
        
    }
    
    //Metodos especiais
    public void fazerAniv(){
        this.setIdade(this.getIdade() + 1);
        System.out.println("Parabéns!!! Você fez aniversário <3 (. Y .) ");
    }
    //Metodos acessores 

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return "Pessoa{" + "nome=" + this.getNome() + ", idade=" + this.getIdade()
                + ", sexo=" + this.getSexo() + '}';
    }
    
    
}
