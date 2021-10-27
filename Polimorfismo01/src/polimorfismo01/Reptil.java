package polimorfismo01;
public class Reptil extends Animal{
    //Atributos de Reptil
    private String corEscama;
    
    //Métodos de Reptil
    @Override
    public void locomover() {
        System.out.println("Rastejando ");
        
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo Vegetais");
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de Reptil");
    }
    
    //Metodos acessores
    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }
    
}
