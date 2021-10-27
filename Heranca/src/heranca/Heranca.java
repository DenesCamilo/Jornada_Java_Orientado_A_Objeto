package heranca;
public class Heranca {
    public static void main(String[] args) {
        // TODO code application logic here
        Vizitante v1 = new Vizitante();

        v1.setNome("animal");
        
        System.out.println(v1.toString());
        
        Bolsista b1 = new Bolsista();
        
        b1.setNome("DENES");
        
        System.out.println(b1.toString());
        
        b1.pagarMensalidade();
        
    }
    
}
