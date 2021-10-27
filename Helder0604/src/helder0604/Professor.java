package helder0604;
public class Professor extends Pessoa {
    private int salario; 

    public Professor(String nome,int cpf, int matricula,int salario) {
        super(nome, cpf, matricula);
        this.salario = salario;
    }
    
    public Professor(String nome,int cpf, int matricula) {
        super(nome, cpf, matricula);
        
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }
    
}
