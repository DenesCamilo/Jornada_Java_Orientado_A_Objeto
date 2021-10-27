package polimorfismo01;
public class Polimorfismo01 {
    public static void main(String[] args) {
        // TODO code application logic here
        //Animal n = new Animal();
        Mamifero m = new Mamifero();
        Reptil r = new Reptil();
        Peixe p = new Peixe();
        Ave a = new Ave();
       
        m.locomover();
        p.locomover();
        a.locomover();
        r.locomover();
    }
       
}