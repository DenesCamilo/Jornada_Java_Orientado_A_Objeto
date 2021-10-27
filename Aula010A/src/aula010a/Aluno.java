  package aula010a;
public class Aluno extends Pessoa {
     private int matricula;
     private String curso;
     
     
     public void cancelarMatr(){
         this.setMatricula(0);
         this.setCurso(null);
         System.out.println(this.getMatricula() + this.getCurso());
         System.out.println("MAtricula cancelada #######Lumena Aproves");
     }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
     
}
