package helder0604;
public abstract class Pessoa {
    private String nome;
    private int cpf;
    private int matricula;

    public Pessoa(String nome, int cpf, int matricula) {
        this.nome = nome;
        this.cpf = cpf;
        this.matricula = matricula;
    }
    
    public void dados(){
        System.out.println("O cpf de " + this.getNome() + " é " + this.getCpf());
        System.out.println("E o numéro de matricula de " + this.getNome() + " é " + this.getMatricula()+ "\n");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
    
    
    
}
