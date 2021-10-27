package polimorfismo01;
public class Ave extends Animal {
    //Atributos Ave
    private String corPena;
    
    //Metodos Ave
    public void fazerNinho(){
        System.out.println("Construir ninho");
}
    
    @Override
    public void locomover() {
        System.out.println("Voando");
    }

    @Override
    public void alimentar() {
        System.out.println("Bicando");
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de ave");
    }

    public String getCorPena() {
        return corPena;
    }

    public void setCorPena(String corPena) {
        this.corPena = corPena;
    }
    
    
}
