package universidade;
public abstract class UniversidadeSede {
    private String nome;
    private String localizacao;

    public UniversidadeSede(String nome, String localizacao) {
        this.nome = nome;
        this.localizacao = localizacao;
    }
    
    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    
    public String toString() {
        return ("\n" + "Nome:" + nome + ", Localizacao: " + localizacao );
    }
    
    
}
