package polimorfismo02;
public class Mamifero extends Animal{
    //Atributos
    protected String corPelo;
    
    
    
    @Override
    public void emitirSom() {
        System.out.println("Som de Mamifero");    }
    
}
