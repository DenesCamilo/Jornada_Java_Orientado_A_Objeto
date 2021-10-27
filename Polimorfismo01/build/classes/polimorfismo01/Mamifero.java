package polimorfismo01;
public class Mamifero extends Animal{
    //Atributos de Mamifero
    private String corPelo;
    
    //Metodos de Mamifero
    @Override
    public void locomover() {
        System.out.println("Correndo!!!");
    }

    @Override
    public void alimentar() {
        System.out.println("Alimentando...");
    }

    @Override
    public void emitirSom() {
        System.out.println("Emitindo som de Mamifero");
    }
    
    //Metodos acessores
    public String getCorPelo() {
        return corPelo;
    }

    public void setCorPelo(String corPelo) {
        this.corPelo = corPelo;
    }
    
}
