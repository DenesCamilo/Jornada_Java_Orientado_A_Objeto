package universidade;
public class UniversidadePolo extends UniversidadeSede {
    private int qtealunos;

    public UniversidadePolo(String nome, String localizacao, int qtealunos) {
        super(nome, localizacao);
        this.qtealunos = qtealunos;
    }



    public int getQtealunos() {
        return qtealunos;
    }

    public void setQtealunos(int qtealunos) {
        this.qtealunos = qtealunos;
    }

    public String toString() {
        return (super.toString() + "Quantidade de alunos: "+ qtealunos  );
    }

  
    
    

    
    
}
