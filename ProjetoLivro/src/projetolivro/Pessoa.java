package projetolivro;
public class Pessoa {
    //ATRIBUTOS
    private String nome;
    private int idade;
    private String sexo;
    
    //CONSTRUTOR
    public Pessoa(String nome, int idade, String sexo){
        this.setNome(nome);
        this.setIdade(idade);
        this.setSexo(sexo);
    }
    
    //METODOS ESPECIAIS
    public void fazerAniver(){
        this.setIdade(this.getIdade() +1);
    }
  
    //METODOS ACESSORES
    public String getNome(){
        return this.nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public int getIdade(){
        return this.idade;
    }
    public void setIdade(int idade){
        this.idade = idade;
    }
    
    public String getSexo(){
        return this.sexo;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
}
