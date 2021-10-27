package polimorfismo01;
public class Peixe extends Animal {
    //Atributos Peixe
    private String corEscama;
    
    //Metodos Peixe
    public void soltarBolha(){
        System.out.println("Peixe soltando bolhas ºººººº");
    }
    
    @Override
    public void locomover() {
        System.out.println("Nadando");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo substancias");
    }

    @Override
    public void emitirSom() {
        System.out.println("BLUP BLUP GLUP ");
    }
    
    //Metodos acessores

    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }
    
}
