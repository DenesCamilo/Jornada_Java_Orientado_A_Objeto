package aula010a;
public class Aula010A {
    public static void main(String[] args) {
        // TODO code application logic here
        Pessoa p1 = new Pessoa();
        Aluno a1 = new Aluno();
        Professor p2 = new Professor();
        Funcionario f1 = new Funcionario();
        
        p1.setNome("Pedro");
        a1.setNome("Maria");
        p2.setNome("Cacau");
        f1.setNome("Mary");
        a1.setCurso("ADS");
        p2.setSalario(2500.75f);
        f1.setSetor("Estoque");
        
        p2.status();
        
        p2.receberAumento(500.2f);
        
        p2.status();
        
        System.out.println(p2.toString());
        
        a1.cancelarMatr();
        
        System.out.println(a1.toString());
    }
    
}
