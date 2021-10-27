package universidade;
public class UniversidadeInterior extends UniversidadeSede {
    private float lucro;

    public UniversidadeInterior(String nome, String localizacao,float lucro) {
        super(nome, localizacao);
        this.lucro = lucro;
    }
    
    
   

    public float getLucro() {
        return lucro;
    }

    public void setLucro(float lucro) {
        this.lucro = lucro;
    }

    public String toString() {
        return (super.toString() + "Lucro: "+ lucro );
    }
    
    
    
}
